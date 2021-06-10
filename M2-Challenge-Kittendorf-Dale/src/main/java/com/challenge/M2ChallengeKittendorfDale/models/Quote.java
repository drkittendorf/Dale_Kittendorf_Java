package com.challenge.M2ChallengeKittendorfDale.models;

import java.util.Objects;

public class Quote {
    private int id;
    private String author;
    private String quote;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public Quote() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return id == quote1.id && Objects.equals(author, quote1.author) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }
}

//- Quote API:
//  - URI: /quote
//  - Method: GET
//  - Request Body: None
//  - Response Body: Quote
//- Quote Object instance variables:
//  - id
//  - author
//  - quote

// “Happiness consists in activity.
//It is running steam,
//not a stagnant pool.”
//~ John Mason Good