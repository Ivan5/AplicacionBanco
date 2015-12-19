
package aplicativo;


public class Banco {
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;
    
    public Banco(){
        persona1 = new Persona();
        persona2 = new Persona();
        persona3 = new Persona();
        
        persona1.setCodigo(1);
        persona1.setNombre("German");
        persona1.setMonto(1000);
        
        persona2.setCodigo(2);
        persona2.setNombre("Ivan");
        persona2.setMonto(1000);
        
        persona3.setCodigo(3);
        persona3.setNombre("Antonio");
        persona3.setMonto(1000);
    }

    public Persona getPersona1() {
        return persona1;
    }

    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }

    public Persona getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    public Persona getPersona3() {
        return persona3;
    }

    public void setPersona3(Persona persona3) {
        this.persona3 = persona3;
    }
    
}
