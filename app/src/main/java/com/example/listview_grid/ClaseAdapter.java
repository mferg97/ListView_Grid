package com.example.listview_grid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ClaseAdapter extends BaseAdapter {

    private ArrayList<ListViewItem> item;

    public ClaseAdapter(ArrayList<ListViewItem> item) {
        this.item = item;
    }


    @Override
    public int getCount() {


        return item.size();
    }

    @Override
    public ListViewItem getItem(int i) {


        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){

            view = LayoutInflater
                    .from(viewGroup.getContext())
                    .inflate(R.layout.listview_item, viewGroup, false);
        }

        decorateWith(view, item.get(i));
        return view;
    }

    private void decorateWith(View view, ListViewItem listViewitem) {
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);
        imageView.setImageResource(listViewitem.getImageResource());
        textView.setText(listViewitem.getTitle());
        imageView.setColorFilter(ContextCompat.getColor(view.getContext(), listViewitem.getColorId()));


    }


}
