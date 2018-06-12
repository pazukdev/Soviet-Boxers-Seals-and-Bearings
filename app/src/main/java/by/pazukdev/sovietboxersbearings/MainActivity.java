package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAboutApp;
    private Button buttonSV;
    private Button button650ccIMZ;
    private Button button650ccKMZ;
    private Button button650cc720ccOHV;
    private Button button750ccOHV;
    private Button buttonDifferent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        buttonSV = (Button)findViewById(R.id.button_SV);
        button650ccIMZ =(Button)findViewById(R.id.button_650cc_IMZ);
        button650ccKMZ = (Button)findViewById(R.id.button_650cc_KMZ);
        button650cc720ccOHV = (Button)findViewById(R.id.button_650_720cc_OHV);
        button750ccOHV = (Button)findViewById(R.id.button_750cc_OHV);
        buttonAboutApp = (Button)findViewById(R.id.button_about_app);
        buttonDifferent = (Button)findViewById(R.id.button_different);



        buttonSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModelsListSV.class);
                startActivity(intent);
            }
        });

        button650ccIMZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModelsList650ccIMZ.class);
                startActivity(intent);
            }
        });

        button650ccKMZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModelsList650ccKMZ.class);
                startActivity(intent);
            }
        });

        button650cc720ccOHV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, ModelList650cc720cc.class);
                //startActivity(intent);
            }
        });

        button750ccOHV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, ModelsList750ccOHV.class);
                //startActivity(intent);
            }
        });

        buttonAboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        AboutApp.class);
                startActivity(intent);
            }
        });

        buttonDifferent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Different.class);
                startActivity(intent);
            }
        });





    }
}
