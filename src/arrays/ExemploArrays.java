package arrays;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrays {
    public static void main(String[] args) {
        //limitações de um array
        //hierarquia java collections
        List <String> filmes = new ArrayList();//capacidade da lista

        filmes.add("Matrix");
        filmes.add("Terminator");
        filmes.add("Connan");
        filmes.add("Transformers");
        filmes.add(3,"Bela e Fera");

        for(String filme: filmes){
            System.out.println(filme);
        }

        System.out.println(filmes.size());
        filmes.add(3,"Bela e Fera");
        System.out.println(filmes.size());
    }
}
