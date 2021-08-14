package com.example.navdrawerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
private DrawerLayout d1;
private ActionBarDrawerToggle t;
private NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    d1=(DrawerLayout) findViewById(R.id.activity_main);
        d1=findViewById(R.id.activity_main);
        t=new ActionBarDrawerToggle(this,d1,R.string.open,R.string.close);
        d1.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv=(NavigationView) findViewById(R.id.nv);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( @NonNull  MenuItem item) {
                int id=item.getItemId();
                switch (id){
                    case R.id.account:
                        Toast.makeText(MainActivity.this,"My Acoount",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.setting:
                        Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mycart:
                        Toast.makeText(MainActivity.this,"My Cart",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
       if(t.onOptionsItemSelected(item))
           return  true;
       return super.onOptionsItemSelected(item);
    }
}