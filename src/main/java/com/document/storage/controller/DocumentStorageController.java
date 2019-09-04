package com.document.storage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.document.storage.model.Document;
import com.document.storage.service.DocumentService;

@RestController
@RequestMapping("/storage/documents")
public class DocumentStorageController {
	
	private static final Logger log = LoggerFactory.getLogger(DocumentStorageController.class);
	
	@Autowired
	private DocumentService service;
	
	//@GetMapping("/storage/documents/{docId}")
	@RequestMapping(value = "/{docId}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Document> getFile(@PathVariable String docId) {
		Document doc  = null;
		try {
			 doc = service.getDocument(docId);
		}
		catch(Exception e) {
			log.error("Exception occured while getting document!!!!"+e.getMessage());
			new ResponseEntity<Document>(doc,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Document>(doc,HttpStatus.OK);
	}
		
	//@PostMapping("/storage/documents")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Document> uploadFile(@RequestBody Document doc) {
		Document savedDocument  = null;
		try {
			 savedDocument = service.addDocument(doc);
		}
		catch(Exception e) {
			log.error("Exception occured while saving document!!!!"+e.getMessage());
			new ResponseEntity<Document>(savedDocument,HttpStatus.METHOD_FAILURE);
		}
		return new ResponseEntity<Document>(savedDocument,HttpStatus.CREATED);
	}
	
	
	//@PutMapping("/storage/documents")
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Document> modifyFile(@RequestBody Document doc) {
		Document savedDocument  = null;
		try {
			 savedDocument = service.addDocument(doc);
		}
		catch(Exception e) {
			log.error("Exception occured while saving document!!!!"+e.getMessage());
			new ResponseEntity<Document>(savedDocument,HttpStatus.METHOD_FAILURE);
		}
		return new ResponseEntity<Document>(savedDocument,HttpStatus.NO_CONTENT);
	}
	
	//@DeleteMapping("/storage/documents/{docId}")
	@RequestMapping(value = "/{docId}",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity deleteFile(@PathVariable String docId) {
		
		try {
			 service.deleteDocument(docId);
		}
		catch(Exception e) {
			log.error("Exception occured while saving document!!!!"+e.getMessage());
			new ResponseEntity(HttpStatus.METHOD_FAILURE);
		}
		return new ResponseEntity<Document>(HttpStatus.NO_CONTENT);
	}

}
