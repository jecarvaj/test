package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean
 */
public class Alumno implements Comparable<Alumno> {
    private int idAlumno;
    private Curso curso;
    private String nombres;
    private String apellidos;
    private List<Double> notas; 
    
    public Alumno(int id, Curso curso, String nombres, String apellidos){
        this.idAlumno=id;
        this.curso=curso;
        this.nombres=nombres;
        this.apellidos=apellidos;
        notas= new ArrayList<>();
        curso.alumnos.add(this);
    }
    
    public Alumno(){
    }
    
    public int getId(){ return idAlumno;}
    
    public String getNombres(){return nombres;}
    
    public void setNombres(String newNombre){
        this.nombres=newNombre;
    }
    
    public String getApellidos(){return apellidos;}
    
    public void setApellidos(String newApellidos){
        this.apellidos=newApellidos;
    }
    
    public void setCurso(Curso newCurso){
        this.curso=newCurso;
    }
    
    public Double getPromedio(){
        double sum=0;
        for (int i = 0; i < notas.size(); i++) {
            sum+= notas.get(i);
        }
        double decimal = Math.round((sum/notas.size())*100.0)/100.0;
        return decimal;
    }
    
    public void addNota(double nota){
        this.notas.add(nota);
    }

    @Override
    public int compareTo(Alumno o) {
        return this.getPromedio().compareTo(o.getPromedio());
    }

 
}
