package com.aspar.elektronikkitabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.aspar.elektronikkitabi.databinding.ActivityDetailsBinding;
import com.aspar.elektronikkitabi.databinding.ActivityMainBinding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<ELektronik> elektronikArraylist;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        elektronikArraylist = new ArrayList<>();

        ELektronik uno = new ELektronik("Arduino Uno", "Arduino Uno Nedir? Arduino ile Neler Yapabilirim?\n" +
                "Arduino, bilgisayarınız aracılığıyla programlayarak çeşitli elektronik projeler yapabileceğiniz bir mikrokontrolcü platfomudur. Arduino ile robotik projeler, akıllı ev sistemleri, müzik aletleri gibi aklınıza gelebilecek neredeyse tüm elektronik projeleri gerçekleştirmeniz mümkündür. Arduino üzerindeki elektronik bağlantıları giriş olarak kullanarak butonlar, uzaktan kumandalar ve farklı çeşitlerde sensörler bağlayabilir; bu girişlerden elde edilen verilere göre elektronik çıkışlar elde ederek motorların, robotik mekanizmaların, rölelerin, hoparlörlerin, ışık ve göstergelerin ve hatta Ethernet veya WiFi üzerinden internetteki herhangi bir verinin elde ettiğiniz giriş değerlerine göre değişimini yazdığınız program aracılığıyla kontrol edebilirsiniz. Arduino'yu bir projede tek başına kullanabileceğiniz gibi, bilgisayarınız ile birlikte Flash, Processing, MaxMSP, C# gibi bir çok yazılım üzerinden ya da kendi yaratacağınız yazılımlarla haberleştirerek de kullanabilirsiniz. Arduino'nun yazılım geliştirme ortamı olan Arduino IDE'yi kendi internet sitesinden Windows, Mac OS X ve Linux platformları için indirebilirsiniz.", R.drawable.uno);
        ELektronik nano = new ELektronik("Arduino Nano", "Arduino Nano; Atmega328 temelli bir mikrodenetleyici kartıdır. Üzerinde 14 adet dijital giriş/çıkış pini (6 tanesi PWM çıkışı olarak kullanılabilir), 8 analog giriş, 16Mhz kristal, usb soketi, ICSP konektörü ve reset tuşu bulundurmaktadır. Kart üzerinde mikrodenetleyicinin çalışması için gerekli olan her şey bulunmaktadır. Kolayca usb kablosu üzerinden bilgisayara bağlanabilir, adaptör veya pil ile çalıştırılabilir.", R.drawable.nano);
        ELektronik leo = new ELektronik("Arduino Leonardo", "Leonardo'yu diğer bir çok Arduino modelinden ayıran en büyük özellik; Atmega32u4 üzerinde dahili USB haberleşme özelliğinin olmasıdır. Bu şekilde 16u2 gibi ikinci bir usb-seri dönüştürücü işlemcisine gerek yoktur. Bu sayede sanal COM portun (CDC) dışında Leonardo bilgisayara mouse, klavye gibi bağlanarak kullanılabilir.", R.drawable.leo);
        ELektronik mini = new ELektronik("Arduino Mini", "Arduino Pro Mini; Atmega328 temelli bir mikrodenetleyici kartıdır. Üzerinde 14 adet dijital giriş/çıkış pini (6 tanesi PWM çıkışı olarak kullanılabilir), 8 analog giriş, 8Mhz kristal ve reset tuşu bulundurmaktadır. Breadboard üzerinde kullanmak için ve boyutun önemli olduğu yerlerde kullanılmak üzere yapılmıştır. Pro Mini üzerinde usb soketi ve programlayıcı bulunmamaktadır. Kartı programlamak için USB-Serial Dönüştürücü veya başka usb-seri dönüştürücüler kullanılabilir. ", R.drawable.mini);

        elektronikArraylist.add(uno);
        elektronikArraylist.add(nano);
        elektronikArraylist.add(leo);
        elektronikArraylist.add(mini);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, elektronikArraylist.stream().map(eLektronik -> eLektronik.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("elektronik",elektronikArraylist.get(i));
                startActivity(intent);
            }
        });



    }
}