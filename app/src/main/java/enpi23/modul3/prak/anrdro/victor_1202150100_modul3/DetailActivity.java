package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView waterDetailName, waterDetailDeskr, satuanLiter;
    ImageView waterGallon, waterDetailPic;
    int liter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        waterDetailName = (TextView) findViewById(R.id.waterDetailName);
        waterDetailDeskr = (TextView) findViewById(R.id.waterDetailDeskr);
        satuanLiter = (TextView) findViewById(R.id.satuanLiter);
        waterDetailPic = (ImageView) findViewById(R.id.waterDetailPic);
        waterGallon = (ImageView) findViewById(R.id.waterGallon);

        Intent intent = this.getIntent();
        String menu = intent.getExtras().getString("NameMerk");
        String deskripsi = intent.getExtras().getString("InfoMerk");
        int gambar = intent.getExtras().getInt("MerkImage");


        waterDetailName.setText(menu);
        waterDetailDeskr.setText(deskripsi);
        waterDetailPic.setImageResource(gambar);
    }

    public void kurangAirGalon(View view) {
        liter--;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (liter == 0) {
                    waterGallon.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    satuanLiter.setText("20 Liter");
                    Toast.makeText(getApplicationContext(), "Galon Mau Habis", Toast.LENGTH_LONG).show();

                } else if (liter == 1) {
                    waterGallon.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    satuanLiter.setText("30 Liter");

                } else if (liter == 2) {
                    waterGallon.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    satuanLiter.setText("50 Liter");

                } else if (liter == 3) {
                    waterGallon.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    satuanLiter.setText("60 Liter");

                } else if (liter == 4) {
                    waterGallon.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    satuanLiter.setText("80 Liter");

                } else if (liter == 5) {
                    waterGallon.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    satuanLiter.setText("90 Liter");

                } else if (liter == 6) {
                    waterGallon.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    satuanLiter.setText("GALON FULL");
                    Toast.makeText(getApplicationContext(), "Galon Sudah Full", Toast.LENGTH_LONG).show();

                }
            }
        }, 100);

    }

    public void tambahAirGalon(View view) {
        liter++;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (liter == 0) {
                    waterGallon.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    satuanLiter.setText("20 Liter");
                    Toast.makeText(getApplicationContext(), "Galon Mau Habis", Toast.LENGTH_LONG).show();

                } else if (liter == 1) {
                    waterGallon.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    satuanLiter.setText("30 Liter");

                } else if (liter == 2) {
                    waterGallon.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    satuanLiter.setText("50 Liter");

                } else if (liter == 3) {
                    waterGallon.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    satuanLiter.setText("60 Liter");

                } else if (liter == 4) {
                    waterGallon.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    satuanLiter.setText("80 Liter");

                } else if (liter == 5) {
                    waterGallon.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    satuanLiter.setText("90 Liter");

                } else if (liter == 6) {
                    waterGallon.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    satuanLiter.setText("GALON FULL");
                    Toast.makeText(getApplicationContext(), "Galon Sudah Full", Toast.LENGTH_LONG).show();

                }
            }
        }, 100);

    }
}

