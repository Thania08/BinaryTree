/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;

/**
 *
 * @author Estudiante
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Nodo root = new Nodo(18);
        root.add(5);
        root.add(7);
        root.add(50);
        root.add(100);
        root.add(0);
        root.add(4);
        root.add(3);
        root.add(15);
        root.add(8);
        

        System.out.println("Impresion PREORDER");
        root.printPreOrder();
        System.out.println("Impresion INORDEN");
        root.printInOrder();
        System.out.println("Impresion POSORDER");
        root.printPosOrder();
        
    }
       
    }
    
