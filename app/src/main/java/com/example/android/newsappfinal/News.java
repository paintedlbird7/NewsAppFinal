///*
// * Copyright (C) 2016 The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.example.android.newsappfinal;
//
///**
// * An {@link News} object contains information related to a single article.
// */
//public class News {
//
//
//    /** Location of the article */
//    private String mLocation;
//    private String mAuthor;
//
//
//    /** Time of the article */
//    private long mTimeInMilliseconds;
//    private long mWebPublicationDate;
//
//
//    /** Website URL of the article */
//    private String mUrl;
//
//
//    public News(String mLocation, long mTimeInMilliseconds, String mUrl) {
//        this.mLocation = mLocation;
//        this.mAuthor = mAuthor;
//        this.mTimeInMilliseconds = mTimeInMilliseconds;
//        this.mWebPublicationDate = mWebPublicationDate;
//        this.mUrl = mUrl;
//    }
//
//
//
//    public String get() {
//        return mLocation;
//    }
//
//    public String getmLocation() {
//        return mLocation;
//    }
//
//    public long getmTimeInMilliseconds() {
//        return mTimeInMilliseconds;
//    }
//
//    public String getmUrl() {
//        return mUrl;
//    }
//
//    public void add(News news) {
//    }
//}

package com.example.android.newsappfinal;

/**
 * An {@link News} object contains information related to a single article.
 */
public class News {


    /** Location of the article */
    //private String mLocation;
    private String mAuthor;

    private String mTitle;


    /** Time of the article */
    private long mTimeInMilliseconds;
    //private long mWebPublicationDate;


    /** Website URL of the article */
    private String mUrl;

    /** Website URL of the article */
    private String mSection;


//    public News(String mLocation, long mTimeInMilliseconds, String mUrl) {
//        // this.mLocation = mLocation;
//        this.mAuthor = mAuthor;
//        this.mTimeInMilliseconds = mTimeInMilliseconds;
//        //this.mWebPublicationDate = mWebPublicationDate;
//        this.mUrl = mUrl;
//        this.mSection = mSection;
//        this.mTitle = mTitle;
//    }

    public News(String title, String sectionName, String date, String url, String author) {
        this.mTitle = title;
        this.mSection = sectionName;
        this.mUrl= url;
    }



//    //public String get() {
//        return mLocation;
//    }
//
//    public String getmLocation() {
//        return mLocation;
//    }

        public String getmTitle() {
        return mTitle;
    }

       public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    //public Long getmWebPublicationDate() { return mWebPublicationDate; }

    public String getmSection() {
        return getmSection();
    }



    public String getmUrl() {
        return mUrl;
    }

    public void add(News news) {
    }
}