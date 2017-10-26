package org.parth.android.gujaratirasthal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/17/2017.
 */
public class OrderAdapter extends ArrayAdapter<Main> {

    public OrderAdapter(Activity context, ArrayList<Main> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.summary_list, parent, false);
        }

        final Main currentMain= getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.items);
        textView.setText(currentMain.getItems());

        TextView textView1 = (TextView) listItemView.findViewById(R.id.price);
        textView1.setText(String.valueOf(currentMain.getPrice()));


        return listItemView;
    }
}
