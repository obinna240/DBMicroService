package com.ob.dbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ob.dbservice.docs.Documents;
import com.ob.dbservice.repos.DocumentsRepository;

@RestController
@RequestMapping("/rest/db")
public class DBServiceResource {
	
	@Autowired
	DocumentsRepository repo;
	
	/**
	 * This works
	 */
	@RequestMapping("/add")
	public void createAndAddDocument()
	{
		Documents document = new Documents();
		document.setId("1");
		document.setSize("10");
		repo.addDocument(document);
	}
	
	@GetMapping("/getDoc/{id}")
	public Documents getSingleDocumentById(@PathVariable String id)
	{
		return repo.findByIdIgnoringCase(id);
		
	}
	
	@PostMapping("/addDoc")
	public void addDocument(@RequestBody final Documents document)
	{
		repo.addDocument(document);
	}
	
	@PutMapping("/{id}/updateBody")
	public void updateDocumentBody(@RequestBody final String string, @PathVariable final String id)
	{
		Documents dd = getSingleDocumentById(id);
		dd.setBody(string);
		repo.save(dd);
		
		
	}

	@PostMapping("/delete/{id}")
	public Documents delete(@PathVariable final String id)
	{
		repo.deleteDocumentById(id);
		Documents retDoc = repo.findByIdIgnoringCase(id);
		return retDoc;
	}

	@GetMapping(path="/uri/{id}")
	public String getContentURI(@PathVariable String id)
	{
		return getSingleDocumentById(id).getFullPath();
	
	}
	
}
