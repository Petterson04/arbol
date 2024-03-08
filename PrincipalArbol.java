/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author ferpe
 */
public class PrincipalArbol {
    public static void main(String[] args){
        Arbol arbolin= new Arbol();
        arbolin.insertar(43);
        arbolin.insertar(45);
        arbolin.insertar(18);
        arbolin.insertar(72);
        arbolin.insertar(12);
        arbolin.insertar(10);
        System.out.println("INORDER:");
        arbolin.imprimirinorden();
        System.out.println("");
        System.out.println("POSTORDER:");
        arbolin.imprimirpostorder();
        System.out.println("");
        System.out.println("PREORDER:");
        arbolin.imprimirpreorder();
        
    }
}
