package parcial;

public class Mujer extends Tasa {

    public Mujer() {
    }

    public Mujer(char genero, double peso, double altura, int edad) {
        super(genero, peso, altura, edad);
    }
    
    
    
    @Override
    public void tasaMetabolicaBasal(char genero, double peso, double altura, int edad) {
        double res;
        res = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
        System.out.println("la tasa metabolica basal es: " + res);
    } 

    @Override
    public void tasaMetabolicaBasal(double peso, double altura, int edad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
