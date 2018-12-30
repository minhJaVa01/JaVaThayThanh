package vn.edu.topica.hoctextviewedittextutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    EditText txtA,txtB;
    Button btnTru;
    Button btnNhan,btnChia;
    View.OnClickListener suKienChiaSe =null;
    Button btnAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepTru();
            }
        });
        suKienChiaSe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.btnNhan){
                    xuLyPhepNhan();
                }else if(v.getId()==R.id.btnChia){
                    xuLyPhepChia();
                }
            }
        };
        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);
        btnAn.setOnLongClickListener(this);
    }

    private void xuLyPhepChia() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a/b;
        Toast.makeText(MainActivity.this,"Chia ="+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLyPhepNhan() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a*b;
        Toast.makeText(MainActivity.this,"Nhan ="+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLyPhepTru() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a-b;
        Toast.makeText(MainActivity.this,"TRỪ ="+c,Toast.LENGTH_LONG).show();
    }

    private void addControls() {
        txtA = this.<EditText>findViewById(R.id.txtEditA);
        txtB = this.<EditText>findViewById(R.id.txtEditB);
        btnTru = this.<Button>findViewById(R.id.btnTru);
        btnNhan= this.<Button>findViewById(R.id.btnNhan);
        btnChia= this.<Button>findViewById(R.id.btnChia);
        btnAn = this.<Button>findViewById(R.id.btnAn);
    }

    public void xuLyPhepCong(View v){
        int a = Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a+b;
        Toast.makeText(MainActivity.this,"TỔNG ="+c,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId()==R.id.btnAn){
            btnAn.setVisibility(View.INVISIBLE);
        }
        return false;
    }
}
