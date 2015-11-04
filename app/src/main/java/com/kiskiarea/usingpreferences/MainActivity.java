package com.kiskiarea.usingpreferences;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
    }

    public void onClickLoad(View view)
    {
        Intent i = new Intent("com.kiskiarea.AppPreferenceActivity");
        startActivity(i);

    }

    public void onClickDisplay(View view)
    {
        SharedPreferences appPrefs = getSharedPreferences("com.kiskiarea.UsingPreferences_preferences", MODE_PRIVATE);
        DisplayText(appPrefs.getString("editTextPref", ""));
    }


    public void onClickModify(View view)
    {
        SharedPreferences appPrefs = getSharedPreferences("com.kiskiarea.UsingPreferences_preferences", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = appPrefs.edit();
        prefsEditor.putString("editTextPref", ((EditText) findViewById(R.id.txtString)).getText().toString());
        prefsEditor.commit();
    }

    private void DisplayText(String str)
    {
        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
