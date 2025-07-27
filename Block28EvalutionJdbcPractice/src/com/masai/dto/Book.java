package com.masai.dto;
import java.util.Date;

public class Book {
    private String bookCode;
    private String name;
    private double price;
    private Date publishDate;
    private int numberOfPages;
    private String writerName;

    public Book() {
    }

    public Book(String bookCode, String name, double price, Date publishDate, int numberOfPages, String writerName) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.publishDate = publishDate;
        this.numberOfPages = numberOfPages;
        this.writerName = writerName;
    }

    // Getters and Setters

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    // toString method

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", numberOfPages=" + numberOfPages +
                ", writerName='" + writerName + '\'' +
                '}';
    }
}
