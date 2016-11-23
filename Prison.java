package medev_tp;

public class Prison extends Case {
    // une sous-classe de Case

    private int caution; // caution

    public Prison() {
        this.caution = 0;
    }

    public Prison(int caution) {
        this.caution = caution;
    }

    public Prison(Prison p) {
        super((Case) p);
        this.caution = p.caution;
    }

    public int getCaution() {
        return caution;
    }

    public void setCaution(int caution) {
        this.caution = caution;
    }
}
