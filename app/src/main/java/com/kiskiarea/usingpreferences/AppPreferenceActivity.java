package com.kiskiarea.usingpreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Melissa on 11/3/2015.
 */
public class AppPreferenceActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //---load the preferences from the XML file that I created ---
        addPreferencesFromResource(R.xml.myapppreferences);

    }
}
