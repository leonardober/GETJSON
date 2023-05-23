package com.example.sesiooon;

public class Post {

    private Long id;
    private Long userId;
    private String title;
    private String body;

    public Post() {
        // Constructor por defecto
    }

    public Post(Long id, Long userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    // Getters traen la informacion

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    // Setters  asigna

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

}