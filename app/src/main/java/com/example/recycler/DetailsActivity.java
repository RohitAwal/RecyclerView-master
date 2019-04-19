package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView imgProfile;
    TextView tvname, tvcontact, tvaddress, tvemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgProfile = findViewById(R.id.imgProfile);
        tvname = findViewById(R.id.tvname);
        tvcontact = findViewById(R.id.tvcontact);
        tvaddress = findViewById(R.id.tvaddress);
        tvemail = findViewById(R.id.tvemail);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            imgProfile.setImageResource(bundle.getInt("image"));
            tvname.setText(bundle.getString("name"));
            tvcontact.setText(bundle.getString("phone"));
            tvaddress.setText(bundle.getString("add"));
            tvemail.setText(bundle.getString("ema"));
        }

    }}