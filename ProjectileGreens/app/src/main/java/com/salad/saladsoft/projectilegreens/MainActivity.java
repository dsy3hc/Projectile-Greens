package com.salad.saladsoft.projectilegreens;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button armBtn;
    Button chestBtn;
    Button legBtn;
    Button headBtn;
    Button pelvisBtn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        armBtn = (Button) findViewById(R.id.Arm);

        armBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        legBtn = (Button) findViewById(R.id.Leg);

        legBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        headBtn = (Button) findViewById(R.id.Head);

        headBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        chestBtn = (Button) findViewById(R.id.Chest);

        chestBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        pelvisBtn = (Button) findViewById(R.id.Pelvis);

        pelvisBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

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
