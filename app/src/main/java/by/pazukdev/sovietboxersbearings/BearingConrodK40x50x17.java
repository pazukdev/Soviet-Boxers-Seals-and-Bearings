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

public class BearingConrodK40x50x17 extends AppCompatActivity {

    //private Button button1;
    //private Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bearing_conrod_k40x50x17);

        /*button1 = (Button)findViewById(R.id.button_roller);
        button2 = (Button)findViewById(R.id.button_cage);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BearingConrodBigEndM66.this,
                        BearingRollerM66_5x12mm.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BearingConrodBigEndM66.this,
                        BearingRollerM66_cage.class);
                startActivity(intent);
            }
        });*/
    }
}
