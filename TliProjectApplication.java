package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.TranscriptRepository;
import com.example.model.Transcript;

@SpringBootApplication
public class TliProjectApplication implements CommandLineRunner {

  @Autowired
  private TranscriptRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(TliProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save transcipts
    repository.save(new Transcript("Shopping", "I'm looking for the new rare beauty blush"));
    repository.save(new Transcript("Hotel", "Please book me a hotel"));

    // fetch all transcripts
    System.out.println("Transcripts found with findAll():");
    System.out.println("-------------------------------");
    for (Transcript transcript : repository.findAll()) {
      System.out.println(transcript);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Transcript found with findByIntent('Hotel'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByIntent("Hotel"));
    }

  }


