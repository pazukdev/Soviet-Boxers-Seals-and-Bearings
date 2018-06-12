package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 13.06.2017.
 */

public class UniversalJointLockRing extends AppCompatActivity {

    private Button buttonReplacer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_joint_cross_lock_ring);

        buttonReplacer = (Button)findViewById(R.id.button_replacer);

        buttonReplacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UniversalJointLockRing.this,
                        UniversalJointLockRingDIN.class));
            }
        });





    }
}
