package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 19.06.2017.
 */

public class UnitFrameK750 extends AppCompatActivity {
    private Button buttonBearing778707;
    private Button buttonBearing7204;
    private Button buttonBearingNeedleLever;

    private Button buttonSeal6206006;
    private Button buttonSealSteeringHead1;
    private Button buttonSealSteeringHead2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_frame_k750);

        buttonBearing778707 = (Button)findViewById(R.id.button_bearing_778707);
        buttonBearing7204 = (Button)findViewById(R.id.button_bearing_7204);
        buttonBearingNeedleLever = (Button)findViewById(R.id.button_bearing_needle_lever);

        buttonSeal6206006 = (Button)findViewById(R.id.button_seal_6206006l);
        buttonSealSteeringHead1 = (Button)findViewById(R.id.button_seal_steeringhead_1);
        buttonSealSteeringHead2 = (Button)findViewById(R.id.button_seal_steeringhead_2);

        buttonBearing778707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, Bearing778707.class);
                startActivity(intent);

            }
        });

        buttonBearing7204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, Bearing7204.class);
                startActivity(intent);

            }
        });

        buttonBearingNeedleLever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, BearingNeedleFrontForkK750.class);
                startActivity(intent);
            }
        });

        buttonSeal6206006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, SealWheelHub.class);
                startActivity(intent);

            }
        });

        buttonSealSteeringHead1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, SealSteeringHeadK750Upper.class);
                startActivity(intent);
            }
        });

        buttonSealSteeringHead2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameK750.this, SealSteeringHeadK750Lower.class);
                startActivity(intent);
            }
        });






    }
}
