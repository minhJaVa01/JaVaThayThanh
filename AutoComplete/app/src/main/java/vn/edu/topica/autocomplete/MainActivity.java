package vn.edu.topica.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtTen ,txtThongTin;
    Button btnXacNhan;
    // bo 3 nguyen tu
    String []arrTinhThanh;// nguồn dữ liệu
    ArrayAdapter<String>adapterTinhThanh;// adapter
    AutoCompleteTextView autoTinhThanh;// autocomplete

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXacNhan();
            }
        });

    }

    private void xuLyXacNhan() {
        String s = " TÊN :" +txtTen.getText().toString() +"\n  NƠI SINH :"+ autoTinhThanh.getText().toString();
        txtThongTin.setText(s);
    }

    private void addControls() {
        txtTen = this.<EditText>findViewById(R.id.txtTen);
        txtThongTin = this.<EditText>findViewById(R.id.txtThongTin);
        btnXacNhan = this.<Button>findViewById(R.id.btnXacNhan);
        autoTinhThanh = this.<AutoCompleteTextView>findViewById(R.id.autoTinhThanh);
        //
        arrTinhThanh = getResources().getStringArray(R.array.arrTinhThanh);
        adapterTinhThanh = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrTinhThanh);
        autoTinhThanh.setAdapter(adapterTinhThanh);

    }
}
