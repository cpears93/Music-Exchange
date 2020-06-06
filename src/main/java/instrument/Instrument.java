package instrument;

public abstract class Instrument {

    String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
