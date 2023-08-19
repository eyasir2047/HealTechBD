package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EventActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);

        Button AIConsult = (Button) findViewById(R.id.AIConsultation);
        AIConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, AIConsultation.class);
                view.getContext().startActivity(intent);
            }
        });

        Button DoctorConsult = (Button) findViewById(R.id.DoctorConsultation);
        DoctorConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, DoctorConsultation.class);
                view.getContext().startActivity(intent);
            }
        });

        Button Diagnosis = (Button) findViewById(R.id.Diagnosis);
        Diagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, Diagnosis.class);
                view.getContext().startActivity(intent);
            }
        });

        Button OrderMedicine  = (Button) findViewById(R.id.OrderMedicine);
        OrderMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, OrderMedicine.class);
                view.getContext().startActivity(intent);
            }
        });

        Button AmbulanceService = (Button) findViewById(R.id.AmbulanceService);
        AmbulanceService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, AmbulanceService.class);
                view.getContext().startActivity(intent);
            }
        });

        Button AboutOurselves = (Button) findViewById(R.id.AboutOurselves);
        AboutOurselves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this, AboutOurselves.class);
                view.getContext().startActivity(intent);
            }
        });








    }





}