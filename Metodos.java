import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Metodos {
    //Crie um método que receba um número e mutiplique o valor pela metade dele. Exemplo: Recebeu 10, mutiplocou por 5.
    public void miltiplicaMetade(double numero) {
        System.out.println("o numero " + numero + " vezes a metade dele " + (numero / 2) + " tem o resultado " + numero * (numero / 2));
    }

    //Crie um método que receba um número e separe os impares e pares em listas distintas, por final,
// compare os tamanhos da lista e informe qual a maior, se é a de pares ou ímpares,
// ou se são iguais. Exemplo: Recebeu 5, terá a lista de par com 2 e 4 e a lista de impares com 1, 3 e 5.
// Ao comparar o size de impar retorná 3, então essa é a maior das listas informadas.
    public void verificaParImpar(int numero) {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares.add(i);
                System.out.println(i + " e par");
            } else {
                impares.add(i);
                System.out.println(i + " e impar");
            }
        }
        System.out.println("_________________________________");
        System.out.println("o tamanho da lista de pares e: " + pares.size());
        System.out.println("o tamanho da lista de impares e: " + impares.size());
        System.out.println("_________________________________");
        if (impares.size() > pares.size()) {
            System.out.println("a lista de impares e a maior");
        } else {
            System.out.println("a lista de pares e a maior");
        }
    }
    //Crie um método que receba uma lista de Pessoa e verifique quais são maior e menor idade e
    // exiba uma mensagem personalizada para cada caso. Exemplo: Para maiores de idade, exiba a mensagem:
    // Essa pessoa é maior de idade, para menores de idade, exiba: Essa pessoa é menor de idade

    public void verificaIdade(List<Pessoa> pessoas) {
        Pessoa pessoa = new Pessoa();

        for (Pessoa pessoa1 : pessoas) {
            if (pessoa1.getIdade() < 18) {
                System.out.println("o " + pessoa1.getNome() + " e menor de idade com " + pessoa1.getIdade() + " anos");
            } else {
                System.out.println("o " + pessoa1.getNome() + " e maior de idade com " + pessoa1.getIdade() + " anos");
            }
        }
    }

    //Crie um método que receba uma lista de País e conte quantos países recebeu de cada continente.
    //Dicas: 1- A classe País precisa de um atributo continente
    // 2- Será necessário iniciar uma varíavel inteira pra contar as entradas de cada um dos continentes
    public void contaPais(List<Pais> paises) {
        Pais pais = new Pais();
       // for (int i = 1; i < pais.getContinente(); i++) {
        Map<String, Integer> cont = new TreeMap<String, Integer>();
        for (String nome : lista) {
            if (!cont.containsKey(nome))
                cont.put(nome, 0);
            cont.put(nome, cont.get(nome) + 1);
        }

        for (Map.Entry<String, Integer> entry : cont.entrySet()) {
            System.out.prinlnt("%s => %d%n", entry.getKey(), entry.getValue());
        }

        }
    }


}







