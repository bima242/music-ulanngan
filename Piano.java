//subclass

public class Piano extends instruments {
    private String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    //Constructor Parameter
    public Piano ( String name,String pianoType,double price  ) {
        super ( name, price );
        //variable = parameter
        this.pianoType = pianoType;
      
    }
    public Piano() {
        super();
        pianoType = " Upright piano ";
        
    }
    //method print
    public void print() {
        super.print();
        System.out.println(" Tipe piano : " + pianoType);
    }
    
}
