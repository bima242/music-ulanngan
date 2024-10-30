import java.util.Scanner;

public class TesterInputMusic {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println(" 1. Piano\n2. Guitar");
    System.out.println();
    int pilihan = s.nextInt();
    s.nextLine();
    switch (pilihan) {
        case 1:
        System.out.println(" Piano ");
        System.out.println(" Name : ");
        String name = s.nextLine();
        System.out.println(" Piano Type : ");
        String pianoType = s.nextLine();
        System.out.println(" Price : ");
        double price = s.nextDouble();
        Piano a = new Piano( name, pianoType, price);
        a.print();
        break;

        case 2: 
        System.out.println(" Guitar ");
        System.out.println(" Name : ");
        name = s.nextLine();
        System.out.println(" Gitar Elektrik(true) / Gitar Akustik(false) ");
        boolean isElectric = s.nextBoolean();
        System.out.println(" Senar gitar : ");
        int numStrings = s.nextInt();
        System.out.println(" Price :  ");
        price = s.nextDouble();
        Guitar b = new Guitar(name, price, numStrings, isElectric);
        b.print();
        break;


    

    }



    }
}
