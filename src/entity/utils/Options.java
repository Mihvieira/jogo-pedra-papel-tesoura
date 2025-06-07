package entity.utils;

import entity.*;

public enum Options {
    PEDRA(Pedra.class),
    PAPEL(Papel.class),
    TESOURA(Tesoura.class);

    private final Class<? extends PlayOption> classAssociate;

    Options(Class<? extends PlayOption> classAssociate) {
        this.classAssociate = classAssociate;
    }

    public Class<? extends PlayOption> getClassAssociate() {
        return classAssociate;
    }

    public static Options fromClass(Class<?> clazz) {
        for (Options options : Options.values()) {
            if (options.getClassAssociate() != null && options.getClassAssociate().equals(clazz)) {
                return options;
            }
        }
        return null;
    }
}
