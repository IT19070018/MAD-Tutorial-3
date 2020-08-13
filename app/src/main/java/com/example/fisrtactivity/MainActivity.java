package com.example.fisrtactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String myExtra;
    public String myExtra2;

    public String getMyExtra2(String myExtra2) {
        return myExtra2;
    }

    public String getMyExtra(String myExtra) {
        return myExtra;
    }

    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();
         View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        OnClickButtonLister();
    }

    public void OnClickButtonLister() {
        btnOk = (Button)findViewById(R.id.button1);
        btnOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast;
                        Context context = getApplicationContext();
                        CharSequence text = "Loading second activity..";
                        int duration = Toast.LENGTH_SHORT;

                        toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.BOTTOM, 0,0);
                        toast.show();

                        Intent intent = new Intent (MainActivity.this, SecondActivity.class);
                        intent.putExtra("Extra1", getMyExtra(myExtra));
                        intent.putExtra("Extra2", getMyExtra2(myExtra2));
                        startActivity(intent);
                    }
                }
        );
    }
}