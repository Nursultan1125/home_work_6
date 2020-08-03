package com.example.homework6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CarAdapter extends ArrayAdapter<Car> {
    public CarAdapter(@NonNull Context context, ArrayList<Car> cars) {
        super(context, R.layout.list_view_example_view, cars);
    }
    private static class ViewHolder{
        ImageView carImage;
        TextView carName, carPriсeDollar, carPriceSom, carType, carDescription, cartTypeRules, carCity, carTimePass, carViewsCount;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Car car = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_view_example_view, parent, false);
            viewHolder.carImage = convertView.findViewById(R.id.carImage);
            viewHolder.carName = convertView.findViewById(R.id.carName);
            viewHolder.carPriсeDollar = convertView.findViewById(R.id.carPriseDollar);
            viewHolder.carPriceSom = convertView.findViewById(R.id.carPriceSom);
            viewHolder.carType = convertView.findViewById(R.id.carType);
            viewHolder.carDescription = convertView.findViewById(R.id.carDescription);
            viewHolder.cartTypeRules = convertView.findViewById(R.id.cartTypeRules);
            viewHolder.carCity = convertView.findViewById(R.id.carCity);
            viewHolder.carTimePass = convertView.findViewById(R.id.carTimePass);
            viewHolder.carViewsCount = convertView.findViewById(R.id.carViewsCount);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        assert car != null;
        viewHolder.carImage.setImageResource(car.getImageId());
        viewHolder.carName.setText(car.getName());
        viewHolder.carPriсeDollar.setText("$ " + car.getPrice());
        viewHolder.carPriceSom.setText(car.getPrice() + " сом");
        viewHolder.carType.setText(car.getType());
        viewHolder.carDescription.setText(car.getDescription());
        viewHolder.cartTypeRules.setText(car.getRuleType());
        viewHolder.carCity.setText(car.getCity());
        viewHolder.carTimePass.setText(car.getPassTime());
        viewHolder.carViewsCount.setText(String.valueOf(car.getViewCount()));

        return convertView;
    }

}
