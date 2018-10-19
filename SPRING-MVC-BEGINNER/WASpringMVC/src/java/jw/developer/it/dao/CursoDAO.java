package jw.developer.it.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jw.developer.it.bd.BDConexion;
import jw.developer.it.idao.ICursoDAO;
import jw.developer.it.model.Curso;

/**
 *
 * @author JOSEPH
 */
public class CursoDAO implements ICursoDAO {

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public List<Curso> listaCursos() {
        //INSTANCIAMOS NUESTRO OBJETOS
        List<Curso> listadoCursos = new ArrayList<>();
        BDConexion objConexion = new BDConexion();
        Connection cnn = objConexion.establecerConexion();
        try {
            //OBJETOS DE CONSULTA SQL
            Statement st =  cnn.createStatement();
            ResultSet rs = st.executeQuery("{call dbo.sp_listarCursos}");
            
            //mientras resulset
            while(rs.next()){
                Curso c = new Curso();//new objeto curso
                c.setIdCurso(rs.getString(1));
                c.setNomCurso(rs.getString(2));
                c.setCredito(rs.getString(3));
                listadoCursos.add(c);
            }
            //cerramos conexion con nuestros objetos creados
            rs.close();
            st.close();
            objConexion.desconectarConexion();
            
        } catch (SQLException e) {
            e.printStackTrace();//salida de error por consola
        }
        return listadoCursos;//retornando listado
    }

    @Override
    public Boolean AddCurso(Curso objCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean UpdateCurso(Curso objCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean DeleteCurso(String IdCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
