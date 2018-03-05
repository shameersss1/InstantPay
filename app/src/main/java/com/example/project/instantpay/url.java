package com.example.project.instantpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class url extends AppCompatActivity {
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);
        Intent intent = getIntent();

        s = intent.getStringExtra("url");


        TextView link = (TextView) findViewById(R.id.textView);
        String linkText = "Visit the <a href="+s+">Payment</a> web page.";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
