/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author ferpe
 */
public class Nodoarbol {
      private int valor; 
    private Nodoarbol nodoizq;
    private Nodoarbol nododer;
  public Nodoarbol(int valor){
        this.valor= valor; 
        this.nodoizq=null;
        this.nododer=null;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodoarbol getNodoizq() {
        return nodoizq;
    }



    public Nodoarbol getNododer() {
        return nododer;
    }

  public void inserta(int _valor){
      //insertar lado izquierdo
      if(_valor<this.valor){
          if(this.nodoizq==null){
              this.nodoizq= new Nodoarbol(_valor);
          }else{
              this.nodoizq.inserta(_valor);
          }
      }else{
                  if(this.nododer==null){
                    this.nododer= new Nodoarbol(_valor);
                          }else{
                            this.nododer.inserta(_valor);
                    }
                }
  }
    

}
