package service;

import entity.CalcWinner;
import entity.PlayOption;
import entity.PlayerGenerator;
import entity.utils.Options;

public class GameService {

    public Result playRound(Options userOption) {
        if (userOption == null) {
            throw new IllegalArgumentException("Opção não pode ser nula");
        }
        PlayOption player1 = generateEntity(userOption);
        PlayerGenerator player2 = new PlayerGenerator();
        PlayOption player2Option = player2.getOption();
        CalcWinner calcWinner = new CalcWinner(player1, player2Option);
        String resultado = calcWinner.calcResult();
        return new Result(player2Option, resultado);
    }

    private PlayOption generateEntity(Options option) {
        try {
            return option.getClassAssociate().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possível instanciar a opção: " + option, e);
        }
    }

    // Classe interna para encapsular o resultado da rodada
    public static class Result {
        public final PlayOption player2Option;
        public final String winner;
        public Result(PlayOption player2Option, String winner) {
            this.player2Option = player2Option;
            this.winner = winner;
        }
    }
}
