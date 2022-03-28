

import java.util.*;

public class MetodoSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e  adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
        System.out.println(notas);

        System.out.println("Mostre a posição da nota 5.0");
        System.out.println("**Não é possivel fazer busca de posição no metodo Set ou HashSet**");
        System.out.println("confira se a Nota 5.0 esta no conjunto: " + notas.contains(5.0));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Soma  dos Valores: "  );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){

            Double next = iterator.next();
            soma +=next;
            System.out.println( "R:" + soma);


        }
        System.out.println("Resultado final da soma " + soma);
        System.out.println("media:" + soma/notas.size());//size para saber a quantidade
        System.out.println("Remover a nota 0.0" + notas.remove(0d)+ "  //" + notas);
        System.out.println("Adicionar um nota 10: "+ notas.add(10d)+ "// " + notas);
        System.out.println( );

        System.out.println("Remova notas menores que 7 e Exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na Ordem em que foram inforamdas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba toda na Orde mcrecente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("Apagar o conjuto");
        notas.clear();
        notas2.clear();

        System.out.println("Confira se o conjunto esta vazio:"
                + "1:" + notas.isEmpty()
                +" 2: " + notas2.isEmpty()
                +" 3:" + notas3.isEmpty() );


    }
}
