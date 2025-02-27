package model;

import java.io.*;

public class Arquivo {
    private String path;
    
    public Arquivo(String path){
        this.path = path; //pra q serve essa bosta se não existe variável path? é pra ler os dados?
    }
    
    public String [] linhas() throws IOException {
        BufferedReader ler = new BufferedReader (new FileReader(this.path));
        
        String[] linhas = new String[totalLinhas()]; //aqui o vetor linhas puxa uma função pra determinar seu tamanho.
        for(int i = 0 ; i < linhas.length ; i ++) {
            linhas[i] = ler.readLine();
        }
        return linhas;
        }
    
    public int totalLinhas() throws IOException {
        BufferedReader ler = new BufferedReader(new FileReader(this.path));
        
        int linhas = 0;
        while(ler.readLine() != null) linhas ++;
        return linhas;
        
    }
    }



