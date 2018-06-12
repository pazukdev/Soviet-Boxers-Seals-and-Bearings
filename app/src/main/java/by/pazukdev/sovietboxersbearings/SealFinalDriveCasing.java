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

public class SealFinalDriveCasing extends AppCompatActivity {

    private Button buttonReplacer;
    private Button buttonReplacer1;
    private Button buttonReplacer2;
    private Button buttonReplacer5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seal_final_drive_casing);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);
        buttonReplacer1 = (Button)findViewById(R.id.button_replacer1);
        buttonReplacer2 = (Button)findViewById(R.id.button_replacer2);
        buttonReplacer5 = (Button)findViewById(R.id.button_replacer5);

        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealFinalDriveCasing.this,
                        SealFDCasingBMW.class);
                startActivity(intent);
            }
        });

        buttonReplacer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealFinalDriveCasing.this,
                        SealFDCasingBMW2.class);
                startActivity(intent);
            }
        });

        buttonReplacer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealFinalDriveCasing.this,
                        SealFDCasingMotoBoxer.class);
                startActivity(intent);
            }
        });

        buttonReplacer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealFinalDriveCasing.this,
                        SealFDCasingCorteco59.class);
                startActivity(intent);
            }
        });
    }
}
