package entity;

import entity.utils.Options;

import java.util.Random;

public class PlayerGenerator {
    private PlayOption option;

    public PlayerGenerator() {
        this.generateOption();
    }

    public void generateOption(){
        Options[] options = Options.values();
        int idx = new Random().nextInt(options.length);
        switch (options[idx]){
            case PEDRA -> {
                this.option = new Pedra();
            }
            case PAPEL -> {
                this.option = new Papel();
            }
            case TESOURA -> {
                this.option = new Tesoura();
            }
        }

    }

    public PlayOption getOption() {
        return option;
    }
}
