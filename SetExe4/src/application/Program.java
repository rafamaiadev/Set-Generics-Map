package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudantes para o curso A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = (int) (0 + Math.random() * 10);
            a.add(number);
        }
        System.out.print("Quantos estudantes para o curso B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = (int) (0 + Math.random() * 10);
            b.add(number);
        }
        System.out.print("Quantos estudantes para o curso C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = (int) (0 + Math.random() * 10);
            c.add(number);
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Total de estudantes: " + total.size());

        sc.close();

    }
}
