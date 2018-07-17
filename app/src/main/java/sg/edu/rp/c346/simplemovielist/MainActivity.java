package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Step 1b: Create a list view variable
    ListView lvMovie;

    //Step 2a: Create an ArrayList variable
    ArrayList<String> alMovieList;

    //Step 3a: Create an Array adapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c: Bind the UI element to the Java variable
        lvMovie = findViewById(R.id.listViewMovie);

        //Step 2b: Initialise the Array list
        alMovieList = new ArrayList<>();

        //Step 2c: Add data into the ArrayList
        alMovieList.add("Avengers Infinity War Release Date: 2018.04");
        alMovieList.add("Justice League Release Date: 2017.11");

        //Step 3b: Initialis the Array Adapter and bind it to the Array List
        aaMovie = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alMovieList);

        // Step 4: BInd the list view to the Array adapter
        lvMovie.setAdapter(aaMovie);


    }
}
