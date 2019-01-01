package demo.quoctuan.com.listview_dulieuthaydoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static demo.quoctuan.com.listview_dulieuthaydoi.R.id.lvTen;

public class MainActivity extends AppCompatActivity {
    ArrayList<String>arrTen;
    ArrayAdapter<String>adapterTen;
    ListView lvTen;
    EditText txtTen;
    Button btnLuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        arrTen = new ArrayList<String>();
        adapterTen = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTen
                );
        lvTen = this.<ListView>findViewById(R.id.lvTen);
        lvTen.setAdapter(adapterTen);
        txtTen = this.<EditText>findViewById(R.id.txtNhapten);
        btnLuu = this.<Button>findViewById(R.id.btnLuu);
    }


    private void addEvents() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuu();
            }
        });

    }

    private void xuLyLuu() {
        String ten =txtTen.getText().toString();
        arrTen.add(ten);//them dữ liệu vào aray;
        adapterTen.notifyDataSetChanged();// ra lenh cho listview update lai interface(giao diien)
        txtTen.setText("");
        txtTen.requestFocus();
    }
}
