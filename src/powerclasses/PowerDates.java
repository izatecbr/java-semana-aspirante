package powerclasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PowerDates {
    public static void main(String[] args) {
        //classe que possui o papel de formatar um instante, data e hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //classe que representa somente uma data
        LocalDate agora = LocalDate.now();
        LocalDate vencimento = LocalDate.of(2025,7,2);
        String vencimentoBr = formatter.format(vencimento);
        //metodo que verifica se uma data é posterior a outra
        if(agora.isAfter(vencimento)){
            System.out.println("Parcela vencida na data " + vencimentoBr);
        }
    }
}
