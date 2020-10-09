package com.example.assaignment1.Model;

public class MovieFactory {
    public IMovieDa getModle(){
        return new MovieDa();
    }
}
