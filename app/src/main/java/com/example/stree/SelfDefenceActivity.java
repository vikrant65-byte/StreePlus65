package com.example.stree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SelfDefenceActivity extends AppCompatActivity {

    PDFView selfDefence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_defence);

        selfDefence =(PDFView)findViewById(R.id.SelfDefence);

        selfDefence.fromAsset("Self-Defence.pdf").load();


    }
}