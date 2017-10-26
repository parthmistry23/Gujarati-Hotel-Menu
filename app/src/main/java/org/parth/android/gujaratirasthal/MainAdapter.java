package org.parth.android.gujaratirasthal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.gujaratirasthal.R;

import java.util.ArrayList;

/**
 * Created by parth on 10/9/2017.
 */
public class MainAdapter  extends ArrayAdapter<Main> {

    public MainAdapter(Activity context, ArrayList<Main> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        Main currentMain= getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentMain.getImage());

        TextView textView = (TextView) listItemView.findViewById(R.id.text);
        textView.setText(currentMain.getText());

        return listItemView;
    }
}
