package sg.edu.rp.c346.id20019018.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSem = findViewById(R.id.tvSem);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);

        Intent i = getIntent();
        String modCode = i.getStringExtra("Code");
        String modName = i.getStringExtra("Name");
        String modYear = i.getStringExtra("Year");
        String modSem = i.getStringExtra("Sem");
        String modCredit = i.getStringExtra("Credit");
        String modeVenue = i.getStringExtra("Venue");

        tvCode.setText("Module Code: " + modCode);
        tvName.setText("Module Name: " + modName);
        tvYear.setText("Academic Year: " + modYear);
        tvSem.setText("Semester: " + modSem);
        tvCredit.setText("Module Credit: " + modCredit);
        tvVenue.setText("Venue: " + modeVenue);

    }
}