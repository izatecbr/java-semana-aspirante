package powerclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class PowerDates {
    public static void main(String[] args) {
       LocalDate hoje = LocalDate.now();
       LocalDate primeiroVencimento=hoje.plusMonths(1);

       int mesPrimeiroVencimento = primeiroVencimento.getMonthValue();
        System.out.println(mesPrimeiroVencimento);
    }
}
