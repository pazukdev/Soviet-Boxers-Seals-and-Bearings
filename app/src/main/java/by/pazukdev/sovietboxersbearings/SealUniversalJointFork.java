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

public class SealUniversalJointFork extends AppCompatActivity {

    private Button buttonReplacer;
    private Button buttonReplacer1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seal_universal_joint_fork);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);
        buttonReplacer1 = (Button)findViewById(R.id.button_replacer1);


        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealUniversalJointFork.this,
                        SealFDUniversalJointBMW.class);
                startActivity(intent);
            }
        });

        buttonReplacer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SealUniversalJointFork.this,
                        SealFDUniversalJointCorteco.class);
                startActivity(intent);
            }
        });
    }
}
