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
public class a1 {
    private int A1;
    private b  [] Bs;
    private int contador;
    
public a1(){
this.contador=0;
}     
public void a2 (){
this.Bs=new b[5];
this.Bs[0]=new b(5);
this.Bs[1]=new b(5);
this.Bs[2]=new b(5);
this.Bs[3]=new b(5);
this.Bs[4]=new b(5);
contador=5;
}   

public void adicionarb (int b1){
    if (this.contador <5){
 this.Bs[contador]=new b(b1); 
 contador++;
}    
}
}
