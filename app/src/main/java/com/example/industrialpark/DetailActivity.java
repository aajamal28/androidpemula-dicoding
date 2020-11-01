package com.example.industrialpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Int2;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String Extra_ParkName = "parkname";
    public static final String Extra_ParkLocation = "parklocation";
    public static final String Extra_ParkWide = "parkwide";
    public static final String Extra_ParkWeb = "parkweb";
    public static final String Extra_ParkDesc = "parkdesc";
    public static final String Extra_ParkDeveloper = "parkdeveloper";
    public static final String Extra_ParkImg = "parkimage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDtlParkName = findViewById(R.id.dtl_parkname);
        TextView tvDtlParkLocation = findViewById(R.id.dtl_parklocation);
        TextView tvDtlParkWide = findViewById(R.id.dtl_parkwide);
        TextView tvDtlParkDeveloper = findViewById(R.id.dtl_parkdeveloper);
        TextView tvDtlParkDesc = findViewById(R.id.dtl_parkdesc);
        final TextView tvDtlParkWeb = findViewById(R.id.dtl_parkweb);
        ImageView ivDtlParkImg = findViewById(R.id.dtl_parkimg);

        String dtlParkName = getIntent().getStringExtra(Extra_ParkName);
        String dtlParkLocation = getIntent().getStringExtra(Extra_ParkLocation);
        String dtlParkWide = getIntent().getStringExtra(Extra_ParkWide);
        final String dtlParkWeb = getIntent().getStringExtra(Extra_ParkWeb);
        String dtlParkDeveloper = getIntent().getStringExtra(Extra_ParkDeveloper);
        String dtlParkDesc = getIntent().getStringExtra(Extra_ParkDesc);
        int dtlParkImg = getIntent().getIntExtra(Extra_ParkImg, 0);

        tvDtlParkName.setText(dtlParkName);
        tvDtlParkLocation.setText(dtlParkLocation);
        tvDtlParkWide.setText(dtlParkWide);
        tvDtlParkDesc.setText(dtlParkDesc);
        tvDtlParkWeb.setText(dtlParkWeb);
        tvDtlParkDeveloper.setText(dtlParkDeveloper);
        Glide.with(this).load(dtlParkImg).into(ivDtlParkImg);

        tvDtlParkWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent accessWebBrowser = new Intent(Intent.ACTION_VIEW);
                    accessWebBrowser.setData(Uri.parse(dtlParkWeb));
                    startActivity(accessWebBrowser);
            }
        });
    }


}
