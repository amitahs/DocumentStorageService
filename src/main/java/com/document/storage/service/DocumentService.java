package com.document.storage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.document.storage.model.Document;
import com.document.storage.repo.DocumentRepository;

@Component
public class DocumentService {
	
	
	@Autowired(required=true)
    private DocumentRepository repository;
	
		
	/*
	 * DocumentService(DocumentRepository repository){ this.repository = repository;
	 * }
	 */
    
    public Document getDocument(String id) {
        return repository.findById(id).orElseGet(Document::new);
    }

    public Document addDocument(Document doc) {
    	Document toSavedoc = new Document(doc.getJsonData());
        repository.save(toSavedoc);
        return toSavedoc;
    }

    public void updateDocument(String id, Document newdoc) {
    	
    	
    	repository.findById(id)
				.map(doc -> { doc.setData(newdoc.getData());
							  return repository.save(doc);
							})
				.orElseGet(()-> {newdoc.setDocumentId(id);
								return repository.save(newdoc);}
						    );
    }

    public void deleteDocument(String id) {
        repository.deleteById(id);
    }

}
