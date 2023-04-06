import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double hora,mes,salario,IR,INSS,Sindicato,liquido;
        
        

        Scanner teclado = new Scanner(System.in);

         System.out.print("Quanto voce ganha por hora?:");
          hora = teclado.nextDouble();
         System.out.print("Quantas horas voce trabalha por mes?:");
          mes = teclado.nextDouble();
          teclado.close();

          salario = hora * mes;
          IR = (salario *11 / 100);
          INSS = (salario * 8 / 100);
          Sindicato = (salario * 5 / 100);
          liquido = salario - IR - INSS - Sindicato;

          System.out.printf("\n- Salário Bruto: R$%.2f\n", salario);
          System.out.printf("- IR (11%%) : R$%.2f\n", IR);
          System.out.printf("- INSS (8%%) : R$%.2f\n", INSS);
          System.out.printf("- Sindicato (5%%) : R$%.2f\n", Sindicato);
          System.out.printf("- Salário Liquido : R$%.2f\n",liquido);
    }
}
