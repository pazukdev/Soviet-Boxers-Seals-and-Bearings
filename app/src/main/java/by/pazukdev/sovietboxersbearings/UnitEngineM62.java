package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 13.06.2017.
 */

public class UnitEngineM62 extends AppCompatActivity {
    private Button buttonBearing207;
    private Button buttonBearingConnectingRodBigEnd;
    private Button buttonBearingConnectingRodSmallEnd;
    private Button buttonBearing205;
    private Button buttonBearingCamshaftBushingRear;
    private Button buttonSealCrankshaft;
    private Button buttonSealCamshaft;

    private Button buttonPistonKit;
    //private Button buttonIntakeValve;
    //private Button buttonExhaustValve;
    //private Button buttonValveGuide;
    private Button buttonFlywheelBolt;
    private Button buttonClutchScrew;

    private Button buttonSparkPlug;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_engine_m62);

        buttonBearing207 = (Button)findViewById(R.id.button_bearing_207);
        buttonBearingConnectingRodBigEnd =
                (Button)findViewById(R.id.button_bearing_conrod_big_end);
        buttonBearingConnectingRodSmallEnd =
                (Button)findViewById(R.id.button_bearing_conrod_small_end);
        buttonBearing205 = (Button)findViewById(R.id.button_bearing_205);
        buttonBearingCamshaftBushingRear = (Button)findViewById(R.id.button_bearing_camshaft_bushing_rear);
        buttonSealCrankshaft = (Button)findViewById(R.id.button_seal_crankshaft);
        buttonSealCamshaft = (Button)findViewById(R.id.button_seal_camshaft);

        buttonPistonKit = (Button)findViewById(R.id.button_piston_kit);
        //buttonIntakeValve = (Button)findViewById(R.id.button_intake_valve);
        //buttonExhaustValve = (Button)findViewById(R.id.button_exhaust_valve);
        buttonFlywheelBolt = (Button)findViewById(R.id.button_flywheel_bolt);
        buttonClutchScrew = (Button)findViewById(R.id.button_clutch_screw);

        buttonSparkPlug = (Button)findViewById(R.id.button_spark_plug);




        buttonBearing207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        Bearing207.class);
                startActivity(intent);
            }
        });

        buttonBearingConnectingRodBigEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        BearingConrodBigEndM72.class);
                startActivity(intent);
            }
        });

        buttonBearingConnectingRodSmallEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        BearingConrodSmallEnd.class);
                startActivity(intent);
            }
        });

        buttonBearingCamshaftBushingRear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        BearingCamshaftBushingRear.class);
                startActivity(intent);
            }
        });

        buttonBearing205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        Bearing205.class);
                startActivity(intent);
            }
        });



        buttonSealCrankshaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        SealCrankshaft50x70.class);
                startActivity(intent);
            }
        });

        buttonSealCamshaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        SealCamshaft15x30.class);
                startActivity(intent);
            }
        });

        buttonPistonKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        PistonUralAssembly.class);
                startActivity(intent);
            }
        });

        /*buttonIntakeValve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM66.this,
                        SP_ValveUralIntake.class);
                startActivity(intent);
            }
        });

        buttonExhaustValve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(UnitEngineM66.this,
                //        SP_ValveUralExhaust.class);
                //startActivity(intent);
            }
        });*/

        buttonFlywheelBolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        SP_BoltFlywheel.class);
                startActivity(intent);
            }
        });

        buttonClutchScrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        SP_ScrewClutch.class);
                startActivity(intent);
            }
        });

        buttonSparkPlug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineM62.this,
                        SparkPlugA8U.class);
                startActivity(intent);
            }
        });


    }


}
