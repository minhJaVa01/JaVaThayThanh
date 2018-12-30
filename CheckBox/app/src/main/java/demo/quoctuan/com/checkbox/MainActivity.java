package demo.quoctuan.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAndroid,chkWindown,chkIOS;
    Button btnChon;
    TextView txtMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChonMonHoc();
            }
        });

    }

    private void xuLyChonMonHoc() {
        String s="";
        if(chkAndroid.isChecked()){
            s+=chkAndroid.getText().toString()+"\n";
        }if (chkWindown.isChecked()){
            s+=chkWindown.getText().toString()+"\n";
        }if(chkIOS.isChecked()){
            s+=chkIOS.getText().toString()+"\n";
        }
        txtMonHoc.setText(s);
    }

    private void addControls() {
        chkAndroid = this.<CheckBox>findViewById(R.id.chkAndroid);
        chkWindown = this.<CheckBox>findViewById(R.id.chkWindown);
        chkIOS = this.<CheckBox>findViewById(R.id.chkIOS);
        btnChon= this.<Button>findViewById(R.id.btnChon);
        txtMonHoc = this.<TextView>findViewById(R.id.txtMonHoc);
        
    }
}
