package org.parth.android.gujaratirasthal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/4/2017.
 */
public class DrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        final ArrayList<Main> itemslist = new ArrayList<Main>();
        itemslist.add(new Main("Coke",4));
        itemslist.add(new Main("Pepsi",4));
        itemslist.add(new Main("Lassi",8));
        itemslist.add(new Main("Fanta",5));
        itemslist.add(new Main("Water Bottle",3));
        itemslist.add(new Main("Nimboo Soda",6));


        ItemsAdapter adapter = new ItemsAdapter(this,itemslist);

        ListView listView = (ListView) findViewById(R.id.listOfItems);

        listView.setAdapter(adapter);
    }
}
