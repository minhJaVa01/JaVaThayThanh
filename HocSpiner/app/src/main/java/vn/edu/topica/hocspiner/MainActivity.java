package vn.edu.topica.hocspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import vn.edu.topica.model.NhanVien;

public class MainActivity extends AppCompatActivity {

    EditText txtName,txtSoNgay;
    Button btnSave;
    Spinner spThu;
    int lastSelected =-1;
    ArrayList<String>dsThu;
    ArrayAdapter<String>adapterThu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXacNhanCongTac();
            }
        });
        spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Ban Chon " +dsThu.get(position),Toast.LENGTH_SHORT).show();
                lastSelected = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private void xuLyXacNhanCongTac() {
        if (lastSelected == -1){
            Toast.makeText(MainActivity.this,"Bạn chưa chọn thứ",Toast.LENGTH_SHORT).show();
            return;
        }
        NhanVien nv  = new NhanVien();
        nv.setTen(txtName.getText().toString());
        nv.setThuBatDauCongTac(dsThu.get(lastSelected));
        nv.setSoNgayCongTacDuKien(Integer.parseInt(txtSoNgay.getText().toString()));

        Toast.makeText(MainActivity.this,nv.toString(),Toast.LENGTH_SHORT).show();
    }

    private void addControls() {
        txtName = this.<EditText>findViewById(R.id.txtName);
        txtSoNgay = this.<EditText>findViewById(R.id.txtsoNgay);
        btnSave = this.<Button>findViewById(R.id.btnSave);
        spThu = this.<Spinner>findViewById(R.id.spThu);
        //nguon du lieu
        dsThu = new ArrayList<>();
        dsThu.add("Thu 2");
        dsThu.add("Thu 3");
        dsThu.add("Thu 4");
        dsThu.add("Thu 5");
        dsThu.add("Thu 6");
        dsThu.add("Thu 7");
        dsThu.add("Thu 8");
        //
        adapterThu =new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                dsThu
                );
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);
    }
}
