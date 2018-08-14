package com.example.android.newsappfinal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * The part of the location string from the news service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */
    private static final String LOCATION_SEPARATOR = " of ";
    //private News currentNews;

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of articles, which is the data source of the adapter
     */

    private List<News> currentNews;

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
        currentNews = news; // assign it here
    }


    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        if (currentNews != null) { // if not null
            News news = currentNews.get(position);


            // Create a new Date object from the time in milliseconds of the earthquake
            Date dateObject = new Date(currentNews.getmTimeInMilliseconds());

            // Find the TextView with view ID date
            TextView dateView = (TextView) listItemView.findViewById(R.id.date);
            // Format the date string (i.e. "Mar 3, 1984")
            String formattedDate = formatDate(dateObject);
            // Display the date of the current earthquake in that TextView
            dateView.setText(formattedDate);

            // Find the TextView with view ID time
            TextView timeView = (TextView) listItemView.findViewById(R.id.time);
            // Format the time string (i.e. "4:30PM")
            String formattedTime = formatTime(dateObject);
            // Display the time of the current earthquake in that TextView
            timeView.setText(formattedTime);

            // Find the TextView with view ID location offset
            TextView articleTitle = (TextView) listItemView.findViewById(R.id.title);
            articleTitle.setText(news.getmTitle());

            // Find the TextView with view ID location offset
            TextView articleAuthor = (TextView) listItemView.findViewById(R.id.author);
            articleAuthor.setText(news.getmAuthor());

            // Find the TextView with view ID location offset
            TextView articleSection = (TextView) listItemView.findViewById(R.id.section);
            articleSection.setText(news.getmSection());

//            // Find the TextView with view ID location offset
//            TextView articleDate = (TextView) listItemView.findViewById(R.id.date);
//            articleDate.setText(news.getmDate());
        }
        //TODO: do the same with rest of TextViews after you get the correct values

        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}