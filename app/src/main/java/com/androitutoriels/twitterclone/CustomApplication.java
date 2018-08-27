package com.androitutoriels.twitterclone;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

/**
 * Created by timot on 21/06/2017.
 */

public class CustomApplication extends Application{

    public static String CONSUMER_KEY = "wOKHUdvnpxBAho3VHFeRRJmoc";
    public static String CONSUMER_SECRET = "ZFWWuo6RPYbhIjSjmGrk81GgFzSKvm9vO9DXDh7DPvUGiG4vzo";

    public void onCreate() {
        super.onCreate();

        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("CONSUMER_KEY", "CONSUMER_SECRET"))
                .debug(true)
                .build();

        Twitter.initialize(config);

    }
}
