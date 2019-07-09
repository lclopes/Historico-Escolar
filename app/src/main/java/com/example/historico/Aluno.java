package com.example.historico;

import java.util.ArrayList;

public class Aluno{

    private double cr;
    private int ch_cursada;
    private int ch_total;
    private String situacao_aluno;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(int cr, int ch_cursada, int ch_total, String situacao_aluno, ArrayList<Disciplina> disciplinas){
        this.cr = cr;
        this.ch_cursada = ch_cursada;
        this.ch_total = ch_total;
        this.situacao_aluno = situacao_aluno;
        this.disciplinas = disciplinas;
    }

    public Aluno(){

    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public int getCh_cursada() {
        return ch_cursada;
    }

    public void setCh_cursada(int ch_cursada) {
        this.ch_cursada = ch_cursada;
    }

    public int getCh_total() {
        return ch_total;
    }

    public void setCh_total(int ch_total) {
        this.ch_total = ch_total;
    }

    public String getSituacao_aluno() {
        return situacao_aluno;
    }

    public void setSituacao_aluno(String situacao_aluno) {
        this.situacao_aluno = situacao_aluno;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}