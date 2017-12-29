package com.example.hongtao.beeradviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void getBrand(View view){
        //its null at the begining
        TextView textView = (TextView)findViewById(R.id.textView);
        //get the value from spinner
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String beerType = String.valueOf(spinner.getSelectedItem());
        //调用getBrands方法，返回目标值，并循环输出
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand:brandList){
            brandsFormatted.append(brand).append('\n');
        }
        textView.setText(brandsFormatted);
    }
}
