package edu.mbhs.officepeeves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woes);
        Intent i = getIntent();
        String woe = i.getStringExtra("woe");
        if (woe != null) {
            TextView txt = (TextView) findViewById(R.id.grievences);
            txt.append("\n" + woe);
        }
    }
}
