package jw.developer.it.model;

/**
 *
 * @author JOSEPH
 */
public class Curso {
    
//DEFINIENDO LAS PROPIEDADES DE NUESTRO OBJETO

    private String IdCurso;
    private String NomCurso;
    private String credito;

  //contructor vacio
    public Curso(){
        
    }
    
    //GET AND SET DE NUESTRO OBJETO CURSO

    public String getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(String IdCurso) {
        this.IdCurso = IdCurso;
    }

    public String getNomCurso() {
        return NomCurso;
    }

    public void setNomCurso(String NomCurso) {
        this.NomCurso = NomCurso;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
    
    
}
