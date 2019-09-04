package com.document.storage.model;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.apache.commons.lang.RandomStringUtils;
@Entity
public class Document {
	
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy-hhmmss");
	
	@Id
	private String documentId;
	
	private long size;
	
	@Lob
	private byte[] data;
	
	private String jsonData;

	public Document() {}
	
	public Document( String data) {
		super();
		this.documentId = createId();
		this.setData(data.getBytes());
		this.jsonData = data;
	}

	
	
	public String getJsonData() {
		//this.jsonData = Base64.getEncoder().encodeToString(this.data);
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
		this.setData(jsonData.getBytes());
	}

	private String createId() {
		
		String date = sdf.format(new Date());
		String name = String.format("%s", RandomStringUtils.randomAlphanumeric(7));
		return name+date;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
		this.size= data.length;
	}

	public String getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(String id) {
		this.documentId = id;
	}
	
	public long getSize() {
		return size;
	}

}
