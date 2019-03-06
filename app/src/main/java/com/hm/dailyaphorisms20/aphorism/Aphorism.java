package com.hm.dailyaphorisms20.aphorism;

public class Aphorism {

    private String quote;
    private String author;
    private Boolean viewed = false;

    public Aphorism() {

    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }
}
