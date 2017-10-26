package org.parth.android.gujaratirasthal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/4/2017.
 */
public class SabjiActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        final ArrayList<Main> itemslist = new ArrayList<Main>();
        itemslist.add(new Main("Lasaniya Bataka",10));
        itemslist.add(new Main("Sev Tameta",12));
        itemslist.add(new Main("Bharela Ringan",11));
        itemslist.add(new Main("Bharela Bataka",10));
        itemslist.add(new Main("Ringan Nu Bhadthu",12));
        itemslist.add(new Main("Bhinda Bataka",8));


        ItemsAdapter adapter = new ItemsAdapter(this,itemslist);

        ListView listView = (ListView) findViewById(R.id.listOfItems);

        listView.setAdapter(adapter);


    }
}
