package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    private TextView splashtv;
    private ImageView splashiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashtv = (TextView) findViewById(R.id.splashtv);
        splashiv = (ImageView) findViewById(R.id.splashiv);
        Animation transanim = AnimationUtils.loadAnimation(this,R.anim.transition);

        splashiv.startAnimation(transanim);
        splashtv.startAnimation(transanim);

        final Intent transintent = new Intent(this,LoginActivity.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(transintent);
                    finish();
                }
            }
        };
        timer.start();
    }
}