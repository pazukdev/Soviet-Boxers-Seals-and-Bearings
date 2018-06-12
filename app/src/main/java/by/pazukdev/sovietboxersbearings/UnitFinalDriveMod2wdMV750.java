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

public class UnitFinalDriveMod2wdMV750 extends AppCompatActivity {

    private Button buttonBearingLeftDifferentialHub;
    private Button buttonBearingDifferencialCup;
    private Button buttonRoller6halfX6half;
    private Button buttonBearingNeedleRoller3x16mm;
    private Button buttonBearingDrivePinion;
    private Button buttonBearing1DifferentialCover;
    private Button buttonBearing2DifferentialCover;
    private Button buttonBearing874901;

    private Button buttonSealFinalDriveCasingSeal;
    private Button buttonSealUniversalJointSeal;
    private Button buttonSealUniversalJoint2Seal;

    private Button buttonUniversalJointCrossAssembly;
    private Button buttonCardanShaftRing;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_final_drive_mod_2wd_mv750);


        buttonBearingLeftDifferentialHub = (Button)findViewById(R.id.button_bearing_left_differential_hub);
        buttonBearingDifferencialCup = (Button)findViewById(R.id.button_bearing_differencial_cup);
        buttonRoller6halfX6half = (Button)findViewById(R.id.button_roller_6half_x_6half);
        buttonBearingNeedleRoller3x16mm = (Button)findViewById(R.id.button_needle_roller_3x16mm);
        buttonBearingDrivePinion = (Button)findViewById(R.id.button_bearing_drive_pinion);
        buttonBearing1DifferentialCover = (Button)findViewById(R.id.button_bearing1_differential_cover);
        buttonBearing2DifferentialCover = (Button)findViewById(R.id.button_bearing2_differential_cover);
        buttonBearing874901 = (Button)findViewById(R.id.button_bearing_874901);

        buttonSealFinalDriveCasingSeal = (Button)findViewById(R.id.button_final_drive_casing_seal);
        buttonSealUniversalJointSeal = (Button)findViewById(R.id.button_universal_joint_seal);
        buttonSealUniversalJoint2Seal = (Button)findViewById(R.id.button_universal_joint_2_seal);

        buttonUniversalJointCrossAssembly = (Button)findViewById(R.id.button_universal_joint_cross_assembly);
        buttonCardanShaftRing = (Button)findViewById(R.id.button_cardan_shaft_ring);

        buttonBearingLeftDifferentialHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        Bearing7000105.class);
                startActivity(intent);
            }
        });

        buttonBearingDifferencialCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        Bearing110.class);
                startActivity(intent);
            }
        });

        buttonRoller6halfX6half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        BearingRoller6halfX6half_mm.class);
                startActivity(intent);
            }
        });

        buttonBearingNeedleRoller3x16mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        BearingNeedle3x16mm.class);
                startActivity(intent);
            }
        });

        buttonBearingDrivePinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        Bearing3086304L.class);
                startActivity(intent);
            }
        });

        buttonBearing1DifferentialCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this, Bearing3086304L.class);
                startActivity(intent);
            }
        });

        buttonBearing2DifferentialCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this, Bearing204.class);
                startActivity(intent);
            }
        });

        buttonBearing874901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        Bearing874901.class);
                startActivity(intent);
            }
        });

        buttonSealFinalDriveCasingSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        SealFinalDriveCasing.class);
                startActivity(intent);
            }
        });

        buttonSealUniversalJointSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        SealUniversalJointFork.class);
                startActivity(intent);
            }
        });

        buttonSealUniversalJoint2Seal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        SealUniversalJointFork.class);
                startActivity(intent);
            }
        });

        buttonUniversalJointCrossAssembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        UniversalJointCrossAssembly.class);
                startActivity(intent);
            }
        });

        buttonCardanShaftRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveMod2wdMV750.this,
                        SP_CardanShaftRing.class);
                startActivity(intent);
            }
        });



    }
}
