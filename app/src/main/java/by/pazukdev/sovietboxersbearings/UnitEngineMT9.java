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

public class UnitEngineMT9 extends AppCompatActivity {
    private Button buttonBearing209Roller;
    private Button bottonBearing209Ball;
    private Button buttonBearingConnectingRodBigEnd;
    private Button buttonBearingConnectingRodSmallEnd;
    private Button buttonBearingCamshaftFront;
    private Button buttonBearingCamshaftRear;
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
        setContentView(R.layout.unit_engine_mt9);

        buttonBearing209Roller = (Button)findViewById(R.id.button_bearing_209_roller);
        bottonBearing209Ball = (Button)findViewById(R.id.button_bearing_209_ball);
        buttonBearingConnectingRodBigEnd =
                (Button)findViewById(R.id.button_bearing_conrod_big_end);
        buttonBearingConnectingRodSmallEnd =
                (Button)findViewById(R.id.button_bearing_conrod_small_end);
        buttonBearingCamshaftFront = (Button)findViewById(R.id.button_bearing_camshaft_front);
        buttonBearingCamshaftRear = (Button)findViewById(R.id.button_bearing_camshaft_rear);
        buttonSealCrankshaft = (Button)findViewById(R.id.button_seal_crankshaft);
        buttonSealCamshaft = (Button)findViewById(R.id.button_seal_camshaft);

        buttonPistonKit = (Button)findViewById(R.id.button_piston_kit);
        //buttonIntakeValve = (Button)findViewById(R.id.button_intake_valve);
        //buttonExhaustValve = (Button)findViewById(R.id.button_exhaust_valve);
        buttonFlywheelBolt = (Button)findViewById(R.id.button_flywheel_bolt);
        buttonClutchScrew = (Button)findViewById(R.id.button_clutch_screw);

        buttonSparkPlug = (Button)findViewById(R.id.button_spark_plug);




        buttonBearing209Roller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        Bearing209Roller.class);
                startActivity(intent);
            }
        });

        bottonBearing209Ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        Bearing209Ball.class);
                startActivity(intent);
            }
        });

        buttonBearingConnectingRodBigEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        BearingHalfBearing.class);
                startActivity(intent);
            }
        });

        buttonBearingConnectingRodSmallEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        BearingConrodSmallEnd.class);
                startActivity(intent);
            }
        });

        buttonBearingCamshaftRear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        Bearing204.class);
                startActivity(intent);
            }
        });

        buttonBearingCamshaftFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        Bearing205.class);
                startActivity(intent);
            }
        });



        buttonSealCrankshaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        SealCrankshaftDnepr.class);
                startActivity(intent);
            }
        });

        buttonSealCamshaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        SealCamshaft15x30.class);
                startActivity(intent);
            }
        });

        buttonPistonKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        PistonDneprMT9Assembly.class);
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
                Intent intent = new Intent(UnitEngineMT9.this,
                        SP_BoltFlywheel.class);
                startActivity(intent);
            }
        });

        buttonClutchScrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        SP_ScrewClutch.class);
                startActivity(intent);
            }
        });

        buttonSparkPlug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitEngineMT9.this,
                        SparkPlugA8U.class);
                startActivity(intent);
            }
        });

    }


}
