package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

public class Bazzinga extends AppCompatActivity {
    Itemclass[] items_bazzinga_smoothies = {
            new Itemclass("Cupcake", 15.0),
            new Itemclass("Donut", 16.0 ),
            new Itemclass("Eclair", 20.0),
            new Itemclass("Froyo", 30.0),
            new Itemclass("GingerBread",40.0),
            new Itemclass("Honeycomb", 30.0),
            new Itemclass("Ice Cream Sandwich",20.0)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazzinga);
        MenuAdapter menuAdapter;
        ListView listView=findViewById(R.id.bazzingaMenu);
        int index=getIntent().getIntExtra("tag",0);
        switch(index) {
            case 2: menuAdapter = new MenuAdapter(this, 0, Arrays.asList(items_bazzinga_smoothies));
                listView.setAdapter(menuAdapter);
                break;
        }


    }
}
