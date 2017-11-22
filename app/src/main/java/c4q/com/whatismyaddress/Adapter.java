package c4q.com.whatismyaddress;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by D on 11/21/17.
 */

public class Adapter extends RecyclerView.Adapter<Holder>  {

 List<Holder> list;

 public Adapter(){
     this.list = list;
 }

 @Override
    public Holder onCreateHolder(ViewGroup parent, int viewType){
     Viewchild = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler,parent,false);
 }

}
