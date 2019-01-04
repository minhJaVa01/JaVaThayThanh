package vn.edu.topica.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtName;

    Button btnXacNhan;
    TextView txtThongTin;
    // Bo 3 nguyen tu
    String []arrTinhThanh;// nguon du lieu
    ArrayAdapter<String>adapterTinhThanh;// adapter cho nguon du lieu
    AutoCompleteTextView autoTinhThanh;//autocompletedListView


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
        String s= txtName.getText().toString()
                + autoTinhThanh.getText().toString();
        txtThongTin.setText(s);
    }

    private void addControls() {
        txtName = this.<EditText>findViewById(R.id.txtName);
        txtThongTin = this.<TextView>findViewById(R.id.txtThongTin);
        btnXacNhan = this.<Button>findViewById(R.id.btnXacNhan);
        autoTinhThanh = this.<AutoCompleteTextView>findViewById(R.id.autotxtTinhThanh);

        arrTinhThanh = getResources().getStringArray(R.array.arrTinhThanh);
        adapterTinhThanh = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrTinhThanh);
        autoTinhThanh.setAdapter(adapterTinhThanh);

    }
}
