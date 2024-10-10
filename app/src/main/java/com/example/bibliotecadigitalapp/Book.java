package com.example.bibliotecadigitalapp;

public class Book {
    private String title;
    private String author;
    private int color;

    public Book(String title, String author, int color) {
        this.title = title;
        this.author = author;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
