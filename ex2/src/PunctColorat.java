public class PunctColorat extends Punct{

    /*
    Da, este nevoie sa generam un nou constructor in clasa "PunctColorat",
    deoarece este o claa cu atribute specializate fata de
    atributele generale ale clasei "Punct".
     */
    private int c;

    public PunctColorat(int x, int y, int c) {
        super(x, y);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
