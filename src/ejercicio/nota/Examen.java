/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.nota;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class Examen {
    float i=0,ac=0;
    float nota1,nota2,nota3;
    String alumno;
    
    public String Alumno() {
        this.alumno= alumno;
        return JOptionPane.showInputDialog("Introducir alumno : ");
    }
     public float getNota1(){
    return Float.parseFloat(JOptionPane.showInputDialog("Introducir primera nota :"));
    }
    public float getNota2(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introducir segunda nota :"));
    }
    public float getNota3(){
    return Float.parseFloat(JOptionPane.showInputDialog("Introducir tercera nota :"));
    }
    public float calcularNotaMedia(float nota1,float nota2,float nota3){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        return ((nota1+nota2+nota3)/3);
    }
    public void NotaMedia (float calcularNotaMedia,String Alumno){
      JOptionPane.showMessageDialog(null, "La nota media de "+Alumno+" es "+calcularNotaMedia );
    }
}