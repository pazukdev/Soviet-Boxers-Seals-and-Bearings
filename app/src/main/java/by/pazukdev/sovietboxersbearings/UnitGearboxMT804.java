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

public class UnitGearboxMT804 extends AppCompatActivity {

    private Button buttonBearing1ClutchShaft;
    private Button buttonBearing2ClutchShaft;
    private Button buttonBearingMainShaft;
    private Button buttonBearingClutchBearing;
    private Button buttonSealGearboxClutchShaft;
    private Button buttonSealGearboxMainShaft;
    private Button buttonSealGearboxKickstarterShaft;
    private Button buttonSealGearboxSideCovers;
    private Button buttonSealGearboxClutchReleaseRodSeal;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_gearbox_mt804);

        buttonBearing1ClutchShaft = (Button)findViewById(R.id.button_bearing1_clutch_shaft);
        buttonBearing2ClutchShaft = (Button)findViewById(R.id.button_bearing2_clutch_shaft);
        buttonBearingMainShaft = (Button)findViewById(R.id.button_bearing_main_shaft);
        buttonBearingClutchBearing = (Button)findViewById(R.id.button_bearing_clutch_bearing);
        buttonSealGearboxClutchShaft = (Button)findViewById(R.id.button_seal_gearbox6204_clutch_shaft);
        buttonSealGearboxMainShaft = (Button)findViewById(R.id.button_seal_gearbox6204_main_shaft);
        buttonSealGearboxKickstarterShaft = (Button)findViewById(R.id.button_seal_gearbox6204_kickstarter_shaft);
        buttonSealGearboxSideCovers = (Button)findViewById(R.id.button_seal_gearbox6204_side_covers);
        buttonSealGearboxClutchReleaseRodSeal = (Button)findViewById(R.id.button_seal_clutch_release_rod);

        buttonBearing1ClutchShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        Bearing205.class);
                startActivity(intent);
            }
        });

        buttonBearing2ClutchShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        Bearing303.class);
                startActivity(intent);
            }
        });

        buttonBearingMainShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        Bearing304.class);
                startActivity(intent);
            }
        });

        buttonBearingClutchBearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        BearingClutchBearing.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxClutchShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        SealGearboxMTClutchShaft.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxMainShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        SealGearboxMTMainShaft.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxKickstarterShaft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        SealGearboxMTKickstarter.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxSideCovers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        SealGearshiftLever.class);
                startActivity(intent);
            }
        });

        buttonSealGearboxClutchReleaseRodSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGearboxMT804.this,
                        SealClutchReleaseRodKMZ.class);
                startActivity(intent);
            }
        });

    }



}
