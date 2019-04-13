package pangestudanis.gmail.com;// package dengan nama email saya
//import yang diperlukan untuk java ini
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
//menjelaskan tentan public clas yang bernama Adapter_danis
public class Adapter_Danis extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
//script ini digunakan untuk mengatur posisi text serta gambar yang ada di login
    public Adapter_Danis(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid)
    {
        super(context, R.layout.mylist_danis, maintitle);
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist_danis, null,true);
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    };
}

