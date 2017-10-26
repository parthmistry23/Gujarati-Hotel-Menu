package org.parth.android.gujaratirasthal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/11/2017.
 */
public class ItemsAdapter extends ArrayAdapter<Main>{


    public ItemsAdapter(Activity context, ArrayList<Main> itemslist) {
        super(context, 0, itemslist);
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        final Main currentMain= getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.items);
        textView.setText(currentMain.getItems());

        TextView textView1 = (TextView) listItemView.findViewById(R.id.price);
        textView1.setText(String.valueOf(currentMain.getPrice()));

        final CheckBox check = (CheckBox)listItemView.findViewById(R.id.checkbox);
        check.setChecked(currentMain.isSelected());


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {

                        Assets.checkedItems.add(getItem(position));

            }
        });

        return listItemView;
    }

}
