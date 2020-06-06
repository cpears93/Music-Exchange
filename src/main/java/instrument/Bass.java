package instrument;

import instruments.IPlay;

public class Bass extends Instrument {

    private int strings;

    public Bass(String name) {
        super(name);
    }

    public int getStrings() {
        return strings;
    }
}
