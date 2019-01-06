package vn.edu.topica.hocdatepickerandtimepicker2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ImageButton btnDate,btnTime;
    TextView txtDate,txtTime;
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat sDF1= new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sDf2 = new SimpleDateFormat("HH:mm:ss");
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
        btnTime= this.<ImageButton>findViewById(R.id.btnTime);
        calendar =Calendar.getInstance();
        txtDate.setText(sDF1.format(calendar.getTime()));
        txtTime.setText(sDf2.format(calendar.getTime()));
    }

    private void addEvents() {
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyDatepicker();
            }
        });
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTimePicKer();
            }
        });

    }

    private void xuLyTimePicKer() {
        TimePickerDialog.OnTimeSetListener callBack = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
                calendar.set(Calendar.MINUTE,minute);
                txtTime.setText(sDf2.format(calendar.getTime()));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                MainActivity.this,
                callBack,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                true
                );
        timePickerDialog.show();
    }

    private void xuLyDatepicker() {
        DatePickerDialog.OnDateSetListener callBack = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                txtDate.setText(sDF1.format(calendar.getTime()));
            }
        };
        DatePickerDialog dialog = new DatePickerDialog(
                MainActivity.this,
                callBack,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
                );
        dialog.show();

    }
}
