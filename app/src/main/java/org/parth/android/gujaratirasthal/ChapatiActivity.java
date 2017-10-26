package org.parth.android.gujaratirasthal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/4/2017.
 */
public class ChapatiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        final ArrayList<Main> itemslist = new ArrayList<Main>();
        itemslist.add(new Main("Naan",4));
        itemslist.add(new Main("Sadi Roti",2));
        itemslist.add(new Main("Butter Roti",5));
        itemslist.add(new Main("Bajri Rotlo",4));
        itemslist.add(new Main("Makai Rotlo",3));
        itemslist.add(new Main("Tava Roti",4));


        ItemsAdapter adapter = new ItemsAdapter(this,itemslist);

        ListView listView = (ListView) findViewById(R.id.listOfItems);

        listView.setAdapter(adapter);

    }

}
