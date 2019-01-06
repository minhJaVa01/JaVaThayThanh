package vn.edu.topica.hoctaphost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtA,txtB;
    Button btnCong;

    /**
     * Bộ 3 nguy hiểm
     * nguồn ArrayList<String>dsCong;
     * adapter ArrayAdapter<String>adapterCong;
     * hiển thị  ListView lvHistory;
     */
    ListView lvHistory;
    ArrayList<String>dsCong;
    ArrayAdapter<String>adapterCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        txtA = this.<EditText>findViewById(R.id.txtA);
        txtB = this.<EditText>findViewById(R.id.txtB);
        btnCong = this.<Button>findViewById(R.id.btnCong);
        lvHistory = this.<ListView>findViewById(R.id.lvHistory);
        dsCong = new ArrayList<>();
        adapterCong = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,dsCong);
        lvHistory.setAdapter(adapterCong);
        //
        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        //tab1
       TabHost.TabSpec tab1 =tabHost.newTabSpec("t1");
       tab1.setContent(R.id.tab1);
//       tab1.setIndicator("1.Phép CỘNG");
        tab1.setIndicator("",getResources().getDrawable(R.drawable.hinh1));
       tabHost.addTab(tab1);

        //tab2
       TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
       tab2.setContent(R.id.tab2);
//       tab2.setIndicator("2.Lịch sử");
        tab2.setIndicator("",getResources().getDrawable(R.drawable.hinh2));
       tabHost.addTab(tab2 );
    }

    private void addEvents() {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyCong();
            }
        });
    }

    private void xuLyCong() {
        int a= Integer.parseInt(txtA.getText().toString());
        int b =Integer.parseInt(txtB.getText().toString());
        String s = a +" + "+ b + " = " +(a+b);
        dsCong.add(s);
        adapterCong.notifyDataSetChanged();
        txtA.setText("");
        txtB.setText("");
        Toast.makeText(MainActivity.this,"Kết quả là"+s,Toast.LENGTH_SHORT).show();
    }
}
