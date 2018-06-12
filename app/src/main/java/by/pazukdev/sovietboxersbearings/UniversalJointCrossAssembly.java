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

public class UniversalJointCrossAssembly extends AppCompatActivity {

    private Button buttonUniversalJointCross;
    private  Button buttonUniversalJointBearing;
    private  Button buttonUniversalJointLockRing;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_joint_cross_assembly);



        buttonUniversalJointCross = (Button)findViewById(R.id.button_universal_joint_cross);
        buttonUniversalJointBearing = (Button)findViewById(R.id.button_universal_joint_bearing);
        buttonUniversalJointLockRing = (Button)findViewById(R.id.button_universal_joint_lock_ring);

        buttonUniversalJointCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UniversalJointCrossAssembly.this,
                        UniversalJointCross.class);
                startActivity(intent);

            }
        });

        buttonUniversalJointBearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UniversalJointCrossAssembly.this,
                        BearingUniversalJoint.class);
                startActivity(intent);

            }
        });

        buttonUniversalJointLockRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UniversalJointCrossAssembly.this,
                        UniversalJointLockRing.class);
                startActivity(intent);

            }
        });



    }
}
