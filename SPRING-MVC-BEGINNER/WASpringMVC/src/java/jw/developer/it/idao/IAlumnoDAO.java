package jw.developer.it.idao;

import java.util.List;
import jw.developer.it.model.Alumno;

/**
 *
 * @author JOSEPH
 */
public interface IAlumnoDAO {// CLASE PUBLICA JAVA INTERFACE

    //metodo publico List<alumno> que incluye nuestro objeto alumno
    //y el nombre es Listado Alumnos.
    public List<Alumno> ListadoAlumnos();

}
