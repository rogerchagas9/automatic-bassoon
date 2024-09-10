import java.util.Scanner;

public class DesafioJava {

public static void main(String[] args) {
    //Lê os valores de entrada
    Scanner leitorEntrada = new Scanner(System.in);
    float valorSalario = leitorEntrada.nextFloat();
    float valorBeneficio = leitorEntrada.nextFloat();
    float valorImposto = 0;

    if (valorSalario >= 0 && valorSalario <= 1100) {
        //Atribui a alíquota de 5% mediante o salario:
        valorImposto = 0.05F * valorSalario;
    }else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
        valorImposto = 0.10F * valorSalario;
    }else{
        valorImposto = 0.15F * valorSalario;
    }

    //Calcula e imprime a saída (com 2 casas decimais):
    float saida = valorSalario - valorImposto + valorBeneficio;
    System.out.println(String.format("%.2f", saida));

    leitorEntrada.close();
}

}
