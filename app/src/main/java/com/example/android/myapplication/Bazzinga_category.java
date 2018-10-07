package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Bazzinga_category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazzinga_category);
        Category[] category_bazzinga = {
                new Category("Mocktail",R.drawable.cocktail),
                new Category("Shakes",R.drawable.shakes),
                new Category("Smmothies",R.drawable.smoothies),
                new Category("Coffee", R.drawable.coffee),
                new Category("Soups",R.drawable.soups),
                new Category("Appetizers", R.drawable.appe),
                new Category("paratha",R.drawable.paratha),
                new Category("Main Course",R.drawable.mainc),
                new Category("Tikka",R.drawable.tikka),
                new Category("Breads",R.drawable.loaf),
                new Category("Thali",R.drawable.thali),
                new Category("Maggi",R.drawable.spaguetti),
        };
        ListView baz_list=findViewById(R.id.list_baz_category);
        CategoryAdapter categoryAdapter=new CategoryAdapter(this,0,category_bazzinga);
        baz_list.setAdapter(categoryAdapter);
    }
}
