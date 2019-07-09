package com.example.historico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;

import com.example.historico.Aluno;
import com.example.historico.Disciplina;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;


public class HistoricoActivity extends AppCompatActivity {
    Aluno a = new Aluno();

    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        Gson gson = new Gson();

        a = gson.fromJson(JSONtoString("https://api.myjson.com/bins/gwfvj"), Aluno.class);

        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        for(Disciplina d : a.getDisciplinas()){
            disciplinas.add(d);
        }

        rv = (RecyclerView)findViewById(R.id.recycler_view);
        DisciplinasAdapter adapter = new DisciplinasAdapter(disciplinas);

        RecyclerView.LayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);

    }

    public static String JSONtoString(String url){
        HttpsURLConnection c = null;
        try{
            URL u = new URL(url);
            c = (HttpsURLConnection) u.openConnection();

            c.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            return sb.toString();

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (c != null) {
                try {
                    c.disconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }


    public Aluno inicializar(Aluno a){

        Gson gson = new Gson();

        return gson.fromJson("aluno.json", Aluno.class);
    }
}
