import service.GameService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha entre as seguintes opções: Pedra, Papel ou Tesoura");
        Scanner scanner = new Scanner(System.in);
        var userOption = scanner.next();
        GameService gameService = new GameService();
        var result = gameService.game(userOption);
        System.out.println("O Resultado é: " + result.toString());
        }
}