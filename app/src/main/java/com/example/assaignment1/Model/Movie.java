package com.example.assaignment1.Model;

public class Movie {
    private String Title ;
    private  int Year ;
    private  String Genre ;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Movie(String title, int year, String genre) {
        Title = title;
        Year = year;
        Genre = genre;
    }
    public  Movie(){

    }

    @Override
    public String toString() {
        return (getTitle() + "   Year: " + getYear() + "   " + getGenre());
    }
}
