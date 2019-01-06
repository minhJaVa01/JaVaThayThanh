package vn.edu.topica.taphost2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

import static vn.edu.topica.taphost2.R.id.btnCong;

public class MainActivity extends AppCompatActivity {
    EditText txtA,txtB;
    Button btnCOng;

    /**
     *  Bo 3 hien thi
     */
    ArrayList<String> dsCOng;
    ArrayAdapter<String>adapter;
    ListView lvHistory;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        txtA = this.<EditText>findViewById(R.id.txtA);
        txtB = this.<EditText>findViewById(R.id.txtB);
        btnCOng = this.<Button>findViewById(R.id.btnCong);
        lvHistory = findViewById(R.id.lvHistory);
        //buoc 1
        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();
        //buoc 2
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Tab1");
        tabSpec1.setContent(R.id.tab1);
        tabSpec1.setIndicator("Php Cong");
        tabHost.addTab(tabSpec1);
        //tab2
        //buoc1
        TabHost.TabSpec tabSpec2 =tabHost.newTabSpec("tb2");
        tabSpec2.setContent(R.id.tab2);
        tabSpec2.setIndicator("LỊCH SỬ");
        tabHost.addTab(tabSpec2);
        //
        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tb3");
        tabSpec3.setContent(R.id.tab3);
        tabSpec3.setIndicator("KẾT QUẢ ĐÃ TÍNH");
        tabHost.addTab(tabSpec3);




    }
}
