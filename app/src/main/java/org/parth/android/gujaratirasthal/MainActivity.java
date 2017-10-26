package org.parth.android.gujaratirasthal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_list);

        final ArrayList<Main> words = new ArrayList<Main>();

        words.add(new Main(R.drawable.sabji, "Sabji"));
        words.add(new Main(R.drawable.chapati, "Chapati"));
        words.add(new Main(R.drawable.drink, "Drink"));
        words.add(new Main(R.drawable.farsan, "Farsan"));
        words.add(new Main(R.drawable.dessert, "Dessert"));


        MainAdapter adapter = new MainAdapter(this, words);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Main word = words.get(position);
                if (position == (0)) {
                    Intent sabjiIntent = new Intent(MainActivity.this, SabjiActivity.class);
                    startActivity(sabjiIntent);
                }
                if (position == (1)) {
                    Intent chapatiIntent = new Intent(MainActivity.this, ChapatiActivity.class);
                    startActivity(chapatiIntent);
                }
                if (position == (2)) {
                    Intent drinkIntent = new Intent(MainActivity.this, DrinkActivity.class);
                    startActivity(drinkIntent);
                }
                if (position == (3)) {
                    Intent farsanIntent = new Intent(MainActivity.this, FarsanActivity.class);
                    startActivity(farsanIntent);
                }
                if (position == (4)) {
                    Intent dessertIntent = new Intent(MainActivity.this, DessertActivity.class);
                    startActivity(dessertIntent);
                }

            }
        });

    }

    public void onButtonPressed(View view) {
        Intent finalOrder = new Intent(MainActivity.this, FinalOrder.class);

        for(int i =0; i< Assets.checkedItems.size(); i++){
            finalOrder.putExtra(Assets.checkedItems.get(i).getItems(),Assets.checkedItems.get(i).getPrice());
            //System.out.println("Item name: "+Assets.checkedItems.get(i).getItems()+ "and Price is: "+ Assets.checkedItems.get(i).getPrice());
        }

        startActivity(finalOrder);
    }
    public void onBackPressed(){
        super.onBackPressed();
        Assets.checkedItems.clear();
    }
}
