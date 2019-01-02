package vn.edu.topica.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

import vn.edu.topica.model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    //Đối sô 1:màn hình sủ dụng layout này(giao dien nay)
    Activity context;
    //layout cho từng dòng muốn hiển thị(làm theo khách hàng)
    int resource;
    //danh sahch nguon dũ liệu muốn hiển thị lên giao diện
    List<DanhBa> objects;
    public DanhBaAdapter( Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context= context;
        this.resource =resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater Inflater this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        return row;
    }
}
