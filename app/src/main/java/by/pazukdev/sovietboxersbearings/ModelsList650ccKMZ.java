package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 06.07.2017.
 */

public class ModelsList650ccKMZ extends AppCompatActivity {

    private Button buttonK650;
    private Button buttonMT9;
    private Button buttonMT10;
    private Button buttonMT10_36;
    private Button buttonMV650;
    private Button buttonMT11;
    private Button buttonMV650M;
    private Button buttonMT16;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.models_list_650cc_kmz);


        buttonK650 = (Button)findViewById(R.id.buttonM72);
        buttonMT9 = (Button)findViewById(R.id.buttonM72M);
        buttonMT10 = (Button)findViewById(R.id.buttonM72N);
        buttonMT10_36 = (Button)findViewById(R.id.buttonK750);
        buttonMV650 = (Button)findViewById(R.id.buttonK750V);
        buttonMT11 = (Button)findViewById(R.id.buttonK750M);
        buttonMV650M = (Button)findViewById(R.id.buttonMV750);
        buttonMT16 = (Button)findViewById(R.id.buttonMV750M);


        buttonK650.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelK650.class);
                startActivity(intent);
            }
        });

        buttonMT9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMT9.class);
                startActivity(intent);
            }
        });

        buttonMT10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMT10.class);
                startActivity(intent);
            }
        });


        buttonMT10_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMT10_36.class);
                startActivity(intent);

            }
        });

        buttonMV650.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMV650.class);
                startActivity(intent);
            }
        });

        buttonMT11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMT11.class);
                startActivity(intent);
            }
        });

        buttonMV650M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMV650M.class);
                startActivity(intent);
            }
        });


        buttonMT16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccKMZ.this, ModelMT16.class);
                startActivity(intent);

            }
        });


    }
}
