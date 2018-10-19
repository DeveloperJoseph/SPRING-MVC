package jw.developer.it.controller;

//librerias importadas por el Framework(conjunto de librerias) de Spring
import java.util.List;
import jw.developer.it.dao.AlumnoDAO;
import jw.developer.it.dao.CursoDAO;
import jw.developer.it.dao.EspecialidadDAO;
import jw.developer.it.model.Alumno;
import jw.developer.it.model.Curso;
import jw.developer.it.model.Especialidad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author JOSEPH
 */
@Controller//definimos que esta clase .java sera un controlador spring 
public class DefaultController {

    //Mapeo de solicitud + el metodo GET
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {//metodo cadena denominado "index" + object modelo + retorna un cadena "index"
        CursoDAO objCursoDAO = new CursoDAO();
        List<Curso> ListadoCursos = objCursoDAO.listaCursos();
        model.addAttribute("ListadoCursos", ListadoCursos);
        return "index";
    }

    @RequestMapping(value = "/Alumno", method = RequestMethod.GET)
    public String Alumno(Model model) {
        //Declaramos nuestro objeto AlumnoDAO para obtener su método listado
        AlumnoDAO objAlumnoDAO = new AlumnoDAO();
        List<Alumno> ListaAlumnos = objAlumnoDAO.ListadoAlumnos();
        model.addAttribute("ListaAlumnos", ListaAlumnos);
        return "Alumno";
    }

    @RequestMapping(value = "/especialidad", method = RequestMethod.GET)
    public String especialidad(Model model) {
        EspecialidadDAO objEspecialidadDAO = new EspecialidadDAO();
        List<Especialidad> ListaEspecialidad = objEspecialidadDAO.ListadoEspecialidades();
        model.addAttribute("ListaEspecialidad", ListaEspecialidad);
        return "especialidad";
    }

    //Mapeo de solicitud + el metodo GET
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {//metodo cadena denominado "home" y retorna un cadena "home"
        return "home";
    }

}
