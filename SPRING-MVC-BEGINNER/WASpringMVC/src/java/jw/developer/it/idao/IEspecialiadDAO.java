package jw.developer.it.idao;

import java.util.List;
import jw.developer.it.model.Especialidad;

/**
 *
 * @author JOSEPH
 */
public interface IEspecialiadDAO {

    //interfaz de listado objeto especialidad + add + update + delete
    public List<Especialidad> ListadoEspecialidades();
    public Boolean AddEspecialidad(Especialidad objEspecialidad);
    public Boolean UpdateEspecialidad(Especialidad objEspecialidad);
    public Boolean DeleteEspecialidad(String Idesp);
}
