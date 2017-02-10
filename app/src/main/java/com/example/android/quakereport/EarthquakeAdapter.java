package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Ludeyu on 2/9/2017.
 */

/*
* {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Earthquake} objects.
* */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param earthquakes   A List of Earthquake objects to display in a list
     */

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context,0,earthquakes);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_value);
        magnitudeTextView.setText(Double.toString(currentEarthquake.getMagnitude()));

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_value);
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;
    }

}
