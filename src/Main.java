import entity.utils.Options;
import service.GameService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Options userOption = Options.values()[userInput - 1];
        GameService gameService = new GameService();
        var result = gameService.game(userOption);
        System.out.println("O Resultado é: " + result.toString());

        }


}