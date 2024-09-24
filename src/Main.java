import entities.Champions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do Primeiro Campeão: ");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();

        Champions champions1 = new Champions(name, life,attack,armor);

        System.out.println("Dados do Segundo Campeão: ");
        System.out.print("Nome: ");
        String name2 = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();

        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();

        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        Champions champions2 = new Champions(name2,life2,attack2,armor2);

        System.out.print("Quantos Turno deseja executar: ");
        int quantidadeRound = sc.nextInt();


        for (int i = 0; i < quantidadeRound; i++) {
            System.out.println("Resultado do " + (i + 1)+"º turno ");

            champions1.takeDamage(champions2);
            champions2.takeDamage(champions1);

            System.out.println(champions1.status());
            System.out.println(champions2.status());

            if (champions1.getLife() == 0 || champions2.getLife() == 0) {
                break;
            }
            System.out.println();
        }
        System.out.println("\nFim do combate");

    }
}