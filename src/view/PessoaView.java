package view;


import controller.PessoaController; // package controller, class PessoaController
import model.Pessoa; // Package model, class Pessoa


public class PessoaView {
    public static void main (String args []) {
        try 
        { //oq é try??
            PessoaController imp = new PessoaController();
            Pessoa [] pessoas = imp.ordena_nome(); // declaração de contrutor com referencia "pessoas"
            
            for (int i = 0 ; i < pessoas.length ; i ++) {
                System.out.println( pessoas[i].toString()); //oqq é toString (é o que compila os resultados em Nome TAB Idade, mas qual o ponto? é uma função? (é
            }
    }
        catch(Exception e)  {
            e.printStackTrace();
        }
}
}