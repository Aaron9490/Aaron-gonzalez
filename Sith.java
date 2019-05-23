package ud4CpEjercicio2;

/**
 *
 * @author Yeray
 */
public class Sith extends Persona {
    //atributos de un sith
    private String planeta;
    private String especie;
    private String afiliacion;
    private String maestro;
    
       //METODOS PUBLICOS
    
    //constructores
    public Sith(){
        super(); 
    }
    public Sith(String nombre, String sexo, int edad, double estatura, double peso,String planeta, String especie, String afiliacion, String maestro){
        
        super(nombre, sexo, edad, estatura, peso);
        this.planeta = planeta;
        this.especie = especie;
        this.afiliacion = afiliacion;
        this.maestro = maestro;
    }
    
    //metodo que permite a un Sith estrangular con la fuerza
    public String estrangularConLaFuerza(){
        String mensaje = "estrangula con la fuerza el cuello  de su oponente, queda inmovilizado, inspira miedo";
        return mensaje;
    }
    // metodo que permiete a un Sith usar el rayo de la fuerza
    public String UsarRayoDeLaFuerza(){
        String mensaje = "descarga de energía eléctrica que casi deforma a su oponente";
        return mensaje;
    }
    
   // metodo que permite a un Sith pagar la hipoteca
    public String pagarHipoteca(){
        String mensaje = "esto no te lo esperas ¡¡¡PAGO LA HIPOTECA!!!";
        return mensaje;
    }
    
    //metodo para mostrar la informaicon de un Sith
    
    @Override
    public String toString(){
        String datosSith = 
                "...............................\n"
                + "SITH\n"
                + "...............................\n"
                + super.toString() + "\n"
                + "ESPECIE: " + especie + "\n"
                + "PLANETA: " + planeta + "\n"
                + "AFILIACION: " + afiliacion + "\n"
                + "MAESTROS: " + maestro + "\n"
                + "..............................";
        
       return datosSith;
        
    }
    
    //metodos getters y setters
   
    public String getPlaneta(){
        return planeta;
    }
    public void setPlaneta(String planeta){
        this.planeta = planeta;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
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