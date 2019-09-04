package com.document.storage.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.document.storage.model.Document;

@Component
public class DocumentRepositoryImpl implements DocumentRepository {

	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Document> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Document> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Document getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Document> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Document> findById(String id) {
		
		return findById(id);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Document entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Document> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Document> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Document> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Document> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
