
public class Horista extends Empregado{
    private double horas;

    //construtor
    public Horista(String n, String e, double h){
        super(n, e);
        horas = h;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public void calcularSalario(){
        salario = horas * 50;
    }

}
