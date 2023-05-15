package com.example.homework4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText IDIn;
    private EditText arrivalDepartureIn;
    private EditText timeIn;

    private EditText costIn;
    private Button button;

    private String ID;
    private String arrivalDeparture;
    private String time;
    private String cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDIn = findViewById(R.id.ID);
        arrivalDepartureIn = findViewById(R.id.arrivalDeparture);
        timeIn = findViewById(R.id.time);
        costIn = findViewById(R.id.cost);
        button = findViewById(R.id.button);


        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ID = IDIn.getText().toString();
            arrivalDeparture = arrivalDepartureIn.getText().toString();
            time = timeIn.getText().toString();
            cost = costIn.getText().toString();

            Ticket ticket = new Ticket(ID, arrivalDeparture, time,cost);

            Intent intent = new Intent(getApplicationContext(), TicketActivity.class);

            intent.putExtra(Ticket.class.getSimpleName(), ticket);


            startActivity(intent);
        }
    };
}