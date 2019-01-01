package demo.quoctuan.com.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import demo.quoctuan.com.model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {

    //doi so 1 su dung man hinh nay
    Activity context;
    //layout cho tung dong muon hien thi
    int resource;
    //danh sach nguon du lieu muon hien thi
    List<DanhBa> objects;
    public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource =resource;
        this.objects= objects;


    }


    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater intInflater =this.context.getLayoutInflater();
        View row = intInflater.inflate(this.resource,null);
        return super.getView(position, convertView, parent);
    }
}
