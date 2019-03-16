package com.example.myassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listby);

        ArrayList<String>musiciansList = new ArrayList<>();
        musiciansList.add("King Sunny Ade");
        musiciansList.add("Chief Ebenezer Obey");
        musiciansList.add("Chief Dele Abiodun");
        musiciansList.add("Alhaji Kollington Ayinla");
        musiciansList.add("King Wasiu Ayinde");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,musiciansList);
        listView.setAdapter(stringArrayAdapter);
   //     getText(R.id.showText);


    }
    public void onClick(View view){
        Intent intent = new Intent (getApplicationContext(), secondPage.class);

    }
    public void nextPage(View view){
        Intent intent = new Intent(getApplicationContext(),secondPage.class);
        startActivity(intent);
    }
    public void next(View view){
        Intent intent = new Intent(getApplicationContext(),ThirdPage.class);
        startActivity(intent);
    }


    }

