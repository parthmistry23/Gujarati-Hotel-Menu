package org.parth.android.gujaratirasthal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/17/2017.
 */
public class FinalOrder extends AppCompatActivity{

    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        final ArrayList<Main> words = new ArrayList<Main>();
        Intent intent = getIntent();

        for(int i =0; i< Assets.checkedItems.size(); i++){
            //intent.getStringExtra(Assets.checkedItems.get(i).getItems());
            intent.getIntExtra(Assets.checkedItems.get(i).getItems(),Assets.checkedItems.get(i).getPrice());
            words.add(new Main(Assets.checkedItems.get(i).getItems(), Assets.checkedItems.get(i).getPrice()));

            sum= sum+Assets.checkedItems.get(i).getPrice();
        }
        words.add(new Main());
        words.add(new Main("Total is",sum));
        OrderAdapter adapter = new OrderAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.summary);

        listView.setAdapter(adapter);
    }


}
