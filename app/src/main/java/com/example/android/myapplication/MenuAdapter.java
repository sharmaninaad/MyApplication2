package com.example.android.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MenuAdapter extends ArrayAdapter {
    public MenuAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, 0, objects);
    }
    @NonNull
    @SuppressLint("SetTextI18n")
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Itemclass itemclass = (Itemclass) getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_single, parent, false);
        }

        TextView NameView =  convertView.findViewById(R.id.nameText);
        assert itemclass != null;
        NameView.setText(itemclass.Name);

        TextView NumberView = convertView.findViewById(R.id.priceText);
        NumberView.setText(itemclass.price+" ");
        return convertView;
    }
}
