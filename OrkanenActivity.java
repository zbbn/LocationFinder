package zbn.locationfinder;

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

/**
 * Created by zbn on 2017-04-10.
 */

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


        if (res.startsWith("a") || res.startsWith("A") || res.startsWith("b") || res.startsWith("B") || res.startsWith("c") ||res.startsWith("C")) {
            if (res.length() == 1 || res.length() >=6) {
                image.setImageResource(R.mipmap.ic_launcher_round);
            }
            else if (String.valueOf(res.charAt(1)).equals("1")) {
                // OM ABC OCH 1***
                //image.setImageResource(R.mipmap.orkanenplan1abc);
                try {
                    URL ORABC1 = new URL("https://ddwap.mah.se/AG2465/ORA1.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC1.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("2")) {
                // OM ABC OCH 2***
                //image.setImageResource(R.mipmap.orkanenplan2abc);
                try {
                    URL ORABC2 = new URL("https://ddwap.mah.se/AG2465/ORA2.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC2.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("3")) {
                // OM ABC OCH 3***
                //image.setImageResource(R.mipmap.orkanenplan3abc);
                try {
                    URL ORABC3 = new URL("https://ddwap.mah.se/AG2465/ORA3.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC3.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("4")) {
                // OM ABC och 4**
                //image.setImageResource(R.mipmap.orkanenplan4abc);
                try {
                    URL ORABC4 = new URL("https://ddwap.mah.se/AG2465/ORA4.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC4.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("5")) {
                // OM ABC och 5**
                //image.setImageResource(R.mipmap.orkanenplan5abc);
                try {
                    URL ORABC5 = new URL("https://ddwap.mah.se/AG2465/ORA5.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORABC5.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)) == null) {
                image.setImageResource(R.mipmap.ic_launcher_round);
            }

        } else if (res.startsWith("d") || res.startsWith("D") || res.startsWith("e") || res.startsWith("E") || res.startsWith("f") ||res.startsWith("F")) {
            if (String.valueOf(res.charAt(1)).equals("1")) {
                // OM DEF och 1***
                //image.setImageResource(R.mipmap.orkanenplan1def);
                try {
                    URL ORDEF1 = new URL("https://ddwap.mah.se/AG2465/ORD1.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF1.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("2")) {
                // OM DEF och 2**
                //image.setImageResource(R.mipmap.orkanenplan2def);
                try {
                    URL ORDEF2 = new URL("https://ddwap.mah.se/AG2465/ORD2.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF2.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("3")) {
                // OM DEF OCH 3***
                //image.setImageResource(R.mipmap.orkanenplan3def);
                try {
                    URL ORDEF3 = new URL("https://ddwap.mah.se/AG2465/ORD3.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF3.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else if (String.valueOf(res.charAt(1)).equals("4")) {
                // OM DEF och 4**
                //image.setImageResource(R.mipmap.orkanenplan4def);
                try {
                    URL ORDEF4 = new URL("https://ddwap.mah.se/AG2465/ORD4.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF4.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }

            } else if (String.valueOf(res.charAt(1)).equals("5")) {
                // OM DEF och 5**
                //image.setImageResource(R.mipmap.orkanenplan5def);
                try {
                    URL ORDEF5 = new URL("https://ddwap.mah.se/AG2465/ORD5.png");
                    Bitmap bmp = BitmapFactory.decodeStream(ORDEF5.openConnection().getInputStream());
                    image.setImageBitmap(bmp);
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } else {
                image.setImageResource(R.mipmap.ic_launcher_round);
            }
        }
    }
}