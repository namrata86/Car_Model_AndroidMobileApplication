package com.example.chintannaik.car_model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] carStrings = {"Honda Odyssey", "Toyota Sienna", "Nissan  Quest"};
        ListView carList = (ListView) findViewById(R.id.listView);
        carList.setAdapter(new ArrayAdapter<String>(this, R.layout.list_row_layout, R.id.majorItem, carStrings));
        carList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://automobiles.honda.com/odyssey/")));
                        break; //display Honda Odyssey webpage
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.toyota.com/sienna/")));
                        break;   // display Toyota Sienna webpage
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.nissanusa.com/minivans/quest")));
                        break; //display Nissan Quest webpage
                    default:
                }
            }
        });

    }
}
