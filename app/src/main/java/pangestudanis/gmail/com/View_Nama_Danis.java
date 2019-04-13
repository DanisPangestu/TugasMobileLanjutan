package pangestudanis.gmail.com; //nama package saya
//import yang dibutuhkan di java ini
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
//script menjelaskan tentang class yang bernama View_nama_dani, serta mengimport fungsi listview 
public class View_Nama_Danis extends AppCompatActivity {
    ListView list;
    //script dibawah ini merupakan isi dari list view,maintitle,subtitle,serta gambar dengan tipe data string dan integer
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
    //script dibawah ini melakukan perintah untuk memperlihatkan bagian atas di layar aplikasi kita.serta melakukan toast jika bagian text/gambar disentuh
    //serta menghubungkan java ini ke adapter_danis
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
//script untuk melakukan toast dan memberi kalimat ke si pengguna jika ia menekan nya
                    Toast.makeText(getApplicationContext(), "terima kasih telah memilih saya", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
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
