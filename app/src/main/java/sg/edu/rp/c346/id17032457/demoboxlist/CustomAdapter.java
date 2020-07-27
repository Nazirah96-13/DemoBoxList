package sg.edu.rp.c346.id17032457.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> BoxList;

    //Exercise C
    public CustomAdapter(Context context, int resource, ArrayList<Box>objects){

//super - calling the parent
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        BoxList = objects;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding

        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);

        // Obtain the Android Version information based on the position
        Box currentItem = BoxList.get(position);

        // Set values to the TextView to display the corresponding information
        if(currentItem.getColor().equals("blue")){
            ivBox.setImageResource(R.drawable.blue_box);
        }else if (currentItem.getColor().equals("orange")){
            ivBox.setImageResource(R.drawable.orange_box);
        }else{
            ivBox.setImageResource(R.drawable.brown_box);
        }

        return rowView;



     }


}
