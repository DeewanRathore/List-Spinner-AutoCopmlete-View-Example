package com.rathoreraja.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    Spinner spinner;
    AutoCompleteTextView actxtView;
    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrIDS = new ArrayList<>();

    ArrayList<String> arrLanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spiner);
     //   actxtView.findViewById(R.id.actxtView);


        arrName.add("Deewan");
        arrName.add("Rathore");
        arrName.add("love Sharma");
        arrName.add("Rahul Leelwani");
        arrName.add("Raja Lalwani");
        arrName.add("nawal Rai");
        arrName.add("Kamlesh");
        arrName.add("Taj Muhammad");
        arrName.add("Deewan");
        arrName.add("Rathore");
        arrName.add("love Sharma");
        arrName.add("Rahul Leelwani");
        arrName.add("Raja Lalwani");
        arrName.add("nawal Rai");
        arrName.add("Kamlesh");
        arrName.add("Taj Muhammad");
        arrName.add("kunal Kushahwa");
        arrName.add("Deewan");
        arrName.add("Rathore");
        arrName.add("love Sharma");
        arrName.add("Rahul Leelwani");
        arrName.add("Raja Lalwani");
        arrName.add("nawal Rai");
        arrName.add("Kamlesh");
        arrName.add("Taj Muhammad");
        arrName.add("kunal Kushahwa");
        arrName.add("kunal Kushahwa");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrName);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Spinner

        arrIDS.add("Id Card");
        arrIDS.add("Enroll Card");
        arrIDS.add("Cnic Card");
        arrIDS.add("Nation Card");
        arrIDS.add("Sim Card");
        arrIDS.add("Wedding Card");
        arrIDS.add("Any Card");
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIDS);
        spinner.setAdapter(spinnerAdapter);




        //AutoCompelete Text View



//        arrLanguages.add("C");
//        arrLanguages.add("Objective C");
//        arrLanguages.add("C++");
//        arrLanguages.add("Oriented C");
//        arrLanguages.add("Java");
//        arrLanguages.add("Dev C");
//        arrLanguages.add("Python");
//        arrLanguages.add("Flutter");
//        ArrayAdapter<String> actViewArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
//        actxtView.setAdapter(actViewArrayAdapter);
//        actxtView.setThreshold(1);

    }
}