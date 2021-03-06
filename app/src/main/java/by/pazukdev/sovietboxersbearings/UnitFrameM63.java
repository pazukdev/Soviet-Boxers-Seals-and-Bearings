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

public class UnitFrameM63 extends AppCompatActivity {
    private Button buttonBearing778707;
    private Button buttonBearing7204;

    private Button buttonSeal6206006;
    private Button buttonSealSteeringHead1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_frame_m63);

        buttonBearing778707 = (Button)findViewById(R.id.button_bearing_778707);
        buttonBearing7204 = (Button)findViewById(R.id.button_bearing_7204);

        buttonSeal6206006 = (Button)findViewById(R.id.button_seal_6206006l);
        buttonSealSteeringHead1 = (Button)findViewById(R.id.button_seal_steeringhead_1);

        buttonBearing778707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameM63.this, Bearing778707.class);
                startActivity(intent);

            }
        });

        buttonBearing7204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameM63.this, Bearing7204.class);
                startActivity(intent);

            }
        });

        buttonSeal6206006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameM63.this, SealWheelHub.class);
                startActivity(intent);

            }
        });

        buttonSealSteeringHead1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitFrameM63.this, SealSteeringHeadMT10_36.class);
                startActivity(intent);
            }
        });






    }
}
