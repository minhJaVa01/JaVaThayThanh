package vn.edu.topica.girdview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import vn.edu.topica.model.HinhAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    HinhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCotrols();
        addEvents();
    }

    private void addEvents() {

        

    }

    private void addCotrols() {
        gvHinh= this.<GridView>findViewById(R.id.gvHinh);

        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.ic_launcher_background);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_background);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_foreground);
        dsHinh.add(R.drawable.ic_launcher_foreground);

        //
        adapter = new HinhAdapter(MainActivity.this,R.layout.item,dsHinh);
        //
        gvHinh.setAdapter(adapter);
    }
}
