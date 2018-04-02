package com.ob.dbservice.repos;

import com.ob.dbservice.docs.Documents;


/**
 * 
 * @author oonyimadu
 *
 */
public interface DocumentsOperations {
	void addDocument(Documents document);
	void deleteDocumentById(String id);
	void deleteAllDocuments();
}
