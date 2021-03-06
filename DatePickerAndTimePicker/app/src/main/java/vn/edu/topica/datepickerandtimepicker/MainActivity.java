package vn.edu.topica.datepickerandtimepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.util.Calendar.YEAR;

public class MainActivity extends AppCompatActivity {

    TextView txtDate,txtTime;
    ImageButton btnDate,btnTime;
    Calendar cal;
    SimpleDateFormat sDF1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sDF2 = new SimpleDateFormat("HH:mm");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        txtDate = this.<TextView>findViewById(R.id.txtDate);
        txtTime = this.<TextView>findViewById(R.id.txtTime);
        btnDate = this.<ImageButton>findViewById(R.id.btnDate);
        btnTime = this.<ImageButton>findViewById(R.id.btnTime);
        cal =Calendar.getInstance();
        txtDate.setText(sDF1.format(cal.getTime()));
        txtTime.setText((sDF2.format(cal.getTime())));
    }

    private void addEvents() {

        //Xử Lý DATE
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyDate();
            }
        });
        //
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTimepiker();
            }
        });

    }

    private void xuLyTimepiker() {
        TimePickerDialog.OnTimeSetListener callBack = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                cal.set(Calendar.HOUR_OF_DAY,hourOfDay);
                cal.set(Calendar.MINUTE,minute);
                txtTime.setText(sDF2.format(cal.getTime()));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                MainActivity.this,
                callBack,
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                true
        );
        timePickerDialog.show();
    }

    private void xuLyDate() {
        DatePickerDialog.OnDateSetListener callBack = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                cal.set(Calendar.YEAR,year);
                cal.set(Calendar.MONTH,month);
                cal.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                txtDate.setText(sDF1.format(cal.getTime()));
            }
        };
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                MainActivity.this,
                callBack,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
}
