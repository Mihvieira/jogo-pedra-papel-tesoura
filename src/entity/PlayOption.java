package entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PlayOption{
    protected String imagePath;
    protected Set<PlayOption> power = new HashSet<>();

    public static final Pedra PEDRA = new Pedra();
    public static final Papel PAPEL = new Papel();
    public static final Tesoura TESOURA = new Tesoura();

    static {
        PEDRA.power.add(TESOURA);
        PAPEL.power.add(PEDRA);
        TESOURA.power.add(PAPEL);
    }

    public String getImagePath() {
        return imagePath;
    }

    public Set<PlayOption> getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayOption that = (PlayOption) o;
        return Objects.equals(imagePath, that.imagePath) && Objects.equals(power, that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagePath, power);
    }

    @Override
    public String toString() {
        return getClass().getName() + "{ " +
                "imagePath='" + imagePath + '\'' +
                ", power=" + power +
                '}';
    }
}
