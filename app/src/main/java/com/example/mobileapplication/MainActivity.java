package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateValue(View view) {
        EditText memoryValue = findViewById(R.id.MemoryValue);
        EditText graphicCardValue = findViewById(R.id.GraphicCardValue);
        EditText motherBoardValue = findViewById(R.id.MotherBoardValue);
        EditText cpuValue = findViewById(R.id.CPUValue);
        EditText powerUnitValue = findViewById(R.id.PowerUnitValue);
        EditText ramValue = findViewById(R.id.RAMValue);
        int summary = Integer.parseInt(String.valueOf(memoryValue.getText())) +
                        Integer.parseInt(String.valueOf(graphicCardValue.getText())) +
                        Integer.parseInt(String.valueOf(motherBoardValue.getText())) +
                        Integer.parseInt(String.valueOf(cpuValue.getText())) +
                        Integer.parseInt(String.valueOf(powerUnitValue.getText())) +
                        Integer.parseInt(String.valueOf(ramValue.getText()));

        TextView summary_Value = findViewById(R.id.summaryValue);
        summary_Value.setText("Цена комплектующих = " + summary);
    }
}