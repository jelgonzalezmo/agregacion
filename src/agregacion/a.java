/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion;

/**
 *
 * @author Estudiante
 */
public class a {
    private int A1;
    private b  [] Bs;
    private int contador;
    
public a(){
Bs=new b[5];
this.contador=0;
}     
public a (b [] Bs){
if (Bs.length < 5){
this.Bs=Bs; 
    }    }   

public void adicionarb (b b1){
    if (this.contador <5){
 this.Bs[contador]=b1;    
}    
}
}
