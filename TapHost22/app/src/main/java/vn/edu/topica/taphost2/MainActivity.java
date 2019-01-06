package vn.edu.topica.taphost2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    //Bô 3 Nguyên Tử
    // nguon du lieu
    ArrayList<String>dsCong;
    //adapter
    ArrayAdapter<String>adapter;
    //Hiển thị lítview
    ListView lvHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
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
        int a =Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        String s = "Kết quả = +"+a +" + "+b +"=" + (a+b);
        dsCong.add(s);
        adapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this,"Kết quả phép cộng trên là +" +s ,Toast.LENGTH_SHORT).show();
        //xoa du lieu cũ
        txtA.setText("");
        txtB.setText("");

    }

    private void addControls() {
        // khởi tạo tabhost
        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();
        //create tabSpec1
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tb1");
        tabSpec1.setContent(R.id.tab1);
        tabSpec1.setIndicator("",getResources().getDrawable(R.drawable.hinh1));
        tabHost.addTab(tabSpec1);
        //create tabSpec2
        TabHost.TabSpec tabSpec2 =tabHost.newTabSpec("tb2");
        tabSpec2.setContent(R.id.tab2);
        tabSpec2.setIndicator("",getResources().getDrawable(R.drawable.hinh2));
        tabHost.addTab(tabSpec2);


        txtA = this.<EditText>findViewById(R.id.txtA);
        txtB = this.<EditText>findViewById(R.id.txtB);
        btnCong = this.<Button>findViewById(R.id.btnCong);

        lvHistory = this.<ListView>findViewById(R.id.lvHistory);
        dsCong = new ArrayList<>();
        adapter=new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                dsCong);
        lvHistory.setAdapter(adapter);
    }
}
