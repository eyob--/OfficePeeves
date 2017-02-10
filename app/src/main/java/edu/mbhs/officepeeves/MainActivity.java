package edu.mbhs.officepeeves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToWoes(View v){
        Intent i = new Intent(this, WoesActivity.class);
        startActivity(i);
    }
    public void submitWoes(View v){
        String woe = ((EditText) findViewById(R.id.editGrievance)).getText().toString();
        Intent i = new Intent(this, WoesActivity.class);
        i.putExtra("woe", woe);
        ((EditText) findViewById(R.id.editGrievance)).setText("");
        startActivity(i);
    }
}
