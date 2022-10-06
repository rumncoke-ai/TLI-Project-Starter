package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transcript {

    @Id
    private String id;

    
    private String content;
    private String intent;
    
    
    public Transcript(String id, String intent, String content) {
        super();
        this.id = id;
        this.intent = intent;
        this.content = content;
    }

    public Transcript(String intent, String content) {
        super();
        this.intent = intent;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




    
}
