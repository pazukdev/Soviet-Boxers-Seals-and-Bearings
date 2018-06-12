package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 25.06.2017.
 */

public class UnitFinalDriveSidecarKMZ extends AppCompatActivity {

    private Button buttonBearingDifferencialCup;
    private Button buttonBearingDrivePinion;
    private Button buttonBearing2DifferentialCover;
    private Button buttonBearingSidecarReductionDriveLeftHandCover;

    private Button buttonSealFinalDriveCasingSeal;
    private Button buttonSealUniversalJoint2Seal;

    private Button buttonUniversalJointCrossAssembly;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_final_drive_sidecar_kmz);


        buttonBearingDifferencialCup = (Button)findViewById(R.id.button_bearing_differencial_cup);
        buttonBearingDrivePinion = (Button)findViewById(R.id.button_bearing_drive_pinion);
        buttonBearing2DifferentialCover = (Button)findViewById(R.id.button_bearing2_differential_cover);
        buttonBearingSidecarReductionDriveLeftHandCover = (Button)
                findViewById(R.id.button_bearing_left_sidecar_ruduction_drive_cover);

        buttonSealFinalDriveCasingSeal = (Button)findViewById(R.id.button_final_drive_casing_seal);
        buttonSealUniversalJoint2Seal = (Button)findViewById(R.id.button_universal_joint_2_seal);

        buttonUniversalJointCrossAssembly = (Button)findViewById(R.id.button_universal_joint_cross_assembly);



        buttonBearingDifferencialCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        Bearing110.class);
                startActivity(intent);
            }
        });


        buttonBearingDrivePinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        Bearing3086304L.class);
                startActivity(intent);
            }
        });


        buttonBearing2DifferentialCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this, Bearing204.class);
                startActivity(intent);
            }
        });

        buttonBearingSidecarReductionDriveLeftHandCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        Bearing206.class);
                startActivity(intent);
            }
        });

        buttonSealFinalDriveCasingSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        SealFinalDriveCasing.class);
                startActivity(intent);
            }
        });


        buttonSealUniversalJoint2Seal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        SealUniversalJointFork.class);
                startActivity(intent);
            }
        });

        buttonUniversalJointCrossAssembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveSidecarKMZ.this,
                        UniversalJointCrossAssembly.class);
                startActivity(intent);
            }
        });






    }
}
