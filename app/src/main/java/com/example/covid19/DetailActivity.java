package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
private int positionCountry;
private TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        positionCountry = getIntent().getIntExtra("Position",0);
        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.detail_country);
        tvCases = findViewById(R.id.detail_total_Cases);
        tvRecovered = findViewById(R.id.detail_Recovered);
        tvCritical = findViewById(R.id.detail_critical);
        tvActive = findViewById(R.id.detail_active);
        tvTodayCases = findViewById(R.id.detail_Cases);
        tvTotalDeaths = findViewById(R.id.detail_total_deaths);
        tvTodayDeaths = findViewById(R.id.detail_deaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeaths());
    }
}