package com.example.geofencing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    private static final String radi="rad";
//    private static final String strokColor="col1";
//    private static final String filcolor="col2";
//    private static final Object GEOFENCE_RADIUS = 35;
//    SharedPreferences sharedPreferences;
//    private static final String SHARED_PREFER ="locat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences sharedPreferences=getSharedPreferences("prefs", MODE_PRIVATE);
//        boolean firststart=sharedPreferences.getBoolean("firststart", true);
//        if(firststart){
//            startshow();
//        }
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);

        builder.setTitle("DISCLAIMER");
        builder.setMessage("ReMindMe Covid Alert app is for precautionary measures only. This is to remind you about taking appropriate precautionary actions during Covid19 pandemic times.ReMindMe Alert app is not intended to constitute professional medical advice, diagnosis or treatment.Donot ignore or delay obtaining medical advice incase of any covid19 symptoms");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
        init();



        //Aleryt

//        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);

    }



//    private void getActivity() {
//        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
//        startActivity(intent);
//    }

    private void init(){
        Button btnMap = (Button) findViewById(R.id.GoToMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}