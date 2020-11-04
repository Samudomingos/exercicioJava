public class retangulo extends Forma{
    private double base;
    private double altura;
    
    
    @Override
    public String getNome() {
        return "Retangulo";
    }
    
    
    @Override
    double calcularPerimetro() {
       return (base * 2) + (altura * 2);
    }
    
    @Override
    public double getArea() {

        return base * altura;
    }
}