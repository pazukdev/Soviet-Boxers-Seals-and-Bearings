package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 25.06.2017.
 */

public class UnitGearbox6204M62 extends AppCompatActivity {

    private Button buttonBearing205;
    private Button buttonBearing12204;
    private Button buttonBearing304;
    private Button buttonBearingClutchBearing;

    private Button buttonSealGearbox6204ClutchShaft;
    private Button buttonSealGearbox6204MainShaft;
    private Button buttonSealGearbox6204CickstarterShaft;
    private Button buttonSealGearboxFeltSeal1;
    private Button buttonSealGearboxFeltSeal2;
    private Button buttonSealGearboxSideCovers;
    private Button buttonSealGearboxClutchReleaseRodSeal;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_gearbox_6204_m62);

        buttonBearing205 = (Button)findViewById(R.id.button_bearing_205);
        buttonBearing12204 = (Button)findViewById(R.id.button_bearing_12204);
        buttonBearing304 = (Button)findViewById(R.id.button_bearing_304);
        buttonBearingClutchBearing = (Button)findViewById(R.id.button_bearing_clutch_bearing);

        buttonSealGearbox6204ClutchShaft = (Button)findViewById(R.id.button_seal_gearbox6204_clutch_shaft);
        buttonSealGearbox6204MainShaft = (Button)findViewById(R.id.button_seal_gearbox6204_main_shaft);
        buttonSealGearbox6204CickstarterShaft = (Button)findViewById(R.id.button_seal_gearbox6204_kickstarter_shaft);
        buttonSealGearboxFeltSeal1 = (Button)findViewById(R.id.button_felt_seal_1);
        buttonSealGearboxFeltSeal2 = (Button)findViewById(R.id.button_felt_seal_2);
        buttonSealGearboxSideCovers = (Button)findViewById(R.id.button_seal_gearbox6204_side_covers);
        buttonSealGearboxClutchReleaseRodSeal = (Button)findViewById(R.id.button_seal_clutch_release_rod);

        buttonBearing205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        Bearing205.class);
                startActivity(intent);
            }
        });

        buttonBearing12204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        Bearing12204.class);
                startActivity(intent);
            }
        });

        buttonBearing304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        Bearing304.class);
                startActivity(intent);
            }
        });

        buttonBearingClutchBearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        BearingClutchBearing.class);
                startActivity(intent);
            }
        });

        buttonSealGearbox6204ClutchShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox6204ClutchShaft.class);
                startActivity(intent);
            }
        });

        buttonSealGearbox6204MainShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox6204MainShaft.class);
                startActivity(intent);
            }
        });

        buttonSealGearbox6204CickstarterShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox6204Kickstarter.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxFeltSeal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox7204Felt.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxFeltSeal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox7204Gearshift.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxSideCovers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealGearbox7204Gearshift.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxClutchReleaseRodSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearbox6204M62.this,
                        SealClutchReleaseRod6204.class);
                startActivity(intent);
            }
        });

    }



}
