package service;

import entity.CalcWinner;
import entity.PlayOption;
import entity.PlayerGenerator;
import entity.utils.Options;

public class GameService {

    public GameService() {
    }

    public PlayOption game(Options userOption) {
        if (userOption == null) {
            throw new IllegalArgumentException("Opção não pode ser nula");
        }
        var player1 = this.generateEntity(userOption);
        PlayerGenerator player2 = new PlayerGenerator();
        System.out.println("O player2 escolheu: " + player2.getOption().toString());
        CalcWinner calcWinner = new CalcWinner(player1, player2.getOption());
        return calcWinner.getResult();
    }

    public PlayOption generateEntity(Options option) {
        try {
            return option.getClassAssociate().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possível instanciar a opção: " + option, e);
        }
    }
}
