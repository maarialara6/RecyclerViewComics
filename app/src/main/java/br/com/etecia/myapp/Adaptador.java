package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context context;
    private List<Comics> lstcomic;

    public Adaptador(Context context, List<Comics> lstcomic) {
        this.context = context;
        this.lstcomic = lstcomic;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.modelo,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modTitulo.setText(lstcomic.get(position).getTitulo());
        holder.modImagem.setImageResource(lstcomic.get(position).getImgComic());

    }

    @Override
    public int getItemCount() {
        return lstcomic.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView modCardDc;
        ImageView modImagem;
        TextView modTitulo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            modTitulo = itemView.findViewById(R.id.modTitulo);
            modImagem = itemView.findViewById(R.id.modImagem);

        }
    }
}
