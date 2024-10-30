// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Clase {
    private String codigMateria;
    private String nombreMateria;
    private String fechaInicio;
    private String fechaTermino;
    private int diasSemana;
    private int horasSemana;
    private int horasTotales;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    final int MAX_STUDENTS = 30;
    


    //CONSTRUCTORES
    public Clase() {
    }

    public Clase(String codigMateria, String nombreMateria, String fechaInicio, String fechaTermino, int diasSemana,
            int horasSemana, int horasTotales, Profesor profesor) {

        this.codigMateria = codigMateria;
        this.nombreMateria = nombreMateria;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.diasSemana = diasSemana;
        this.horasSemana = horasSemana;
        this.horasTotales = horasTotales;
        this.profesor = profesor;
        profesor.agregarClase(this);
        this.estudiantes = new ArrayList<>();
    }

    //SETTERS Y GETTERS
    public String getCodigMateria() {
        return codigMateria;
    }

    public void setCodigMateria(String codigMateria) {
        this.codigMateria = codigMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return new ArrayList<>(estudiantes);
    }

    // public void setEstudiante(ArrayList<Estudiante> estudiantes) { se omite
    //     this.estudiantes = estudiantes;
    // }
    
    public void agregarEstudiantesClase(Estudiante estudiante){
        if (getEstudiante().size()<=MAX_STUDENTS) {
            getEstudiante().add(estudiante);
            estudiante.agregarClase(this);
        } else{
            System.out.println("La clase ya tiene el maximo de 30 alumnos");
        }
    }

    public void imprimeAlumnosClase(){
        System.out.println("Estos son los nombres de los alumnos de la clase. "+ getCodigMateria() + " "+ getNombreMateria());
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos());
        }
    }

    public void imprimeProfesor(){
        System.out.println("Este es el profesor de la clase: ");
        System.out.println(profesor.getIdUniversidad()+" "+profesor.getNombre()+" "+profesor.getApellido()+" "+profesor.getEmail());
    }

    //
    public void mostrarInfoClase() {
        System.out.println("Información de la clase:");
        System.out.println("Código: " + getCodigMateria());
        System.out.println("Nombre: " + getNombreMateria());
        System.out.println("Fecha Inicio: " + getFechaInicio());
        System.out.println("Fecha Terminación: " + getFechaTermino());
        System.out.println("Horario: dias: " + getDiasSemana());
        System.out.println("Total Horas: " + getHorasTotales());
        System.out.println("Horas Semanales: " + getHorasSemana());
    }
}
