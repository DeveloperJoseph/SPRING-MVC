package jw.developer.it.idao;

//librerias importadas
import java.util.List;
import jw.developer.it.model.Curso;

/**
 *
 * @author JOSEPH
 */
public interface ICursoDAO {

    //metodo publico para listar cursos + add + update + delete
    public List<Curso> listaCursos();
    public Boolean AddCurso(Curso objCurso);
    public Boolean UpdateCurso(Curso objCurso);
    public Boolean DeleteCurso(String IdCurso);
    
}
