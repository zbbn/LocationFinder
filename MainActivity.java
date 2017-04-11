package zbn.locationfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by zbn on 2017-04-10.
 */

/*
    Class that creates the main window.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.location_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            /*
                Represents the choices in the spinner, which are "Orkanen", "Niagara" & "Gäddan" and sends the user to the particular class.
             */
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (spinner.getSelectedItem().toString() ){
                    case "Orkanen":
                        Intent intentOrkanen = new Intent(MainActivity.this, zbn.locationfinder.OrkanenActivity.class);
                        startActivity(intentOrkanen);
                        break;
                    case "Niagara":
                        Intent intentNiagara = new Intent(MainActivity.this, zbn.locationfinder.NiagaraActivity.class);
                        startActivity(intentNiagara);
                        break;
                    case "Gäddan":
                        Intent intentGaddan = new Intent(MainActivity.this, zbn.locationfinder.GaddanActivity.class);
                        startActivity(intentGaddan);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}