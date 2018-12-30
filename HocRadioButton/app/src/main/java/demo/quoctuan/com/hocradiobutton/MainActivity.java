package demo.quoctuan.com.hocradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDanhGia;
    RadioButton radVeryGood,radGood,radBad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnDanhGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyDanhGia();
            }
        });

    }
    private void xuLyDanhGia() {
        String s="";
        if (radVeryGood.isChecked()){
            s=radVeryGood.getText().toString();
        }
        else if (radGood.isChecked()){
            s=radGood.getText().toString();
        }
        else if(radBad.isChecked()){
            s=radBad.getText().toString();
        }
        Toast.makeText(MainActivity.this,"Ban Chon :" +s,Toast.LENGTH_SHORT).show();
    }

    private void addControls() {
        btnDanhGia = this.<Button>findViewById(R.id.btnDanhGia);
        radVeryGood = this.<RadioButton>findViewById(R.id.radVeryGood);
        radGood = this.<RadioButton>findViewById(R.id.radGood);
        radBad = this.<RadioButton>findViewById(R.id.radBad);

    }


}
