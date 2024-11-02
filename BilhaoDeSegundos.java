import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class BilhaoDeSegundos 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (formato: AAAA-MM-DD):");
        String dataNascimentoStr = scanner.nextLine();

        System.out.println("Digite a hora de nascimento (formato: HH:MM:SS):");
        String horaNascimentoStr = scanner.nextLine();

        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        LocalTime horaNascimento = LocalTime.parse(horaNascimentoStr);

        LocalDateTime dataHoraNascimento = LocalDateTime.of(dataNascimento, horaNascimento);

        // Calcula a data e hora exata de 1 bilhão de segundos após o nascimento
        LocalDateTime bilhaoSegundosDepois = dataHoraNascimento.plusSeconds(1_000_000_000);

        System.out.println("Você fará 1 bilhão de segundos exatamente em:");
        System.out.println(bilhaoSegundosDepois);

        scanner.close();
        //teste
    }
}
