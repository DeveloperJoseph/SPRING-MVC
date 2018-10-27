package jw.developer.it.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jw.developer.it.bd.BDConexion;
import jw.developer.it.idao.IAlumnoDAO;
import jw.developer.it.model.Alumno;

/**
 *
 * @author JOSEPH
 */
public class AlumnoDAO implements IAlumnoDAO {

    @Override
    public List<Alumno> ListadoAlumnos() {
        //DECLARAMOS NUESTROS OBJETOS

        //Intanciamos nuestro objeto ALUMNO en Listado y lo declaramos
        //como un nuevo ArrayList<>();
        List<Alumno> listaDeAlumnos = new ArrayList<>();

        //Establecemos  objeto BDconexion
        BDConexion objConexion = new BDConexion();

        //Instanciamos nuesto objeto Connection para ejecutar nuestra
        //conexion con nuestro base de datos con nuestro metodo 'establecerConexion()'
        Connection cnn = objConexion.establecerConexion();

        //INICIANDO CAPTURA DE ERRORES CONEXION CON DB
        try {
            //Instanciamos nuestro objeto Statement (consulta ssql)
            Statement st = cnn.createStatement();
            //Declaramos nuestro objeto Resultet 'rs' y Integramos obj Statement
            //y ejecutamos un Store Procedure (consultas sql)
            ResultSet rs = st.executeQuery("{call dbo.sp_ListarAlumnos}");

            //mientras resulset retorne objetos alumnos
            while (rs.next()) {
                //DECLARAMOS NUESTRO OBJETO ALUMNO PARA LLENAR EL CONSTRUCTOR
                //PUBLICO DE NUESTRA CLASE Alumno.java
                Alumno a = new Alumno();

                //setter and getter de nuestro objeto alumno
                a.setIdAlumno(rs.getString(1));
                a.setApeAlumno(rs.getString(2));
                a.setNomAlumno(rs.getString(3));
                a.setNomesp(rs.getString(4));
                a.setIdesp(rs.getString(5));
                a.setPROCE(rs.getString(6));
                listaDeAlumnos.add(a);
            }

            //cerramos conexion con nuestro objetos creados para establecer 
            //conexion con nuestra base de datos
            rs.close();
            st.close();
            objConexion.desconectarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeAlumnos;
    }

    @Override
    public Boolean AddAlumno(Alumno objAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean UpdateAlumno(Alumno objAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean DeleteAlumno(String IdAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
