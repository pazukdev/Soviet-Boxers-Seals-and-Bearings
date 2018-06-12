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

public class SP_BoltFlywheel extends AppCompatActivity {

    private Button button1;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_bolt_flywheel);

        button1 = (Button)findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SP_BoltFlywheel.this,
                        SP_BoltFlywheelBMW.class);
                startActivity(intent);
            }
        });




    }
}
