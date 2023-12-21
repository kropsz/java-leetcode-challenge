import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();
        
        System.out.print("Enter the number of the tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (i/c) ?");
            char aux = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income:");
            Double rendaAnual = sc.nextDouble();
            if (aux == 'i') {
                System.out.print("Health expenditures:");
                Double gastosComSaude = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(name, rendaAnual, gastosComSaude);
                list.add(pf);
            }
            else{
                System.out.print("Number of employees: ");
                int number = sc.nextInt();
                PessoaJuridica pj = new PessoaJuridica(name, rendaAnual, number);
                list.add(pj);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        Double totalSum = 0.0;
        for (Pessoa pessoa : list) {
            totalSum += pessoa.calculaImposto();
            System.out.println(pessoa.getNome() + ": $" + pessoa.calculaImposto());
        }

        System.out.println("TOTAL TAXES: $" + totalSum);

        sc.close();
    }
}
