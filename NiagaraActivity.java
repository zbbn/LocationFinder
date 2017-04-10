package zbn.locationfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by zbn on 2017-04-10.
 */

public class NiagaraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        EditText text = (EditText) findViewById(R.id.building);
        text.setText(R.string.ni);

        Button button = (Button) findViewById(R.id.buttonSelectRoom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_showroom);
                ImageView image = (ImageView) findViewById(R.id.orkanen);
                image.setImageResource(R.mipmap.orkanen1);

            }
        });
    }
}
