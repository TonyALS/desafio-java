package exercise4.exercisethree;

import exercise4.exercisethree.entity.Login;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        String user = sc.next();
        System.out.println("Digite a senha: ");
        String password = sc.next();
        Login login = new Login(user, password);

        System.out.println("LOGIN");
        System.out.println("Digite o usuário: ");
        user = sc.next();
        System.out.println("Digite a senha: ");
        password = sc.next();
        if (login.login(user, password)) {
            System.out.println("Autenticado");
        }
    }
}
