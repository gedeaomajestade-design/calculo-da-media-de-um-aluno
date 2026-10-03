import java.util.Scanner;
public class Main{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1= sc.nextDouble();
        System.out.println("Digite a segiunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a Quarta nota: ");
        double nota4 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado;

        if (media >=6.50){
            resultado = "Aprovado";
        }else{
            resultado = "Reprovado";
        }

        System.out.println("===== RESULTADO DO ALUNO ======= ");
        System.out.println("Aluno " + nome);
        System.out.println("Media  " + media);
        System.out.printf("Resultado: " + resultado);
    }
}