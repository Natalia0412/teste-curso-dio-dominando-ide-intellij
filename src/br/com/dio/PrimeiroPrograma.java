package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;


public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a=5;
        int b=3;
        System.out.println("Hello word!"+(a+b));*/

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1=new Livro("A culpa é das estrelas",250);
        System.out.println(livro1);
    }
}
