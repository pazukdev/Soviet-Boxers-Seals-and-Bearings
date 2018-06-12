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

public class ModelsList650ccIMZ extends AppCompatActivity {

    private Button buttonM52;
    private Button buttonM61;
    private Button buttonM62;
    private Button buttonM63;
    private Button buttonM66;
    private Button buttonM67;
    private Button buttonM67_36;
    private Button buttonIMZ810330;
    private Button buttonIMZ810310;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.models_list_650cc_imz);

        buttonM52 = (Button)findViewById(R.id.buttonM72);
        buttonM61 = (Button)findViewById(R.id.button_m61);
        buttonM62 = (Button)findViewById(R.id.button_m62);
        buttonM63 = (Button)findViewById(R.id.button_m63);
        buttonM66 = (Button)findViewById(R.id.button_m66);
        buttonM67 = (Button)findViewById(R.id.button_generator);
        buttonM67_36 = (Button)findViewById(R.id.button_m67_36);
        buttonIMZ810330 = (Button)findViewById(R.id.button_imz810330);
        buttonIMZ810310 = (Button)findViewById(R.id.button_imz810310);

        buttonM52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ModelsList650ccIMZ.this, ModelM52.class);
                //startActivity(intent);
            }
        });

        buttonM61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM61.class);
                startActivity(intent);
            }
        });

        buttonM62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM62.class);
                startActivity(intent);
            }
        });

        buttonM63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM63.class);
                startActivity(intent);
            }
        });

        buttonM66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM66.class);
                startActivity(intent);
            }
        });

        buttonM67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM67.class);
                startActivity(intent);
            }
        });

        buttonM67_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelsList650ccIMZ.this,
                        ModelM67_36.class);
                startActivity(intent);
            }
        });

        buttonIMZ810330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ModelsList650ccIMZ.this, ModelIMZ810330.class);
                //startActivity(intent);
            }
        });

        buttonIMZ810310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ModelsList650ccIMZ.this, ModelIMZ810310.class);
                //startActivity(intent);
            }
        });



    }
}
