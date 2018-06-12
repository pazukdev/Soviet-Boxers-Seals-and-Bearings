package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 06.07.2017.
 */

public class PistonDneprMT9Assembly extends AppCompatActivity {

    private Button buttonPiston;
    private Button buttonPistonRings;
    private Button buttonPistonPin;
    private Button buttonPistonPinCirclip;
    private Button buttonReplacer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piston_dnepr_mt9_assembly);

        buttonPiston = (Button)findViewById(R.id.button_piston);
        buttonPistonRings = (Button)findViewById(R.id.button_piston_rings);
        buttonPistonPin = (Button)findViewById(R.id.button_piston_pin);
        buttonPistonPinCirclip = (Button)findViewById(R.id.button_piston_pin_circlip);
        buttonReplacer = (Button)findViewById(R.id.button_replacer);

        buttonPiston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonDneprMT9Assembly.this,
                        PistonDneprMT9.class);
                startActivity(intent);
            }
        });

        buttonPistonRings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonDneprMT9Assembly.this,
                        PistonRingsKitDneprK650.class);
                startActivity(intent);
            }
        });

        buttonPistonPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonDneprMT9Assembly.this,
                        PistonPin21x66mm.class);
                startActivity(intent);
            }
        });

        buttonPistonPinCirclip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonDneprMT9Assembly.this,
                        PistonPinCirclip.class);
                startActivity(intent);
            }
        });

        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonDneprMT9Assembly.this,
                        PistonDneprAlmotAssembly.class);
                startActivity(intent);
            }
        });

    }
}
