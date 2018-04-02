package com.ob.dbservice.docs;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author oonyimadu
 *
 */
@Document
public class Documents {
	@Id 
	private String id;
	private String location;
	private String size;
	private Integer checksum;
	private String fileName;
	private String fullPath;
	private String body;
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Integer getChecksum() {
		return checksum;
	}
	public void setChecksum(Integer checksum) {
		this.checksum = checksum;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
