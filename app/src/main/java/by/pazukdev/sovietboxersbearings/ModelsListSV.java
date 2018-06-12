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

public class ModelsListSV extends AppCompatActivity {

    private Button buttonM72;
    private Button buttonM72M;
    private Button buttonM72N;
    private Button buttonK750;
    private Button buttonK750V;
    private Button buttonK750M;
    private Button buttonMV750;
    private Button buttonMV750M;
    private Button buttonMT12;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.models_list_sv);

        buttonM72 = (Button)findViewById(R.id.buttonM72);
        buttonM72M = (Button)findViewById(R.id.buttonM72M);
        buttonM72N = (Button)findViewById(R.id.buttonM72N);
        buttonK750 = (Button)findViewById(R.id.buttonK750);
        buttonK750V = (Button)findViewById(R.id.buttonK750V);
        buttonK750M = (Button)findViewById(R.id.buttonK750M);
        buttonMV750 = (Button)findViewById(R.id.buttonMV750);
        buttonMV750M = (Button)findViewById(R.id.buttonMV750M);
        buttonMT12 = (Button)findViewById(R.id.buttonMT12);


        buttonM72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelM72.class);
                startActivity(intent);
            }
        });

        buttonM72M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelM72M.class);
                startActivity(intent);
            }
        });

        buttonM72N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelM72N.class);
                startActivity(intent);
            }
        });

        buttonK750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelK750.class);
                startActivity(intent);
            }
        });

        buttonK750V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelK750V.class);
                startActivity(intent);
            }
        });


        buttonK750M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelK750M.class);
                startActivity(intent);
            }
        });

        buttonMV750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelMV750.class);
                startActivity(intent);
            }
        });

        buttonMV750M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelMV750M.class);
                startActivity(intent);
            }
        });

        buttonMT12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsListSV.this, ModelMT12.class);
                startActivity(intent);
            }
        });



    }
}
