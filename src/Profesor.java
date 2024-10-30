import java.util.ArrayList;
import java.util.List;

public class Profesor {

    //VARIABLE DEFINITION
    private String nombre;
    private String apellido;
    private String documentoIdentificacion;
    private String idUniversidad;
    private String email;
    private List<Clase> clases;

    //CONSTRUCTOR
    public Profesor(String nombre, String apellido, String documentoIDentificacion, String idUniversidad, String email){
        setNombre(nombre);
        setApellido(apellido);
        setDocumentoIdentificacion(documentoIDentificacion);
        setIdUniversidad(idUniversidad);
        setEmail(email);
        this.clases = new ArrayList<>();
    }    

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }
    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }
    public String getIdUniversidad() {
        return idUniversidad;
    }
    public void setIdUniversidad(String idUniversidad) {
        this.idUniversidad = idUniversidad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //METHODS
    public void agregarClase(Clase clases){
        if (this.clases.size()<=5){
            this.clases.add(clases);
        } else{
            System.out.println("el profesor no puede dar mas de 5 clases.");
        }        
    }

    public void imprimeLista(){
        System.out.println("Clases dictadas por: "+ nombre + " "+ apellido + ":");
        for (Clase clase : clases) {
            System.out.println("Código: "+clase.getCodigMateria()+", Nombre: "+clase.getNombreMateria());
        }
    }
}
