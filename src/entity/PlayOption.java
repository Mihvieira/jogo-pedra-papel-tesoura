package entity;

import entity.utils.Options;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PlayOption{
    protected String imagePath;
    protected Set<Options> power = new HashSet<>();

    public String getImagePath() {
        return imagePath;
    }

    public Set<Options> getPower() {
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
        return getClass().getSimpleName() + "{ " +
                "imagePath='" + imagePath + '\'' +
                ", power=" + power +
                '}';
    }
}
