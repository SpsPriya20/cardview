package com.priya.cardview1.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.priya.cardview1.R;
import com.priya.cardview1.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.Studentholder>{
    private ArrayList<Student>studentlist;
    private Activity activity;

    public StudentAdapter(ArrayList<Student>studentlist,Activity activity){
        this.activity=activity;
        this.studentlist=studentlist;

    }

    @NonNull
    @Override
    public Studentholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.student_adapter,parent,false);
        Studentholder studentholder=new Studentholder(view);
        return studentholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Studentholder holder, int position) {
    holder.Name.setText(studentlist.get(position).getName());
    holder.Class.setText(studentlist.get(position).getClass1());
    holder.Age.setText(studentlist.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }

    class Studentholder extends RecyclerView.ViewHolder{
        TextView Name;
        TextView Class;
        TextView Age;

        public Studentholder(View itemView) {
            super(itemView);

            Name=itemView.findViewById(R.id.NameTv);
            Class=itemView.findViewById(R.id.ClassTv);
            Age=itemView.findViewById(R.id.AgeTv);
        }
    }

}
