package instrument;

import instruments.IPlay;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String name) {
        super(name);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }
}
