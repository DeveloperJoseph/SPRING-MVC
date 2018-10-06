package jw.developer.it.idao;

//librerias importadas
import java.util.List;
import jw.developer.it.model.Curso;

/**
 *
 * @author JOSEPH
 */
public interface ICursoDAO {

    //metodo publico para listar cursos
    public List<Curso> listaCursos();
}
