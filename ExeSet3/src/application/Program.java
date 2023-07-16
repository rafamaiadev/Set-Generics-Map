package application;

import entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            Set<User> set = new HashSet<>();

            while (line != null) {
                String[] fields = line.split(" ");
                set.add(new User(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }
            System.out.print("Total users: ");
            System.out.println(set.size());


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
