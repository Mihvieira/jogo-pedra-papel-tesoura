package entity;

import entity.utils.Options;
import entity.utils.ResultOptions;

public class CalcWinner {
    PlayOption playOption1;
    PlayOption playOption2;
    String message;

    public CalcWinner(PlayOption playOption1, PlayOption playOption2) {
        this.playOption1 = playOption1;
        this.playOption2 = playOption2;
    }

    public String calcResult() {
        if (this.playOption1 == null || this.playOption2 == null) {
            throw new IllegalArgumentException("PlayOption não pode ser nulo");
        }

        if (this.playOption1.equals(this.playOption2)) {
            this.message = "Empate!";
        } else if (this.playOption1.power.contains(Options.fromClass(this.playOption2.getClass()))) {
            this.message = "Você venceu!";
        } else {
            this.message = "Você perdeu!";
        }
        return message;
    }
}
