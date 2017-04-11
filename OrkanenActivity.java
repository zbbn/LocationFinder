package com.example.addas.locationfinder2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.lang.String;
import java.net.MalformedURLException;
import java.net.URL;


public class OrkanenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        EditText text = (EditText) findViewById(R.id.building);
        text.setText(R.string.or);

        Button button = (Button) findViewById(R.id.buttonSelectRoom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showroom(v);
            }
        });
    }

    public void showroom(View view) {
        ImageView image = (ImageView) findViewById(R.id.orkanen);
        EditText roomid = (EditText) findViewById(R.id.RoomID);
        String res = roomid.getText().toString();

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);




        if (res.startsWith("A") || res.startsWith("B") || res.startsWith("C")|| res.startsWith("a") || res.startsWith("b") || res.startsWith("c")) {
            if (res.length() == 1 || res.length() >=5) {
                image.setImageResource(R.mipmap.ic_launcher_round);
            } else if (res.length() > 1 ) {
                // OM ABC OCH 1***
                //image.setImageResource(R.mipmap.orkanenplan1abc);
                try {
                    URL ORABC1 = new URL("https://ddwap.mah.se/AG2465/ORA"+String.valueOf(res.charAt(1))+".png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC1.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }

            }
        } else if (res.startsWith("D") || res.startsWith("E") || res.startsWith("F") || res.startsWith("d") || res.startsWith("e") || res.startsWith("f")) {
            if (res.length() == 1 || res.length() >=5) {
                image.setImageResource(R.mipmap.ic_launcher_round);
            } else if (res.length() > 1 ) {
                // OM DEF/def och 1***
                //image.setImageResource(R.mipmap.orkanenplan1def);
                try {
                    URL ORDEF1 = new URL("https://ddwap.mah.se/AG2465/ORD"+String.valueOf(res.charAt(1))+".png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF1.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            }
        } else {
            image.setImageResource(R.mipmap.ic_launcher_round);
        }

    }
}