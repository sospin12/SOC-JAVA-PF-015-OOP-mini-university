import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    public String nombre;
    public String apellidos;
    public String documentoIdentidad;
    public String idUniversidad;
    public String email;
    public String carrera;
    public List<Clase> clases;

    
    public Estudiante(){
    }
    
    public Estudiante(String nombre, String apellidos, String documentoIdentidad, String idUniversidad, String email,
            String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
        this.idUniversidad = idUniversidad;
        this.email = email;
        this.carrera = carrera;
        this.clases = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    //METHODS
    public void agregarClase(Clase clase){
        if (this.clases.size()<=7) {
            this.clases.add(clase);
        } else{
            System.out.println("El estudiante no puede ver mas de 7 materias por semestre.");
        }
    }

    public void imprimirClase(){
        System.out.println("Estas son las materias del estudiante: " + getNombre() + " "+ getApellidos());
        for (Clase clase : clases) {
            System.out.println("Código: "+clase.getCodigMateria()+", nombre: "+ clase.getNombreMateria());
        }
    }
}
