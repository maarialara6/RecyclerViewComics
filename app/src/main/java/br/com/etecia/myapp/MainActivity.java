package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Comics> lstcomic;
    RecyclerView idRecDc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idRecDc = findViewById(R.id.idRecDc);

        lstcomic = new ArrayList<>();
        lstcomic.add(new Comics("Lantern Corps", "DC", R.drawable.lanternas));
        lstcomic.add(new Comics("X-Man", "Marvel", R.drawable.xman));
        lstcomic.add(new Comics("As Amazonas de Themyscira", "DC", R.drawable.amazonas));
        lstcomic.add(new Comics("Illuminati", "Marvel", R.drawable.illuminati));
        lstcomic.add(new Comics("Família Superman", "DC", R.drawable.superfamily));
        lstcomic.add(new Comics("Thunderbolts*", "Marvel", R.drawable.thunderbolts));
        lstcomic.add(new Comics("Liga da Justiça Sombria", "DC", R.drawable.justice));
        lstcomic.add(new Comics("Força-Tarefa", "Marvel", R.drawable.starforce));


        Adaptador adaptador = new Adaptador(getApplicationContext(), lstcomic);

        idRecDc.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecDc.setAdapter(adaptador);
    }
}