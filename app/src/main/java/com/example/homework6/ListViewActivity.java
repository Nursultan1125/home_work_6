package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    CarAdapter carAdapter;
    ListView listView;
    ArrayList<Car> cars = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        cars.add(new Car(R.drawable.cars, "Nissan", 2000, "Седан, бензин", "2001г., 1.8 л., автомат", "руль справа", "Бишкек", "2 минуты назад", 5));
        carAdapter = new CarAdapter(this, cars);
        listView.setAdapter(carAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list_view_menu, menu);
        return true;
    }
}