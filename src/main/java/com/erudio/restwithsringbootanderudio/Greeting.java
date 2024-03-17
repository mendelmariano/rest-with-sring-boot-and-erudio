package com.erudio.restwithsringbootanderudio;

public class Greeting {

    private final long id;
    private String content;


    
    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }



    
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    

    
}
