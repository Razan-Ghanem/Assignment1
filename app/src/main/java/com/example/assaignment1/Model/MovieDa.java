package com.example.assaignment1.Model;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

     class MovieDa implements  IMovieDa {
         private ArrayList<Movie> Movies = new ArrayList<>();

         public MovieDa() {
             Movies.add(new Movie("Scooby Doo", 2020, "Comedy"));
             Movies.add(new Movie("Dumbo", 2019, "Fantasy"));
             Movies.add(new Movie("Gravity", 2013, "Fiction"));
             Movies.add(new Movie("Seized", 2020, "Action"));
             Movies.add(new Movie("Sufna", 2020, "romantic"));
             Movies.add(new Movie("Harlock Space Pirate", 2013, "Animation"));

         }

         public ArrayList<Movie> getMovies() {
             int counter = 0;
             ArrayList<Movie> data = new ArrayList<>();
             for (Movie m : Movies) {
                 if (m.getTitle().equals(Movies.get(counter).getTitle())) {
                     data.add(m);
                 } else if (m.getYear() == (Movies.get(counter)).getYear()) {
                     data.add(m);
                 } else if (m.getGenre().equals(Movies.get(counter).getGenre())) {
                     data.add(m);
                 }
                 counter++;

             }
             return data;
         }

         @Override
         public String[] getType() {
             String[] type = new String[]{"Title", "Year", "Genre"};
             return type;
         }
     }

