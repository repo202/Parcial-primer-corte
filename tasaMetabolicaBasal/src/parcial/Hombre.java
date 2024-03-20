package parcial;

public class Hombre extends Tasa {

    public Hombre() {
    }

    public Hombre(char genero,double peso, double altura, int edad) {
        super(genero,peso, altura, edad);
    }
    
    @Override
    public void tasaMetabolicaBasal(double peso, double altura, int edad) {
        double res;
        res = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
        System.out.println("la tasa metabolica basal es: " + res);
    }

    @Override
    public void tasaMetabolicaBasal(char genero, double peso, double altura, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
