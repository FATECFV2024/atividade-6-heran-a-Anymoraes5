public class Mensalista extends Empregado {
    private String cargo;

    // construtor 
    public Mensalista(String n, String e, String c){
        super(n, e);
        cargo = c;
    }

   
    // metodos de acesso
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularSalario(){
        if (cargo.equals("Junior")){
            salario = 2500;
        } else if (cargo.equals("Pleno")){
            salario = 3500;
        }else if (cargo.equals ("Senior")){
            salario = 5500;
        }
    }
    
}
