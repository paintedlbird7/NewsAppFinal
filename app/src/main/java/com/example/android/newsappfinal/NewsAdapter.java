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
    private News currentNews;

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of articles, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    public NewsAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }



        // Find the TextView with view ID location offset
        TextView articleTitle = (TextView) listItemView.findViewById(R.id.title);
        TextView articleAuthor = convertView.findViewById(R.id.author);



        // Create a new Date object from the time in milliseconds of the news
        Date dateObject = new Date(currentNews.getmTimeInMilliseconds());
        //Title titleObject = new Title(currentNews.getmTitle());


        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current news in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current news in that TextView
        timeView.setText(formattedTime);

//        // Find the TextView with view ID author
//        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
//        // Format the author string (i.e. "4:30PM")
//        String formattedAuthor = formatAuthor(authorObject);
//        // Display the author of the current news in that TextView
//        authorView.setText(formattedAuthor);
//
//        // Find the TextView with view ID author
//        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
//        // Format the author string (i.e. "4:30PM")
//        String formattedTitle = formatTitle(titleObject);
//        // Display the author of the current news in that TextView
//        titleView.setText(formattedTitle);




        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted title string (i.e. "Once upon a time...") from a Title object.
     */
//    private String formatTitle(Title titleObject) {
//        SimpleTitleFormat titleFormat = new SimpleTitleFormat("Once upon a time ....");
//        return titleFormat.format(titleObject);
//    }
//
//    /**
//     * Return the formatted date string (i.e. "Jane Doe") from a Author object.
//     */
//    private String formatAuthor(Author authorObject) {
//        SimpleAuthorFormat authorFormat = new SimpleAuthorFormat("Jane, Doe");
//        return authorFormat.format(authorObject);
//    }

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
