package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 07.07.2017.
 */

public class BearingHalfBearingM72FD extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bearing_half_bearing_m72_fd);

        button = (Button)findViewById(R.id.button_needle_roller_3x16mm);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BearingHalfBearingM72FD.this, BearingNeedle3x16mm.class);
                startActivity(intent);
            }
        });

    }
}
