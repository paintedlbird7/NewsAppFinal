package com.example.android.newsappfinal;

/**
 * An {@link News} object contains information related to a single article.
 */
public class News {


    private final String mAuthor;
    private final Object mDate;
    private String mTitle;

    /**
     * Website URL of the article
     */
    private String mUrl;

    /**
     * Website Section of the article
     */
    private String mSection;


    public News(String date, String title, String sectionName, String url, String authorName) {
        this.mTitle = title;
        this.mSection = sectionName;
        this.mAuthor = authorName;
        this.mUrl = url;
        this.mDate = date;
    }


    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmDate() {
        return (String) mDate;
    }

    public String getmSection() {
        return mSection;
    }


    public String getmUrl() {
        return mUrl;
    }

    public void add(News news) {
    }
}