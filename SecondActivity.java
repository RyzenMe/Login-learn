package com.example.ryzen.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.R.layout;
import java.util.ArrayList;
import java.lang.String;
import android.content.Intent;
public class SecondActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        Intent intent = getIntent();


        TextView tv1 = (TextView) findViewById(R.id.email); //second_layout中的TextView的id;


        String string1 = intent.getStringExtra("extra_data1");


        tv1.setText(string1);

        TextView tv2 = (TextView) findViewById(R.id.password); //second_layout中的TextView的id;


        String string2 = intent.getStringExtra("extra_data2");


        tv2.setText(string2);


    }
}