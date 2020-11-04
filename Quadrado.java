public class quadrado extends Forma{
    
    private double lado;
    
    @Override
    public String getNome() {
        return "Quadrado";
    }
    
    @Override
    double calcularPerimetro() {
       return lado * 4;
    }
    
    @Override
    public double getArea() {

        return lado * lado;
    }
    
    
}