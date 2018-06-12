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

public class ModelM67_36 extends AppCompatActivity {

    private Button buttonEngine;
    private Button buttonGearbox;
    private Button buttonFinalDrive;
    private Button buttonFrame;
    private Button buttonGenerator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_m67_36);

        buttonEngine = (Button) findViewById(R.id.button_engine);
        buttonGearbox = (Button)findViewById(R.id.button_gearbox);
        buttonFinalDrive = (Button)findViewById(R.id.button_final_drive);
        buttonFrame = (Button)findViewById(R.id.button_frame);
        buttonGenerator = (Button) findViewById(R.id.button_generator);


        buttonEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM67_36.this,
                        UnitEngineM67_36.class);
                startActivity(intent);
            }
        });

        buttonGearbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM67_36.this,
                        UnitGearbox810104001.class);
                startActivity(intent);
            }
        });

        buttonFinalDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM67_36.this,
                        UnitFinalDriveM63.class);
                startActivity(intent);
            }
        });

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM67_36.this,
                        UnitFrameM67.class);
                startActivity(intent);
            }
        });

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelM67_36.this,
                        UnitGeneratorG424.class);
                startActivity(intent);
            }
        });

    }



}
