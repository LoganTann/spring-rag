package fr.efrei.rag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.efrei.rag.domain.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{
}