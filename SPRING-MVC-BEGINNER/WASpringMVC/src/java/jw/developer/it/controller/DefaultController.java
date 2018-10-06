package jw.developer.it.controller;

//librerias importadas por el Framework(conjunto de librerias) de Spring
import java.util.List;
import jw.developer.it.dao.CursoDAO;
import jw.developer.it.model.Curso;
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
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {//metodo cadena denominado "index" + object modelo + retorna un cadena "index"
        CursoDAO objCursoDAO = new CursoDAO();
        List<Curso> ListadoCursos =  objCursoDAO.listaCursos();
        model.addAttribute("ListadoCursos", ListadoCursos);       
        return "index";
    }

    //Mapeo de solicitud + el metodo GET
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {//metodo cadena denominado "home" y retorna un cadena "home"
        return "home";
    }

}
