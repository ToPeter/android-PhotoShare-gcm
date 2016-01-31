package sk.stavona.photoshare;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Tomascik on 30. 1. 2016.
 */
public class PhotoShareApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // [Optional] Power your app with Local Datastore. For more info, go to
        // https://parse.com/docs/android/guide#local-datastore
        Parse.enableLocalDatastore(this);
        Parse.initialize(this,"srRrvqYeALLbiW5q4dHFHXeEFrQYs5puzZsyC6OU","NWJQN7gKIDFVSZyym20KPEaAQpCiGyvqpKsRhcHj");

    }
}
