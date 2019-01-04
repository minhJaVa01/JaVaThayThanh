package vn.edu.topica.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

import vn.edu.topica.girdview.R;

public class HinhAdapter extends ArrayAdapter<Integer> {

    Activity context;
    int resource;
    List<Integer> objects;
    public HinhAdapter(Activity context, int resource, List<Integer> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource =resource;
        this.objects = objects;
    }


    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row  = layoutInflater.inflate(this.resource,null);
        ImageView img = (ImageView)row.findViewById(R.id.imgHinh);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
