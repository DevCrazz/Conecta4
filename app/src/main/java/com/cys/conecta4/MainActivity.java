package com.cys.conecta4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;
    private TableRow tableRow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tableLayout = findViewById(R.id.TableLayout);


        for (int i = 0; i <= 5; i++) {
            tableRow = new TableRow(this);
            tableLayout.addView(tableRow);
            for (int j = 0; j <= 6; j++) {
                ImageButton imageButton = new ImageButton(this);
                //imageButton.setImageResource(R.mipmap.ic_launcher);
                Box box = new Box(imageButton, j, 0);
                box.activate(box.getImageButton());
                tableRow.addView(imageButton);
            }
        }









    }
}