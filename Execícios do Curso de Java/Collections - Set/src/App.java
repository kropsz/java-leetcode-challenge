import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for curse A ?: ");
        int students = sc.nextInt();
        System.out.println("Enter a code student: ");
        for (int i = 0; i < students; i++) {
           int number = sc.nextInt();
           a.add(number);             
        }

        System.out.print("How many students for curse B ?: ");
        int studentsB = sc.nextInt();
        System.out.println("Enter a code student: ");
        for (int i = 0; i < studentsB; i++) {
           int number= sc.nextInt();
           b.add(number);             
        }

        System.out.print("How many students for curse C ?: ");
        int studentsC = sc.nextInt();
        System.out.println("Enter a code student: ");
        for (int i = 0; i < studentsC; i++) {
            int number = sc.nextInt();
           c.add(number);             
     
       }


        Set<Integer> totalAlunos = new HashSet<>(a);
        totalAlunos.addAll(c);
        totalAlunos.addAll(b);

        System.out.println("Total students: " + totalAlunos.size());
    }
}
