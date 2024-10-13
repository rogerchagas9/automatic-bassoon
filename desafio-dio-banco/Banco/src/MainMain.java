import java.util.Scanner;

public class MainMain {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int count = velocidades.length;

        // TODO: Some todas as velocidades registradas e calcule a média

        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade);
        }

        // Print the sum
        //System.out.println("Total sum: " + total);

        return total/count;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        //System.out.println(velocidades);;

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}