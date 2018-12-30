package demo.quoctuan.com.litsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    String []arrThu;
    ArrayAdapter<String>adapterThu;
    ListView lvThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        lvThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"ban chon ["+arrThu[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        arrThu= getResources().getStringArray(R.array.arrayThu);
        lvThu = findViewById(R.id.lvThu);
    }
}
