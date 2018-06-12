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

public class BearingRollerM66_5x12mm extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bearing_roller_m66_5x12mm);

        button1 = (Button)findViewById(R.id.button_roller);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BearingRollerM66_5x12mm.this,
                        BearingRollerM66_5x12mm_2.class);
                startActivity(intent);
            }
        });
    }
}
