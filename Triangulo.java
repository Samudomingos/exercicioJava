public class triangulo extends Forma {
    
    private double base;
    private double lado;
    
    
    @Override
    public String getNome() {
        return "Triangulo";
    }
    
    @Override
    double calcularPerimetro() {
       return lado * 3;
    }
    
    @Override
    public double getArea() {

        int x = 3;
        
        return ((lado * lado) * Math.sqrt(x)) / 4;
    }
    
    
}
