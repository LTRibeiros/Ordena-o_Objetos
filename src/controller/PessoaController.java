package controller;


import java.io.*;
import model.Pessoa;

public class PessoaController {
    //teoricamente teria que ter um super() aqui, mas eu n sei pra q serve e tenho raiva de quem sabe
    
    public Pessoa[] ordena_nome() throws IOException {
        Pessoa[] pessoas = Pessoa.carregar (); //olha isso o código n N PARA QUIETO JÁ FOI PRA OUTRA FUNÇÃO EM OUTRO PACKAGE OH DEUS
    
        for (int i = 0 ; i < pessoas.length ; i++) {
            for(int j = 0 ; j < pessoas.length - 1 ; j++) {
                if (pessoas[j].getNome().compareTo(pessoas[j + 1].getNome()) > 0 ) { //essa condição e esse CompareTo??
                    Pessoa aux = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = aux;
                }
                
            }
        }
        return pessoas;
    }
}



