/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

import java.util.Optional;

/**
 *
 * @author Estudiante
 */
class Nodo {
   private final int value;
    private Nodo left;
    private Nodo right;

    public Nodo(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new Nodo(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new Nodo(value);
            }
        }

    }

    public Optional<Nodo> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
   }
    
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if (right != null) {
            right.printInOrder();
        }
    }
 
    public void printPreOrder() {
        System.out.println(value);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }
 
    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(value);
    }
}
