package ud4CpEjercicio2;

/**
 *
 * @author Yeray
 */
public class Persona {
    
    //atributos de la clase persona
    private String nombre;
    private String sexo;
    private String DNI;
    private int edad;
    private double estatura;
    private double peso;
    
    //METODOS PUBLICOS
   //metodos constructores
    public Persona(){
        generarDNI();
    }
    public Persona(String nombre, String sexo, int edad, double estatura, double peso){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        generarDNI();
    }
   //metodo que permiete a las personas comer
    public String comer(){
        String mensaje = "ñam ñam";
        return mensaje;
    }
    //metodo que permiete a las personas pensar
    public String pensar(){
        String mensaje = "Estoy pensando";
        return mensaje;
    }
    //metodo que nos muestra la informacion de las persona
    @Override
    public String toString(){
        String informacionPersona =
               
                "NOMBRE: " + nombre + "\n"
                + "SEXO: " + sexo + "\n"
                + "DNI: " + DNI + "\n"
                + "EDAD:" + edad + "\n"
                + "ESTATURA: " + estatura + "\n"
                + "PESO: " + peso + "";
            
        
        return informacionPersona;
                
    }
    //metodos getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getEstatura(){
        return estatura;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    //METODOS PRIVADOS
    
    //metodo que genera un numero aleatorio y asigna una letra a ese numero segun la posicion del resto  en un vector
     private void generarDNI() {
     
        int numeroAleatorioDNI = ((int) Math.floor(Math.random() * (100000000 - 1) + 1));
        int resto = numeroAleatorioDNI - (numeroAleatorioDNI /23 *23);
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z','S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraDNI = letras[resto];
        
        // convierte la variable int numeroaleatorioDNI a String para que coincida con el atributo dni
        DNI = Integer.toString(numeroAleatorioDNI) + letraDNI;
    }
}
