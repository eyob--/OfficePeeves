package edu.mbhs.officepeeves;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woes);
        Intent i = getIntent();
        String woe = i.getStringExtra("woe");
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        String s = sharedPref.getString("woes", "");
        if (woe != null) {
            SharedPreferences.Editor editor = sharedPref.edit();
            s=s+"\n"+"*   "+woe;
            editor.putString("woes", s);
            editor.commit();
        }
        TextView txt = (TextView) findViewById(R.id.grievences);
        txt.setText(s);

    }
    public void clearWoes(View v){
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("woes", "");
        editor.commit();
        TextView txt = (TextView) findViewById(R.id.grievences);
        txt.setText("");
    }
}
