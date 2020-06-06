package instrument;

import instruments.IPlay;

public class Keyboard extends Instrument {

    private int musicSheet;

    public Keyboard(String name) {
        super(name);
        this.musicSheet = musicSheet;
    }

    public int getMusicSheet() {
        return musicSheet;
    }
}
