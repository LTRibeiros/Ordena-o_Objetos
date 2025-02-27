package model;

import java.io.*;
import model.Arquivo;

public class Pessoa {
    private String nome;
    private int idade; //private?? faz parte de encapsulamento, mas sei lá?
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    //até aqui ok? é encapsulamento, esse toString junta isso e devolve.
    
    public String toString() {
        return this.nome + "\t" + this.idade;
    }
    
    public static Pessoa[] carregar() throws IOException {
        Arquivo FileName = new Arquivo("data\\pessoa.csv");
        String [] valores;
        String [] linhas = FileName.linhas();
        Pessoa[] pessoas = new Pessoa[ linhas.length ]; //seta o tamanho de Pessoa[] pro tamanho de linhas do documento, legal legal
    
        for(int i = 0; i < linhas.length ; i ++) {
            valores = linhas[i].split(";");
            pessoas[i] = new Pessoa();
            pessoas[i].setNome(valores[0]);
            pessoas[i].setIdade (Integer.parseInt(valores[1]));
        }
        return pessoas;
    }
}