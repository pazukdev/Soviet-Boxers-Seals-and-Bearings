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

public class OilFilterM66 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oil_filter_m66);

        button1 = (Button)findViewById(R.id.button_replacer);
        button2 = (Button)findViewById(R.id.button_replacer1);
        button3 = (Button)findViewById(R.id.button_replacer2);
        button4 = (Button)findViewById(R.id.button_replacer3);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OilFilterM66.this,
                        OilFilterHF895.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OilFilterM66.this,
                        OilFilterLyvny.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OilFilterM66.this, OilFilterEmgo.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OilFilterM66.this, OilFilterHF161.class);
                startActivity(intent);
            }
        });
    }
}
