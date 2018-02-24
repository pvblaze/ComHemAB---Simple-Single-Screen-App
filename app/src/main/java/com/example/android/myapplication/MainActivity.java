package com.example.android.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contact_menu (View view) {
        Button toplogo = findViewById(R.id.toplogo);
        LinearLayout contact_menu = findViewById(R.id.contact);

        if (contact_menu.isShown()){
            contact_menu.setVisibility(View.INVISIBLE);
            toplogo.setBackgroundResource(R.drawable.logo);
        }else{
            contact_menu.setVisibility(View.VISIBLE);
            toplogo.setBackgroundResource(R.drawable.logo);
        }
    }
    public void home(View view) {
        String url = "https://www.comhem.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }

    public void phone(View view) {
        String number = "+4690222";
        Uri call = Uri.parse("tel:" + number);
        Intent intent = new Intent(Intent.ACTION_DIAL, call);
        startActivity(intent);
    }

    public void mail(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + "info@comhem.com"));
        startActivity(intent);

    }
}
