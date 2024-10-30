//subclass


public class Guitar extends Stringinstruments {
    private boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar(boolean isElectric) {
        this.isElectric = isElectric;
    }

     //Constructor Parameter
     public Guitar ( String name,double price,int numStrings,boolean isElectric  ) {
        super ( name, price, numStrings );
        //variable = parameter
        this.isElectric = isElectric;
      
    }
    public Guitar() {
        super();
        isElectric = false;
        
    }
    //method print
    public void print() {
        super.print();
        System.out.println(" Is Electric : " + isElectric);
    }
        
}