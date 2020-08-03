package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories = new ArrayList<>();
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);

        categories.add(new Category("Cars", R.drawable.cars));
        categories.add(new Category("House", R.drawable.house));
        categories.add(new Category("Building", R.drawable.building));
        categories.add(new Category("Museum", R.drawable.museum));
        categories.add(new Category("Mountains", R.drawable.mountains));
        categories.add(new Category("Ruin", R.drawable.ruin));
        categoryAdapter = new CategoryAdapter(this, categories);
        gridView.setAdapter(categoryAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.grid_view_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.goToListView:
                Intent intent = new Intent(this, ListViewActivity.class);
                startActivity(intent);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}