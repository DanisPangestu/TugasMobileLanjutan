package pangestudanis.gmail.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class View_Nama_Danis extends AppCompatActivity {
    ListView list;
    String[] maintitle = {
            "Danis Pangestu // 165410156", "Bisri Hanafi ",
            "Mikael Dionito Harbigantara", "Rahmat Mustaqim",
            "Danang Triyatno","Sinar Vino",
            "Dede Aryandani","Ganesa Bintang",
    };
    String[] subtitle = {
            "pangestudanis@gmail.com", "bisri@gmail.com",
            "mikael@gmail.com", "rahmat@gmail.com",
            "danang@gmail.com","vino@gmail.com",
            "dede@gmail.com","ganesa@gmail.com",
    };
    Integer[] imgid = {
            R.drawable.coba1, R.drawable.coba2,
            R.drawable.coba3, R.drawable.coba4,
            R.drawable.coba1,R.drawable.coba2,
            R.drawable.coba4, R.drawable.coba3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__nama__danis);
        Adapter_Danis adapter = new Adapter_Danis(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
// TODO Auto-generated method stub
                if (position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 5) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 7) {
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}