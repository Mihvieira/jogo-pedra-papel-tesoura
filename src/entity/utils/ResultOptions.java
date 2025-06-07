package entity.utils;

import entity.*;
public enum ResultOptions {
    PEDRA(Pedra.class),
    PAPEL(Papel.class),
    TESOURA(Tesoura.class),
    EMPATE(Empate.class);

    private final Class<? extends PlayOption> classeAssociada;

    ResultOptions(Class<? extends PlayOption> classeAssociada) {
        this.classeAssociada = classeAssociada;
    }

    public Class<? extends PlayOption> getClasseAssociada() {
        return classeAssociada;
    }

    public static ResultOptions fromClass(Class<?> clazz) {
        for (ResultOptions resultOptions : ResultOptions.values()) {
            if (resultOptions.getClasseAssociada() != null && resultOptions.getClasseAssociada().equals(clazz)) {
                return resultOptions;
            }
        }
        return null;
    }
}