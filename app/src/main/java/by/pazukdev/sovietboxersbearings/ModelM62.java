package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 09.06.2017.
 */

public class ModelM62 extends AppCompatActivity {

    private Button buttonEngine;
    private Button buttonGearbox;
    private Button buttonFinalDrive;
    private Button buttonFrame;
    private Button buttonGenerator;
    private Button buttonGenerator2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_m62);

        buttonEngine = (Button) findViewById(R.id.button_engine);
        buttonGearbox = (Button)findViewById(R.id.button_gearbox);
        buttonFinalDrive = (Button)findViewById(R.id.button_final_drive);
        buttonFrame = (Button)findViewById(R.id.button_frame);
        buttonGenerator = (Button) findViewById(R.id.button_generator);

        buttonGenerator2 = (Button) findViewById(R.id.button_generator_2);


        buttonEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM62.this,
                        UnitEngineM62.class);
                startActivity(intent);
            }
        });

        buttonGearbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM62.this,
                        UnitGearbox6204M62.class);
                startActivity(intent);
            }
        });

        buttonFinalDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM62.this,
                        UnitFinalDriveM62.class);
                startActivity(intent);
            }
        });

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM62.this,
                        UnitFrameM62.class);
                startActivity(intent);
            }
        });

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM62.this,
                        UnitGeneratorG414.class);
                startActivity(intent);
            }
        });

        buttonGenerator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ModelM62.this, UnitGeneratorG65.class);
                //startActivity(intent);
            }
        });

    }



}
