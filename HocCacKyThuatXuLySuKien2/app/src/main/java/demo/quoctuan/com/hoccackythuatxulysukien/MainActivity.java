package demo.quoctuan.com.hoccackythuatxulysukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static demo.quoctuan.com.hoccackythuatxulysukien.R.id.btnAn;
import static demo.quoctuan.com.hoccackythuatxulysukien.R.id.btnTru;
import static demo.quoctuan.com.hoccackythuatxulysukien.R.id.txtEditA;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    EditText txtA,txtB;
    Button btnTru,btnNhan,btnChia,btnAn,btnThoat;
    View.OnClickListener suKienChiaSe =null;

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
                xuLYPhepTru();
            }
        });
        suKienChiaSe =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.btnNhan){
                    xuLyPhepNhan();
                }else if(v.getId()==R.id.btnChia){
                    xuLyPhepChia();
                }
            }
        };
        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);
        btnAn.setOnLongClickListener(this);
        btnThoat.setOnClickListener(new MyEvent());
    }

    private void xuLyPhepChia() {
        int a =Integer.parseInt(txtA.getText().toString());
        int b=Integer.parseInt(txtB.getText().toString());
        int c =a/b;
        Toast.makeText(MainActivity.this,"CHIA ="+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLyPhepNhan() {
        int a=Integer.parseInt(txtA.getText().toString());
        int b =Integer.parseInt(txtB.getText().toString());
        int c=a*b;
        Toast.makeText(MainActivity.this,"Tich="+c,Toast.LENGTH_SHORT).show();
    }

    private void xuLYPhepTru() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b =Integer.parseInt(txtB.getText().toString());
        int c =a-b;
        Toast.makeText(MainActivity.this,"Hiệu ="+c,Toast.LENGTH_SHORT).show();
    }

    private void addControls() {
        txtA = this.<EditText>findViewById(R.id.txtEditA);
        txtB = this.<EditText>findViewById(R.id.txtEditB);
        btnTru = this.<Button>findViewById(R.id.btnTru);
        btnNhan = this.<Button>findViewById(R.id.btnNhan);
        btnChia = this.<Button>findViewById(R.id.btnChia);
        btnAn = this.<Button>findViewById(R.id.btnAn);
        btnThoat = this.<Button>findViewById(R.id.btnThoat);
    }

    public void xuLyPhepCong(View v){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a+b;
        Toast.makeText(MainActivity.this,"Tổng ="+c,Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId()==R.id.btnAn){
            btnAn.setVisibility(View.INVISIBLE);
        }
        return false;
    }
    public class MyEvent implements View.OnClickListener,View.OnLongClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.btnThoat){
                finish();
            }
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }
    public void xuLyDoiManHinh( View v){
        Button btnMoi = new android.support.v7.widget.AppCompatButton(MainActivity.this){
            @Override
            public boolean performClick() {
                setContentView(R.layout.activity_main);
                addControls();
                addEvents();
                return super.performClick();
            }
        };
        btnMoi.setText("quay ve");
        btnMoi.setWidth(200);
        btnMoi.setHeight(200);
        setContentView(btnMoi);
    }
}
