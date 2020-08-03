package com.example.homework6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories){
        this.context = context;
        this.categories = categories;
    }


    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            gridView = inflater.inflate(R.layout.grid_item_layout, null);

            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.categoryImageView);
            TextView textView = gridView.findViewById(R.id.categoryTextView);

            Category category = categories.get(position);
            imageView.setImageResource(category.getImageId());
            textView.setText(category.getName());


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }
}
