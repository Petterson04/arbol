
package arbol;


public class Arbol {
    Nodoarbol inicial;
    public Arbol(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if(this.inicial==null){
            this.inicial=new Nodoarbol(valor);
        }else{
            this.inicial.inserta(valor);
        }
    }
    public void imprimirpreorder(){
    this.preorder(this.inicial);
    }
    public void  preorder(Nodoarbol nodo){
        if(nodo==null){
        return;
        }else{
            System.out.print(nodo.getValor()+",");
            preorder(nodo.getNodoizq());
            preorder(nodo.getNododer());
            
        }
    }
    public void imprimirinorden(){
    this.inorden(this.inicial);
    }
    public void inorden(Nodoarbol nodo){
        if(nodo==null){
        return;
        }else{
         
            inorden(nodo.getNodoizq());
            System.out.print(nodo.getValor()+",");
            inorden(nodo.getNododer());
            
        }
    }
     public void imprimirpostorder(){
    this.postorder(this.inicial);
    }
    public void postorder(Nodoarbol nodo){
        if(nodo==null){
        return;
        }else{
         
            postorder(nodo.getNodoizq());
            postorder(nodo.getNododer());
              System.out.print(nodo.getValor()+",");
            
        }
    }
}











