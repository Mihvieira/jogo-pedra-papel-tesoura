package entity;

import entity.utils.Options;

public class Pedra extends PlayOption {
    public Pedra() {
        this.imagePath = "";
        this.power.add(Options.TESOURA);
    }
}
