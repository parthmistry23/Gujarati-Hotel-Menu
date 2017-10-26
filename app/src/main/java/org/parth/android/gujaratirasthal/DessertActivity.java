package org.parth.android.gujaratirasthal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/4/2017.
 */
public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        final ArrayList<Main> itemslist = new ArrayList<Main>();
        itemslist.add(new Main("Malai Kulfi",12));
        itemslist.add(new Main("Kasata Icecreaam",8));
        itemslist.add(new Main("Gulab Jamun",10));
        itemslist.add(new Main("Ras Malai",11));
        itemslist.add(new Main("Ice dish",7));
        itemslist.add(new Main("Pan Cake",6));


        ItemsAdapter adapter = new ItemsAdapter(this,itemslist);

        ListView listView = (ListView) findViewById(R.id.listOfItems);

        listView.setAdapter(adapter);

    }
}
