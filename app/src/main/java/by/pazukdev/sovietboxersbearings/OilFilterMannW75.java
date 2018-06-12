package by.pazukdev.sovietboxersbearings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pazuk on 25.06.2017.
 */

public class OilFilterMannW75 extends AppCompatActivity {

    //private Button button1;
    //private Button button2;
    //private Button button3;
    //private Button button4;
    private Button button5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oil_filter_mann_w75);

        //button1 = (Button)findViewById(R.id.button_replacer);
        //button2 = (Button)findViewById(R.id.button_replacer1);
        //button3 = (Button)findViewById(R.id.button_replacer2);
        //button4 = (Button)findViewById(R.id.button_replacer3);
        button5 = (Button)findViewById(R.id.button_adapter);



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OilFilterMannW75.this,
                        OilFilterMannW75Adapter.class);
                startActivity(intent);
            }
        });
    }
}
