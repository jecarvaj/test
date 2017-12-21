package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jean
 */
public class Curso {
    private final int idCurso;
    private String nivel;
    public List<Alumno> alumnos;
    private final double NOTA_APROBACION= 4.0;

    public Curso(int id, String nivel){
        this.idCurso=id;
        this.nivel=nivel;
        alumnos=new ArrayList<>();
    }
    
    public int getId(){return idCurso;}
    
    public void getAlumnos(){
        System.out.println("Alumnos "+nivel);
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno=alumnos.get(i);
            System.out.println((i+1)+") "+alumno.getNombres()+" "+alumno.getApellidos()+" -> "+alumno.getPromedio());
        }
    }
    
    public String getNivel(){
        return nivel;
    }
    
    public void setNivel(String newNivel){
        this.nivel=newNivel;
    }
    
    public Double getPromedio(){
        double sum=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno=alumnos.get(i);
            sum+=alumno.getPromedio();
        }
        double decimal = Math.round((sum/alumnos.size())*100.0)/100.0;
        return decimal;
    }
    
    public Alumno getMejorPromedio(){
       return Collections.max(alumnos);
    }
    
    public Alumno getPeorPromedio(){
        return Collections.min(alumnos);
    }
    
    public void getAprobados(){
        Alumno alumno;
        System.out.println("Alumnos aprobados: ");
        for (int i = 0; i < alumnos.size(); i++) {
            alumno=alumnos.get(i);
            if(alumno.getPromedio()>=NOTA_APROBACION){
                System.out.println(alumno.getNombres()+" "+alumno.getApellidos()+" -> "+alumno.getPromedio());
            }
        }
    }
    
     public void getReprobados(){
        Alumno alumno;
        System.out.println("Alumnos reprobados: ");
        for (int i = 0; i < alumnos.size(); i++) {
            alumno=alumnos.get(i);
            if(alumno.getPromedio()<NOTA_APROBACION){
                System.out.println(alumno.getNombres()+" "+alumno.getApellidos()+" -> "+alumno.getPromedio());
            }
        }
    }
    
}
