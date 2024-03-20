package parcial;

import java.util.Scanner;

public class TasaMetabolicaBasal {

    public static void main(String[] args) {
    int op;
    Scanner sc = new Scanner(System.in);
    Tasa t; 
    
    
    do {
        System.out.println("Ingrese: ");
        System.out.println("1. Para TMB hombre ");
        System.out.println("2. Para TMB mujer ");
        op = sc.nextInt();
    
        if (op == 1) {
            double al, pes;
            int ed;
            t = new Hombre();
            System.out.println("Ingresa tu altura: ");
            al = sc.nextDouble();
            System.out.println("Ingresa tu peso");
            pes = sc.nextDouble();
            System.out.println("Ingresa tu edad");
            ed =sc.nextInt();
            t.tasaMetabolicaBasal(pes, al, ed);
        } else if (op == 2) {
            double al1, pes1;
            int ed1;
            t = new Mujer();
            System.out.println("Ingresa tu altura: ");
            al1 = sc.nextDouble();
            System.out.println("Ingresa tu peso");
            pes1 = sc.nextDouble();
            System.out.println("Ingresa tu edad");
            ed1 =sc.nextInt();
            t.tasaMetabolicaBasal('F', pes1, al1, ed1);
            
        } else {
            System.out.println("Eliga una de las opciones anteriores");
        }
    } while(op <1 || op>2);
    
    
    
    }
    
}
