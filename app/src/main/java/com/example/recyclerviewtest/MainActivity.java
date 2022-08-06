package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        initFruit();//初始化水果
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //线性布局
//        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Banana"), R.drawable.banana);
            fruitList.add(banana);
            Fruit cherries = new Fruit(getRandomLengthName("Cherries"), R.drawable.cherries);
            fruitList.add(cherries);
            Fruit grapes = new Fruit(getRandomLengthName("Grapes"), R.drawable.grapes);
            fruitList.add(grapes);
            Fruit kiwi = new Fruit(getRandomLengthName("Kiwi"), R.drawable.kiwi);
            fruitList.add(kiwi);
            Fruit lemon = new Fruit(getRandomLengthName("Lemon"), R.drawable.lemon);
            fruitList.add(lemon);
            Fruit Orange = new Fruit(getRandomLengthName("Orange"), R.drawable.orange);
            fruitList.add(Orange);
            Fruit Peach = new Fruit(getRandomLengthName("Peach"), R.drawable.peach);
            fruitList.add(Peach);
            Fruit Strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry);
            fruitList.add(Strawberry);
            Fruit Watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon);
            fruitList.add(Watermelon);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}