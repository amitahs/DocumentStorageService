package com.document.storage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.document.storage.model.Document;

@Component
@Repository
public interface DocumentRepository extends JpaRepository<Document,String> {

}
