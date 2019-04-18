package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla","9808524522",R.drawable.saugat));
        contactsList.add( new Contacts("Rajesh hamal","9805513422",R.drawable.rajesh));
        contactsList.add( new Contacts(" Bhuwan KC","98085256522",R.drawable.bhuwan));
        contactsList.add( new Contacts(" Bipin Karki","98085256522",R.drawable.bipin));
        contactsList.add( new Contacts(" Anmol KC","98085256522",R.drawable.anmol));
        contactsList.add( new Contacts(" Pradeep Khadka","98085256522",R.drawable.pradeep));
        contactsList.add( new Contacts(" Salman Khana","98085256522",R.drawable.salman));
        contactsList.add( new Contacts(" Allu Arjun","98085256522",R.drawable.allu));
        contactsList.add( new Contacts(" Mahesh Babu","98085256522",R.drawable.mahes));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
