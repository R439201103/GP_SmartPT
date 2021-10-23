package com.example.gpsmartpt;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QName extends AppCompatActivity {
    private EditText eName;
    private TextView EnterName ;
    private Button Next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName= findViewById(R.id.TraineeName);
        EnterName= findViewById(R.id.QGender);
        Next1= findViewById(R.id.ButtonName);

        Next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String InputName = eName.getText().toString();

                if(InputName.isEmpty()){
                    //Toast.makeText( this, "Please Enter Your name", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent= new Intent( QName.this, QGender.class);
                    startActivity(intent);

                }
            }
        });





//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);





        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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