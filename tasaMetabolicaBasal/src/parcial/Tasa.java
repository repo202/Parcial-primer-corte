package parcial;

public abstract class Tasa {
    protected char genero;
    protected double peso;
    protected double altura;
    protected int edad;

    
    public Tasa() {
    }
    
    public Tasa(char genero, double peso, double altura, int edad) {
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
    
    public abstract void tasaMetabolicaBasal (double peso, double altura, int edad);
    public abstract void tasaMetabolicaBasal (char genero, double peso, double altura, int edad);
    
}
