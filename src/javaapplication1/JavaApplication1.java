/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Jean
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos un curso
        Curso c1=new Curso(1, "4°");
        
        //creamos alumnos con sus notas
        Alumno a1=new Alumno(1,c1,"Jean Carlos", "Carvajal Vergara");
        a1.addNota(6.5);
        a1.addNota(6.4);
        a1.addNota(5.1);
        a1.addNota(4.2);
        a1.addNota(5.5);
        
        Alumno a2=new Alumno(2,c1,"Michael Perez", "Jackson");
        a2.addNota(3.5);
        a2.addNota(6.5);
        a2.addNota(4.2);
        a2.addNota(6.6);
        a2.addNota(5.8);
        
         Alumno a3=new Alumno(3,c1,"Juan", "Gabriel");
        a3.addNota(5.4);
        a3.addNota(6.2);
        a3.addNota(2.4);
        a3.addNota(6.7);
        a3.addNota(5.8);
        
        Alumno a4=new Alumno(4,c1,"Juanito", "Perez");
        a4.addNota(2.5);
        a4.addNota(4.4);
        a4.addNota(3.1);
        a4.addNota(1.2);
        a4.addNota(3.7);
        
        //Lista de alumnos
        c1.getAlumnos();
        
        System.out.println("----------------------------------------------------");
         
        //Promedio del curso
        System.out.println("Promedio de curso es "+c1.getPromedio());
        
        System.out.println("----------------------------------------------------");
        
        //Alumnos aprobados
        c1.getAprobados();
        System.out.println("----------------------------------------------------");
        
        //Alumnos reprobados
        c1.getReprobados();
        System.out.println("----------------------------------------------------");
        
        //Mejor y peor promedio
        Alumno mejorP=c1.getMejorPromedio();
        Alumno peorP=c1.getPeorPromedio();
        System.out.println("El mejor promedio es "+mejorP.getNombres()+" "+mejorP.getApellidos());
        System.out.println("El peor promedio es "+peorP.getNombres()+" "+peorP.getApellidos());
     
                
        
        
        
    
    }
    
}
