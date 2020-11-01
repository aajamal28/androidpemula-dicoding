package com.example.industrialpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutMeActivity extends AppCompatActivity {
    private String name = "JAMALUDIN";
    private String mail = "aajamal28@gmail.com";
    private String Ig = "https://www.instagram.com/aadjamal/";
    private String link = "https://www.linkedin.com/in/jamaludin-yatim";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView nameMe = findViewById(R.id.tv_name);
        TextView mailMe = findViewById(R.id.tv_mail);
        ImageView imgMe = findViewById(R.id.imgv_me);
        ImageView imgIg = findViewById(R.id.imgvIg);
        ImageView imgLinkedin = findViewById(R.id.imgvLinkedin);

        nameMe.setText(name);
        mailMe.setText(mail);
        Glide.with(this).load(R.drawable.me).apply(new RequestOptions().override(250,250)).into(imgMe);
        Glide.with(this).load(R.drawable.instagram2).into(imgIg);
        Glide.with( this).load(R.drawable.linkedin2).into(imgLinkedin);

        imgIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accessWebIg = new Intent(Intent.ACTION_VIEW);
                accessWebIg.setData(Uri.parse(Ig));
                startActivity(accessWebIg);
            }
        });

        imgLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accessWebLink = new Intent(Intent.ACTION_VIEW);
                accessWebLink.setData(Uri.parse(link));
                startActivity(accessWebLink);
            }
        });
    }
}
