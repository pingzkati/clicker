package com.k.waran.clicker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.TableLayout;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnReset;
    TableLayout allTable;
    View[][] table = new View[10][10];
    String roommap = "##########" + "\n"
            + "#        #" + "\n"
            + "#        #" + "\n"
            + "###      #" + "\n"
            + "###      #" + "\n"
            + "#        #" + "\n"
            + "#   ###  #" + "\n"
            + "#   ###  #" + "\n"
            + "#        #" + "\n"
            + "##########";
    String[] ary = roommap.split("\n");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.buttonClick);
        btnReset = (Button)findViewById(R.id.buttonReset);

        allTable = (TableLayout) findViewById(R.id.tableLayout);
        for(int i=0;i<allTable.getChildCount();i++){
            View tempTableRow = allTable.getChildAt(i);
            if (tempTableRow instanceof TableRow){
                TableRow row = (TableRow) tempTableRow;
                for(int j=0;j<row.getChildCount();j++){
                    table[i][j] = row.getChildAt(j);
                }
            }
        }

        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(ary[i].charAt(j) == '#'){
                    table[i][j].setBackgroundColor(0x22222222);
                }
            }
        }

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

    }
}