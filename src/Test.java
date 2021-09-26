import java.io.BufferedReader;

import java.io.FileReader;
;

public class Test {

    /**
     *  O que falta fazer:
     *  Pesquisar como ordenar usando o "CompareTo" antes de adicionar os dados no Array
     *  Essa comparação poderá ser feita através dos valores da variável "dados".
     *  Depois de incluir essa comparação antes de adicionar o valor na lista, o sistema estará pronto.
     *
     *  Talvez seja necessário criar um método para contemplar esse passo acima.
     */

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("C://Users/filipe.da.silva.lima/Desktop/texto.txt");
            BufferedReader reader = new BufferedReader(fr);

            String dados = "";
            String[] lista1 = null;


            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();

            String txt = line1.toLowerCase() + " " + line2.toLowerCase() + " " + line3.toLowerCase();

            for(String x: txt.split(" ")){
                if(x.contains(",") || x.contains(".")){
                    String a = x.replaceAll("\\p{Punct}", "");
                    dados += " " + a;
                } else {
                    dados += " " + x;
                }
            }

            String teste = "";
            String teste2[] = dados.split(" ");

            // t
            String teste3 = "";

            for (String x : teste2){
                int contador = 208;
                System.out.println("contador: " + contador);
                if(x.compareTo(teste2[contador].toString()) < 0);{

                    teste3 += " " + x;
                    contador =- 1;
                    System.out.println("Comparação " + x + "<>" + teste2[contador].toString())  ;
                } if (x.compareTo(teste2[contador].toString()) > 0){

                    String a = x;
                    String b = a + " " + teste3;
                    teste3 = b;
                    contador =- 1;

                } else if (x.compareTo(teste2[contador].toString()) == 0){

                } else {
                    int j = 1;
                    System.out.println("Não entrou em nenhuma condição" + j + 1);
                }
            }

            System.out.println("Quantidade do teste3: " + teste3.length());

            System.out.println("Como ficou o teste: " + teste3);




            // Tudo foi unificado nessa variável dados
            System.out.println("Como ficou o texto tratado : " + dados);



            // Adicionando na Lista tudo separado por espaço
            // antes de fazer isso, vai precisar ordenar usando o compareTo
            lista1 = dados.split(" ");
            System.out.println("Quantidade de palavras: " + lista1.length);
            System.out.println("Primeira palavra: " + lista1[1]);
            System.out.println("Última palavra: " + lista1[lista1.length -1]);



        } catch (Exception e){
            e.printStackTrace();

        }


    }

}
