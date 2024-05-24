package org.example;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MostraHora {

    public String mostrahora(){
        ZonedDateTime test2= ZonedDateTime.now();
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String dataFormatada = dataFormatter.format(test2);
        String horaFormatada = horaFormatter.format(test2);
        String saida = "Data: " + dataFormatada + " Hora: " + horaFormatada + " (" + test2.getZone().getId() + ")";
        return saida;
    }
}
