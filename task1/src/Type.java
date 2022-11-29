import java.util.function.Predicate;

public enum Type {
    INT("int"), BOOL("bool"), UNIT("unit");

    private final String text;

    Type(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    static Type returnType(String text) {
        switch (text) {
            case "int":
                return Type.INT;
            case "bool":
                return Type.BOOL;
            case "unit":
                return Type.UNIT;
        }
        return null;
    }
}

