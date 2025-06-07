package entity;

import entity.utils.ResultOptions;

public class CalcWinner {
    PlayOption playOption1;
    PlayOption playOption2;
    PlayOption result;

    public CalcWinner(PlayOption playOption1, PlayOption playOption2) {
        this.playOption1 = playOption1;
        this.playOption2 = playOption2;
        this.calcResult();
    }

    public void calcResult() {
        if (this.playOption1 == null || this.playOption2 == null) {
            throw new IllegalArgumentException("PlayOption não pode ser nulo");
        }
        if (this.playOption1.equals(this.playOption2)) {
            this.result = new Empate();
        } else if (this.playOption1.power.contains(this.playOption2)) {
            this.result = this.playOption1;
        } else {
            this.result = this.playOption2;
        }
    }

    public PlayOption getResult() {
        return result;
    }
}
