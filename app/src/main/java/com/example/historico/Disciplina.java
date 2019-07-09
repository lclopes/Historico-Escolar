package com.example.historico;
import java.util.ArrayList;

public class Disciplina{
    private int id;
    private String codigo_disciplina;
    private int carga_horaria;
    private int creditos;
    private String nome;
    private char frequencia;
    private String status_historico;
    private int nota;
    private int vs;
    private int anosemestre;

    public Disciplina(int id, String codigo_disciplina, int carga_horaria, int creditos,
                      String nome, char frequencia, String status_historico, int nota, int vs, int anosemestre){
        this.id = id;
        this.codigo_disciplina = codigo_disciplina;
        this.carga_horaria = carga_horaria;
        this.creditos = creditos;
        this.nome = nome;
        this.frequencia = frequencia;
        this.status_historico = status_historico;
        this.nota = nota;
        this.vs = vs;
        this.anosemestre = anosemestre;

    }

    public String toString(){
        return "ID: " + this.getId() + "\nCodigo: " +this.getCodigo_disciplina()+ "\nCarga horária: "
                + this.getCarga_horaria() + "\nCreditos: " + this.getCreditos() + "\nNome: " + this.getNome()
                + "\nFrequencia: " + this.getFrequencia() + "\nStatus: " + this.getStatus_historico() + "\nNota: "
                + this.getNota() + "\nVS: " + this.getVs() + "\nAno/semestre: " +this.getAnosemestre();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_disciplina() {
        return codigo_disciplina;
    }

    public void setCodigo_disciplina(String codigo_disciplina) {
        this.codigo_disciplina = codigo_disciplina;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(char frequencia) {
        this.frequencia = frequencia;
    }

    public String getStatus_historico() {
        return status_historico;
    }

    public void setStatus_historico(String status_historico) {
        this.status_historico = status_historico;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getVs() {
        return vs;
    }

    public void setVs(int vs) {
        this.vs = vs;
    }

    public int getAnosemestre() {
        return anosemestre;
    }

    public void setAnosemestre(int anosemestre) {
        this.anosemestre = anosemestre;
    }
}