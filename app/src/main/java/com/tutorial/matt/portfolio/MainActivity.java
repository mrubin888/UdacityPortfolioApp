package com.tutorial.matt.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button projOneButton = (Button) findViewById(R.id.project_1_button);
        projOneButton.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my spotify streamer."
        ));

        Button projTwoButton1 = (Button) findViewById(R.id.project_2_button_1);
        projTwoButton1.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my football scores app."
        ));

        Button projTwoButton2 = (Button) findViewById(R.id.project_2_button_2);
        projTwoButton2.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my library app."
        ));

        Button projThreeButton = (Button) findViewById(R.id.project_3_button);
        projThreeButton.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my build it bigger project."
        ));

        Button projFourButton = (Button) findViewById(R.id.project_4_button);
        projFourButton.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my XYZ reader project."
        ));

        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new ProjectButtonClickListener(
                "This button will open my capstone project."
        ));
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

    private class ProjectButtonClickListener implements View.OnClickListener {

        private CharSequence text;

        public ProjectButtonClickListener(CharSequence text) {
            this.text = text;
        }

        @Override
        public void onClick(View view) {
            Toast toast = Toast.makeText(view.getContext(), this.text, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
