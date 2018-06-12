package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 14.06.2017.
 */

public class UnitGeneratorG414 extends AppCompatActivity {
    private Button buttonBearing201;
    private Button buttonBearing200;

    private Button buttonSealG4143701452;

    private Button button4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_generator_g414);


        buttonBearing201 = (Button)findViewById(R.id.button_bearing_201);
        buttonBearing200 = (Button)findViewById(R.id.button_bearing_200);

        buttonSealG4143701452 = (Button)findViewById(R.id.button_seal_g414);

        button4 = (Button)findViewById(R.id.button_some_part_1);

        buttonBearing201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG414.this,
                        Bearing201.class);
                startActivity(intent);
            }
        });

        buttonBearing200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG414.this,
                        Bearing200.class);
                startActivity(intent);
            }
        });

        buttonSealG4143701452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG414.this,
                        SealGeneratorG414.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG414.this,
                        SP_ScrewPoleShoe.class);
                startActivity(intent);
            }
        });



    }
}
