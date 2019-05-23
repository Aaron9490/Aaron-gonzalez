package ud4CpEjercicio2;
/**
 *
 * @author Yeray
 */
public class Jedi extends Persona {
    
    //Atributos de un jedi
    private String especie;
    private String planeta;
    private String afiliacion;
    private String maestro;
        
    //METODOS PUBLICOS
    //  metodos constructores
    public Jedi(){
        super();
    }
    public Jedi(String nombre, String sexo, int edad, double estatura, double peso, String especie,String planeta, String afiliacion, String maestro){
        super(nombre, sexo, edad, estatura, peso);
        this.especie = especie;
        this.planeta = planeta;
        this.afiliacion = afiliacion;
        this.maestro = maestro;
    }
    
    //metodo que permite a un Jedi sentir la fuerza
    public String sentirLaFuerza(){
        String mensaje = "siente la fuerza";
        return mensaje;
    }
    //metodo que permite a un Jedi mover objetos
    public String moverObjetos(){
        String mensaje = "mueve una piedra para protegerse";
        return mensaje;
    }
    //metodo toString que nos permite ver toda la informacion de un Jedi
    @Override
    public String toString(){
        String datosJedi = 
                "...............................\n"
                +             "JEDI\n"
                + "...............................\n"
                + super.toString() + "\n"
                + "ESPECIE: " + especie + "\n"
                + "PLANETA: " + planeta + "\n"
                + "AFILIACION: " + afiliacion + "\n"
                + "MAESTROS: " + maestro + "\n"
                + "..............................";
        
       return datosJedi;
       
    }
            
    // metodos getters y setters
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getPlaneta(){
        return planeta;
    }
    public String getAfiliacion(){
        return afiliacion;
    }
    public void setAfiliacion(String afiliacion){
        this.afiliacion = afiliacion;
    }
    public String getMaestro(){
        return maestro;
    }
    public void setMaestros(String maestro){
        this.maestro = maestro;
    }
}
