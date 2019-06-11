package model;

public class NumeroDescrescente {

    public void decrescer(int numero){

        for(int i = numero; i >= 0; i-- ){
            numero = i;
            System.out.println("numero é: "+ numero);
        }
        }
    }


