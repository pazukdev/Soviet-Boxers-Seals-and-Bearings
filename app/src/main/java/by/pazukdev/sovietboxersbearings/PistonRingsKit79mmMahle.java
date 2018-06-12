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

public class PistonRingsKit79mmMahle extends AppCompatActivity {

    private Button buttonReplacer1;
    private Button buttonReplacer2;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piston_rings_kit_79mm_mahle);


        buttonReplacer1 = (Button)findViewById(R.id.button_replacer_1);
        buttonReplacer2 = (Button)findViewById(R.id.button_replacer_2);

        buttonReplacer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonRingsKit79mmMahle.this,
                        PistonRingsKit79mmKS.class);
                startActivity(intent);
            }
        });

        buttonReplacer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonRingsKit79mmMahle.this,
                        PistonRingsKit79mmGoetze.class);
                startActivity(intent);
            }
        });


    }
}
