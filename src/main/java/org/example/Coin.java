package org.example;
import java.util.List;

public record Coin(String conversion_result, String target_code, String base_code) {

    public String retorno() {
        return  "Moeda Base para a conversão: ["+ base_code +"] Moeda a ser convertida:" +
                " ["+ target_code+"] Resultado da conversão: " + semDecimal();
    }
    public List addList() {
        List<String> newList = List.of(semDecimal());
        return newList;
    }
    public String semDecimal() {
        double valorDouble = Double.parseDouble(this.conversion_result);
        double valorArredondado = Math.round(valorDouble * 100) / 100.0;
        return String.valueOf(valorArredondado);
    }




}
