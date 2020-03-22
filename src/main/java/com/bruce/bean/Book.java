package com.bruce.bean;

public class Book {
    private String bookid;

    private String bookname;

    private String author;

    private String description;

    private Integer booktypeid;

    private Type type;

    public Book() {
        super();
    }

    public Book(String bookid, String bookname, String author, String description, Integer booktypeid) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.description = description;
        this.booktypeid = booktypeid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(Integer booktypeid) {
        this.booktypeid = booktypeid;
    }
}