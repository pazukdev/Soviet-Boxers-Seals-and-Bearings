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

public class PistonUral extends AppCompatActivity {

    private Button buttonReplacer;
    private Button buttonReplacer1;
    private Button buttonReplacer2;
    private Button buttonReplacer3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piston_ural);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);
        buttonReplacer1 = (Button)findViewById(R.id.button_replacer_1);
        buttonReplacer2 = (Button)findViewById(R.id.button_replacer_2);
        buttonReplacer3 = (Button)findViewById(R.id.button_replacer_3);


        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonUral.this,
                        PistonUralAlmot.class);
                startActivity(intent);
            }
        });

        buttonReplacer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonUral.this,
                        PistonUralAT78.class);
                startActivity(intent);
            }
        });

        buttonReplacer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonUral.this,
                        PistonUralAlmot79.class);
                startActivity(intent);
            }
        });

        buttonReplacer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonUral.this,
                        PistonUralAT79.class);
                startActivity(intent);
            }
        });



    }
}
