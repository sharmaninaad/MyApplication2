package com.example.android.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryAdapter extends ArrayAdapter {
    public CategoryAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, 0, objects);
    }
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Category category = (Category) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_single, parent, false);
        }


        TextView NameView =  convertView.findViewById(R.id.nameCategory);
        assert category != null;
        NameView.setText(category.Name);

        ImageView imageView = convertView.findViewById(R.id.imageCategory);
        imageView.setImageResource(category.image);
        return convertView;
    }
}
