/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.nota;

/**
 *
 * @author slagogonzalez
 */
public class EjercicioNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       float i=0, ac=0;
       float nota1,nota2,nota3;
       String alumno;
       float calcularNotaMedia;
       for(i=0;i<30;){
       Examen n= new Examen();
       alumno=n.Alumno();
       nota1=n.getNota1();
       nota2=n.getNota2();
       nota3=n.getNota3();
       calcularNotaMedia= n.calcularNotaMedia(nota1,nota2,nota3);
       n.NotaMedia(calcularNotaMedia,alumno);
       i++;
    }
    
}
}
      

