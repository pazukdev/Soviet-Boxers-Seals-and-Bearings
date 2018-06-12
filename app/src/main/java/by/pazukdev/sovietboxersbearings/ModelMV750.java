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

public class ModelMV750 extends AppCompatActivity {

    private Button buttonEngine;
    private Button buttonGearbox;
    private Button buttonFinalDrive;
    private Button buttonSidecarReductionDrive;
    private Button buttonFrame;
    private Button buttonGenerator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_mv750);

        buttonEngine = (Button) findViewById(R.id.button_engine);
        buttonGearbox = (Button)findViewById(R.id.button_gearbox);
        buttonFinalDrive = (Button)findViewById(R.id.button_final_drive);
        buttonSidecarReductionDrive = (Button)findViewById(R.id.button_imz810330);
        buttonFrame = (Button)findViewById(R.id.button_frame);
        buttonGenerator = (Button) findViewById(R.id.button_generator);


        buttonEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitEngineK750M.class);
                startActivity(intent);
            }
        });

        buttonGearbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitGearbox6204.class);
                startActivity(intent);
            }
        });

        buttonFinalDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitFinalDriveMod2wdMV750.class);
                startActivity(intent);
            }
        });

        buttonSidecarReductionDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitFinalDriveSidecarKMZ.class);
                startActivity(intent);
            }
        });

        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitFrameMV750.class);
                startActivity(intent);
            }
        });

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelMV750.this,
                        UnitGeneratorG414.class);
                startActivity(intent);
            }
        });

    }



}
