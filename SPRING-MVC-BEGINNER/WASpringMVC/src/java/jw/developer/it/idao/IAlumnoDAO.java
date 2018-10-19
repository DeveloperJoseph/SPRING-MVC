package jw.developer.it.idao;

import java.util.List;
import jw.developer.it.model.Alumno;

/**
 *
 * @author JOSEPH
 */
public interface IAlumnoDAO {// CLASE PUBLICA JAVA INTERFACE

    //metodo publico List<alumno> que incluye nuestro objeto alumno y el nombre es Listado Alumnos.
    public List<Alumno> ListadoAlumnos();
    //metodo publico Boolean que incluye nuestro objeto alumno(modelo) y el nombre es AddAlumno.
    public Boolean AddAlumno(Alumno objAlumno); 
    //metodo publico Boolean que incluye nuestro objeto alumno(modelo) y el nombre es AddAlumno.
    public Boolean UpdateAlumno(Alumno objAlumno);
    //metodo publico Boolean el nombre  del metodo es DeleteAlumno y recibe como parameto una cadena String
    public Boolean DeleteAlumno(String IdAlumno);
}
