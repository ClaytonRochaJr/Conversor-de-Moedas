package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fileWriter = new FileWriter("Registro-Conversoes.txt");

        Scanner scanner = new Scanner(System.in);
        String userEscolha = "";
        String moedaBase = "";
        String moedaAlvo = "";
        String valorConversao = "";
        ArrayList<String> registroDeConversao = new ArrayList<>();
        System.out.println("Seja bem vindo ao conversor de modedas!");
        System.out.println("Digite o nome da moeda exemplos de moedas: ");
        System.out.println("""
                AUD:Dólar Australiano
                BRL:Real Brasileiro
                CAD:Dólar Canadense
                CHF:Franco Suíço
                CNY:Yuan Chinês
                EUR:Euro
                GBP:Libra Esterlina
                HKD:Dólar de Hong Kong
                INR:Rúpia Indiana
                JPY:Iene Japonês""");
        while (!userEscolha.equalsIgnoreCase("sair")) {

            System.out.println("Insira o nome da moeda base (exepmlo: USD ou BRL)");
            moedaBase = scanner.nextLine();
            System.out.println("Insira o nome da moeda Alvo");
            moedaAlvo = scanner.nextLine();
            System.out.println("Insira o valor a ser convertido");
            valorConversao = scanner.nextLine();
            try {
                RequestCoin requestCoin = new RequestCoin();
                Coin coin = requestCoin.coinRequest(moedaBase, moedaAlvo, valorConversao);
                coin.addList();
                System.out.println("Valor convertido: "+coin.semDecimal());
                 registroDeConversao.add(coin.retorno());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Não foi possivel buscar por esta moeda.");
                e.printStackTrace();
            }
            System.out.println("Digite continuar para continuar ou sair para sair ou 1 para ver mais moedas");
            userEscolha = scanner.nextLine();
            if (Objects.equals(userEscolha, "1")){
                System.out.println(
                        """
                                AUD:Dólar Australiano
                                BRL:Real Brasileiro
                                CAD:Dólar Canadense
                                CHF:Franco Suíço
                                CNY:Yuan Chinês
                                EUR:Euro
                                GBP:Libra Esterlina
                                HKD:Dólar de Hong Kong
                                INR:Rúpia Indiana
                                JPY:Iene Japonês""");
            }
        }

        System.out.println("Os registros das conversões:");
        int i =0;
        for (String registro : registroDeConversao){
            i++;
            System.out.println("Registro número "+i+": "+registro);
            fileWriter.write("""
     
     
     
        """+registro);
        }
        MostraHora mostraHora = new MostraHora();
        fileWriter.write("""
                
                
                """+mostraHora.mostrahora());

        fileWriter.close();

        System.out.println("Programa finalizado!");
    }
}
