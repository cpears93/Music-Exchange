package instrument;

import instruments.IPlay;

public class Drums extends Instrument {

    private int pedals;

    public Drums(String name) {
        super(name);
        this.pedals = pedals;
    }

    public int getPedals() {
        return pedals;
    }
}
