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

public class PistonRingsKitUral extends AppCompatActivity {

    private Button buttonReplacer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piston_rings_kit_ural);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);


        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PistonRingsKitUral.this,
                        PistonRingsKitUralMotus.class);
                startActivity(intent);
            }
        });



    }
}
