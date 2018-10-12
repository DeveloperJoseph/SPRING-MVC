package jw.developer.it.model;

/**
 *
 * @author JOSEPH
 */
public class Alumno {

    //DECLARAMOS PROPIEDADES DE NUESTRO OBJETO Alumno
    private String IdAlumno;
    private String ApeAlumno;
    private String NomAlumno;
    private String Idesp;
    private String PROCE;

    //declaramos un constructor vacio para nuestro objeto Alumno
    public Alumno() {

    }

    //GETTERS AND SETTERS PARA NUESTRO OBJETO ALUMNO
    public String getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(String IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getApeAlumno() {
        return ApeAlumno;
    }

    public void setApeAlumno(String ApeAlumno) {
        this.ApeAlumno = ApeAlumno;
    }

    public String getNomAlumno() {
        return NomAlumno;
    }

    public void setNomAlumno(String NomAlumno) {
        this.NomAlumno = NomAlumno;
    }

    public String getIdesp() {
        return Idesp;
    }

    public void setIdesp(String Idesp) {
        this.Idesp = Idesp;
    }

    public String getPROCE() {
        return PROCE;
    }

    public void setPROCE(String PROCE) {
        this.PROCE = PROCE;
    }

}
