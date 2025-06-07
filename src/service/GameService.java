package service;

import entity.CalcWinner;
import entity.PlayOption;
import entity.PlayerGenerator;

public class GameService {

    public GameService() {
    }

    public PlayOption game(String userOption) {
        if (userOption == null) {
            throw new IllegalArgumentException("Opção não pode ser nula");
        }
        var player1 = this.generateEntity(userOption);
        PlayerGenerator player2 = new PlayerGenerator();
        CalcWinner calcWinner = new CalcWinner(player1, player2.getOption());
        return calcWinner.getResult();
    }

    public PlayOption generateEntity(String option){
        return switch (option) {
            case "PEDRA" -> new entity.Pedra();
            case "PAPEL" -> new entity.Papel();
            case "TESOURA" -> new entity.Tesoura();
            default -> throw new IllegalArgumentException("Opção inválida: " + option);
        };
    }
}
