import java.util.Objects;

public class VariablePair {
    //pair to store idfr and type
    String IDFR;
    Type type;

    public VariablePair(String IDFR, Type type) {
        this.IDFR = IDFR;
        this.type = type;
    }

    public String getIDFR() {
        return IDFR;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VariablePair that = (VariablePair) o;

        return Objects.equals(IDFR, that.IDFR);
    }

    @Override
    public int hashCode() {
        return IDFR != null ? IDFR.hashCode() : 0;
    }
}
