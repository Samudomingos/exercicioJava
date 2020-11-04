public class Circulo extends Forma {

    
    private double raio;
    
    public String getNome() {
        return "Circulo";
    }
    
    
    double calcularPerimetro() {
       return (raio * 2) * 3.14;
    }
    
    public double getArea() {

        return (raio * raio) * 3.14;
    }
    



}