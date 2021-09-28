package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IBOp3qIvRwE29SKjsIJaKbD0VKN63kpc0JrFVPUe")
                .clientKey("Sg4VIZ2OVk9DktZbz6FgFSfZGUewk6I9RuUhz9rz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
