package org.parth.android.gujaratirasthal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/4/2017.
 */
public class FarsanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        final ArrayList<Main> itemslist = new ArrayList<Main>();
        itemslist.add(new Main("Samosa",6));
        itemslist.add(new Main("Dhokla",5));
        itemslist.add(new Main("Idada",5));
        itemslist.add(new Main("Patarveliya",7));
        itemslist.add(new Main("Sev Khamni",8));
        itemslist.add(new Main("Bhajiya",6));


        ItemsAdapter adapter = new ItemsAdapter(this,itemslist);

        ListView listView = (ListView) findViewById(R.id.listOfItems);

        listView.setAdapter(adapter);

    }
}
