package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TranscriptRepository extends MongoRepository<TranscriptModel, String> {

  public TranscriptModel findByIntent(String intent );
  public List<Intent> findByContent(String content);

}