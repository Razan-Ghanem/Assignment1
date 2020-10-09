package com.example.assaignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assaignment1.Model.IMovieDa;
import com.example.assaignment1.Model.Movie;
import com.example.assaignment1.Model.MovieFactory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner ;
    private EditText EditText;
    private TextView txtview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spn) ;
        EditText = findViewById(R.id.edt);
        txtview = findViewById(R.id.txtview);
        populateSpinner();

    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie = factory.getModle();
        String[] type = objMovie.getType();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,type);
        spinner.setAdapter(adapter);
    }

    public void btnSearchOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie = factory.getModle();
        String spn = spinner.getSelectedItem().toString();
        String edt = EditText.getText().toString();
        ArrayList<Movie> Movies = objMovie.getMovies();
        txtview.setText("");
        for (Movie m:Movies){
            if(spn == "Year" && Integer.parseInt(edt) == m.getYear()){
                String y = m.toString();
                txtview.append(y + "\n");
            } else if(spn == "Title" && m.getTitle().toLowerCase().contains(edt.toLowerCase())){
                String y = m.toString();
                txtview.append(y + "\n");
            } else if(spn == "Genre" && edt.toLowerCase().equals(m.getGenre().toLowerCase()) ){
                String y = m.toString();
                txtview.append(y + "\n");
            }
        }







    }
}