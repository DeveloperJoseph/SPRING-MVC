package jw.developer.it.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jw.developer.it.bd.BDConexion;
import jw.developer.it.idao.IEspecialiadDAO;
import jw.developer.it.model.Especialidad;

/**
 *
 * @author JOSEPH
 */
public class EspecialidadDAO implements IEspecialiadDAO {

    @Override
    public List<Especialidad> ListadoEspecialidades() {
        //objetos instanciados
        List<Especialidad> ListaEspecialidad = new ArrayList<>();
        BDConexion objConexion = new BDConexion();
        Connection cnn = objConexion.establecerConexion();

        try {
            //consulta sql
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("{call dbo.sp_ListarEspecialidad}");

            while (rs.next()) {
                Especialidad esp = new Especialidad();
                esp.setIdesp(rs.getString(1));
                esp.setNomesp(rs.getString(2));
                esp.setCosto(rs.getFloat(3));
                ListaEspecialidad.add(esp);//agregando objetos a mi ArrayList
            }

            //cerrar conexion
            rs.close();
            st.close();
            objConexion.desconectarConexion();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ListaEspecialidad;
    }

}
