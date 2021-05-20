package sg.edu.rp.c346.id20019018.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;
    TextView tvMod3;
    TextView tvMod4;
    TextView tvMod5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.tvMod1);
        tvMod2 = findViewById(R.id.tvMod2);
        tvMod3 = findViewById(R.id.tvMod3);
        tvMod4 = findViewById(R.id.tvMod4);
        tvMod5 = findViewById(R.id.tvMod5);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleActivity.class);
                i.putExtra("Code",getString(R.string.code1));
                i.putExtra("Name",getString(R.string.name1));
                i.putExtra("Year",getString(R.string.year));
                i.putExtra("Sem",getString(R.string.sem));
                i.putExtra("Credit",getString(R.string.credit));
                i.putExtra("Venue",getString(R.string.venue1));
                startActivity(i);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleActivity.class);
                i.putExtra("Code",getString(R.string.code2));
                i.putExtra("Name",getString(R.string.name2));
                i.putExtra("Year",getString(R.string.year));
                i.putExtra("Sem",getString(R.string.sem));
                i.putExtra("Credit",getString(R.string.credit));
                i.putExtra("Venue",getString(R.string.venue234));
                startActivity(i);
            }
        });

        tvMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleActivity.class);
                i.putExtra("Code",getString(R.string.code3));
                i.putExtra("Name",getString(R.string.name3));
                i.putExtra("Year",getString(R.string.year));
                i.putExtra("Sem",getString(R.string.sem));
                i.putExtra("Credit",getString(R.string.credit));
                i.putExtra("Venue",getString(R.string.venue234));
                startActivity(i);
            }
        });

        tvMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleActivity.class);
                i.putExtra("Code",getString(R.string.code4));
                i.putExtra("Name",getString(R.string.name4));
                i.putExtra("Year",getString(R.string.year));
                i.putExtra("Sem",getString(R.string.sem));
                i.putExtra("Credit",getString(R.string.credit));
                i.putExtra("Venue",getString(R.string.venue234));
                startActivity(i);
            }
        });

        tvMod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleActivity.class);
                i.putExtra("Code",getString(R.string.code5));
                i.putExtra("Name",getString(R.string.name5));
                i.putExtra("Year",getString(R.string.year));
                i.putExtra("Sem",getString(R.string.sem));
                i.putExtra("Credit",getString(R.string.credit));
                i.putExtra("Venue",getString(R.string.venue5));
                startActivity(i);
            }
        });
    }
}