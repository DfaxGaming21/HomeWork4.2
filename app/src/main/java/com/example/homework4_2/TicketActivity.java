package com.example.homework4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TicketActivity extends AppCompatActivity {

    private TextView dataMainActivity;
    private Button button;

    private Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        dataMainActivity = findViewById(R.id.dataTicket);
        button = findViewById(R.id.button);


        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {

            ticket = (Ticket) bundleIntent.getSerializable(Ticket.class.getSimpleName());

            dataMainActivity.setText("Id: " + ticket.getId() + "\n"
                    + "Время отбытия и прибытия: "+ ticket.getArrivalDeparture() + "\n"
                    + "Место отбытия и прибытия: "+ ticket.getTime()+ "\n"
                    + "Цена: " + ticket.getCost()
            );
        }

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}