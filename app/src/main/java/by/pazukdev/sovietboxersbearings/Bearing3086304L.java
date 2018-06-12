package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 05.07.2017.
 */

public class Bearing3086304L extends AppCompatActivity {

    private Button buttonReplacer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bearing_3086304);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);

        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bearing3086304L.this,
                        Bearing3304FAG.class);
                startActivity(intent);
            }
        });

    }
}
