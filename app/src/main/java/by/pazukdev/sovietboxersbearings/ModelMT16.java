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

public class ModelMT16 extends AppCompatActivity {

    private Button buttonEngine;
    private Button buttonGearbox;
    private Button buttonFinalDrive;
    private Button buttonSidecarReductionDrive;
    private Button buttonFrame;
    private Button buttonGenerator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_mt16);

        buttonEngine = (Button) findViewById(R.id.button_engine);
        buttonGearbox = (Button)findViewById(R.id.button_gearbox);
        buttonFinalDrive = (Button)findViewById(R.id.button_final_drive);
        buttonSidecarReductionDrive = (Button)findViewById(R.id.button_imz810330);
        buttonFrame = (Button)findViewById(R.id.button_frame);
        buttonGenerator = (Button) findViewById(R.id.button_generator);


        buttonEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this,
                        UnitEngineMT11.class);
                startActivity(intent);
            }
        });

        buttonGearbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this,
                        UnitGearboxKMZ8155.class);
                startActivity(intent);
            }
        });

        buttonFinalDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this,
                        UnitFinalDriveMod2wdMV750M.class);
                startActivity(intent);
            }
        });

        buttonSidecarReductionDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this, UnitFinalDriveSidecarKMZ.class);
                startActivity(intent);
            }
        });

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this,
                        UnitFrameMV650.class);
                startActivity(intent);
            }
        });

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMT16.this,
                        UnitGeneratorG424.class);
                startActivity(intent);
            }
        });

    }



}
