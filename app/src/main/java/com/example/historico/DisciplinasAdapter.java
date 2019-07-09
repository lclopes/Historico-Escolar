package com.example.historico;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class DisciplinasAdapter extends RecyclerView.Adapter<DisciplinasAdapter.MyViewHolder> {
    ArrayList<Disciplina> disciplinas;

    public DisciplinasAdapter(ArrayList<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_card_view, viewGroup, false);

        return new MyViewHolder(itemView);

    }

    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Disciplina d = disciplinas.get(i);

        viewHolder.id.setText(d.getId());
        viewHolder.codigo.setText(String.valueOf(d.getCodigo_disciplina()));

    }

    public int getItemCount() {
        return disciplinas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id,codigo;
        public MyViewHolder(View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            codigo=itemView.findViewById(R.id.codigo);
        }
    }

}
