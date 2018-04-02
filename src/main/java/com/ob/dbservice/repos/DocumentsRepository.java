package com.ob.dbservice.repos;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.ob.dbservice.docs.Documents;


public interface DocumentsRepository extends CrudRepository<Documents, String>, DocumentsOperations{
	Documents findByIdIgnoringCase(String id);
	List<Documents> findByLocationIgnoringCase(String location);
	Documents findByFullPath(String fullPath);
}

