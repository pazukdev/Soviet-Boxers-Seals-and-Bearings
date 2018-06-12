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

public class UnitFinalDriveK750M extends AppCompatActivity {

    private Button buttonBearing207;
    private Button buttonBearingNeedleRoller3x16mm;
    private Button buttonBearing3086304L;
    private Button buttonBearing874901;
    private Button buttonSealFinalDriveCasingSeal;
    private Button buttonSealUniversalJointSeal;

    private Button buttonUniversalJointCrossAssembly;
    private Button buttonCardanShaftRing;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_final_drive_k750m);


        buttonBearing207 = (Button)findViewById(R.id.button_bearing_207);
        buttonBearingNeedleRoller3x16mm = (Button)findViewById(R.id.button_needle_roller_3x16mm);
        buttonBearing3086304L = (Button)findViewById(R.id.button_bearing_3086304L);
        buttonBearing874901 = (Button)findViewById(R.id.button_bearing_874901);
        buttonSealFinalDriveCasingSeal = (Button)findViewById(R.id.button_final_drive_casing_seal);
        buttonSealUniversalJointSeal = (Button)findViewById(R.id.button_universal_joint_seal);

        buttonUniversalJointCrossAssembly = (Button)findViewById(R.id.button_universal_joint_cross_assembly);
        buttonCardanShaftRing = (Button)findViewById(R.id.button_cardan_shaft_ring);

        buttonBearing207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        Bearing207.class);
                startActivity(intent);
            }
        });

        buttonBearingNeedleRoller3x16mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        BearingNeedle3x16mm.class);
                startActivity(intent);
            }
        });

        buttonBearing3086304L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        Bearing3086304L.class);
                startActivity(intent);
            }
        });

        buttonBearing874901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        Bearing874901.class);
                startActivity(intent);
            }
        });

        buttonSealFinalDriveCasingSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        SealFinalDriveCasing.class);
                startActivity(intent);
            }
        });

        buttonSealUniversalJointSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        SealUniversalJointFork.class);
                startActivity(intent);
            }
        });

        buttonUniversalJointCrossAssembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        UniversalJointCrossAssembly.class);
                startActivity(intent);
            }
        });

        buttonCardanShaftRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFinalDriveK750M.this,
                        SP_CardanShaftRing.class);
                startActivity(intent);
            }
        });



    }
}
