import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.miltiplicaMetade(5);
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de entrada");
        int i = scanner.nextInt();
        metodos.verificaParImpar(i);
        System.out.println("_________________________");


        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("luan");
        pessoa.setIdade(17);
        pessoas.add(pessoa);

        pessoa = new Pessoa();
        pessoa.setNome("gustavo");
        pessoa.setIdade(34);
        pessoas.add(pessoa);

        metodos.verificaIdade(pessoas);
        System.out.println("__________________________");

        List<Pais> paises = new ArrayList<>();
        Pais pais = new Pais();
        pais.setNomePais("Brasil");
        pais.setContinente("America do Sul");
        paises.add(pais);

        pais = new Pais();
        pais.setNomePais("Canada");
        pais.setContinente("America do Norte");
        paises.add(pais);

        pais = new Pais();
        pais.setNomePais("EUA");
        pais.setContinente("America do Norte");
        paises.add(pais);
    }


}





