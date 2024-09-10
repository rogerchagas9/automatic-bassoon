import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        //System.out.println("Digite o serviço a ser verificado:");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        //System.out.println("Digite o nome do cliente e os serviços contratados separados por vírgula:");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        
        scanner.close();

        // Chama o método de validação do serviço e armazena o resultado
        boolean contratado = validarServico(servico, partes);

        System.out.println((contratado ? "Sim" : "Nao"));
    }

    // Método para validar se o serviço está na lista de serviços contratados
    public static boolean validarServico(String servico, String[] partes) {
        for (int i = 1; i < partes.length; i++) { // Inicia em 1 para ignorar o nome do cliente
            if (servico.equals(partes[i].trim())) { // Compara ignorando espaços em branco
                return true; // Retorna true se o serviço for encontrado
            }
        }
        return false; // Retorna false se o serviço não for encontrado
    }
}
