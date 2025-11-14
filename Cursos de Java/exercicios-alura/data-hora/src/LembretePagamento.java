import utilitarias.FormatadorDeData;

import java.time.LocalDate;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 3 , 30);
        int diasLembrete = 5;

        LocalDate dataLembrete = dataVencimento.minusDays(diasLembrete);

        String data = FormatadorDeData.formataDataBR(dataLembrete);
        System.out.println("Data do lembrete: " + data);
    }
}
