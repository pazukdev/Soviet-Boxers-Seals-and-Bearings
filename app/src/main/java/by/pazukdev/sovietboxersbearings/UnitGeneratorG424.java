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

public class UnitGeneratorG424 extends AppCompatActivity {
    private Button buttonBearingG424;
    private Button buttonSealG424;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_generator_g424);


        buttonBearingG424 = (Button)findViewById(R.id.button_bearing_g424);
        buttonSealG424 = (Button)findViewById(R.id.button_seal_g424);

        buttonBearingG424.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG424.this,
                        BearingGeneratorG424.class);
                startActivity(intent);
            }
        });



        buttonSealG424.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnitGeneratorG424.this,
                        SealGeneratorG424.class);
                startActivity(intent);
            }
        });



    }
}
