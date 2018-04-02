package com.ob.dbservice.repos;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.ob.dbservice.docs.Documents;


/**
 * 
 * @author oonyimadu
 *
 */
@Repository
public class DocumentsRepositoryImpl implements DocumentsOperations{
	
	@Autowired
	private MongoOperations mongo;
	
	@Override
	public void addDocument(Documents document) {
		
		mongo.save(document);
	}

	@Override
	public void deleteDocumentById(String id) {
		Query query = new Query();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder = strBuilder.append(id);
		query.addCriteria(Criteria.where("id").is(strBuilder.toString()));
		WriteResult wr = mongo.remove(query, Documents.class);
		
			
		
	}

	@Override
	public void deleteAllDocuments() {
	
		mongo.remove(new Query(),Documents.class);
	}
	
}
