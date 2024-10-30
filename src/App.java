public class App {
    public static void main(String[] args) throws Exception {
        
        // PROFESORES
        Profesor profesor1 = new Profesor("Jose Luis", "Montoya Pareja", "1111102", "1111105547",
                "jmontoya@eafit.edu.co");
        Profesor profesor2 = new Profesor("Andres", "Sicard", "1111103", "1111105548", "asr@eafit.edu.co");

        // ESTUDIANTES
        Estudiante estudiante1 = new Estudiante("Santiago", "Ospina", "1037640977", "201410040014",
                "sospin12@eafit.edu.co", "Ingenieria de sistemas");
        Estudiante estudiante2 = new Estudiante("Pepito", "Perez", "1037640978", "201410040015",
                "pperez12@eafit.edu.co", "Ingenieria mecánica");
        Estudiante estudiante3 = new Estudiante("Pepita", "Hernandez", "1037640978", "201410040015",
                "pherna14@eafit.edu.co", "Ingenieria de diseño de producto");

        // CLASES
        Clase clase1 = new Clase("33332212", "fundamentos de programacion", "03/18/1995", "03/05/2005", 3, 6, 84,
                profesor1);
        Clase clase2 = new Clase("33332564", "fundamentos de programacion2", "03/18/1995", "03/05/2005", 3, 6, 84,
                profesor2);
        Clase clase3 = new Clase("33332565", "fundamentos de programacion3", "03/18/1995", "03/05/2005", 4, 8, 90,
                profesor1);

        clase1.agregarEstudiantesClase(estudiante1);
        clase1.agregarEstudiantesClase(estudiante2);
        clase1.agregarEstudiantesClase(estudiante3);
        clase2.agregarEstudiantesClase(estudiante1);
        clase2.agregarEstudiantesClase(estudiante2);
        clase2.agregarEstudiantesClase(estudiante3);
        clase3.agregarEstudiantesClase(estudiante3);
        clase3.agregarEstudiantesClase(estudiante2);

        profesor1.imprimeLista();

        estudiante1.imprimirClase();
        estudiante2.imprimirClase();

        clase1.mostrarInfoClase();
        clase1.imprimeProfesor();
        clase1.imprimeAlumnosClase();
        
    }
}
