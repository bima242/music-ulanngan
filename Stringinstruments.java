//subclass

public class Stringinstruments extends instruments {
    private int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    // Constructor Parameter
    public Stringinstruments(String name, double price, int numStrings) {
        super(name, price);
        // variable = parameter
        this.numStrings = numStrings;
    }

    public Stringinstruments() {
        super();
        numStrings = 0;
    }

    // method print
    public void print() {
        super.print();
        System.out.println(" Number String :  " + numStrings);

    }

}