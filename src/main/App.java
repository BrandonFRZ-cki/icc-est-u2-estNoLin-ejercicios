package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;
import utils.StudentValidator;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("\n--EJERCICIO 1--");
        InsertBST insercion = new InsertBST();
        Node nodoRaiz = null;

        nodoRaiz = insercion.insert(nodoRaiz, 5);
        insercion.insert(nodoRaiz, 3);
        insercion.insert(nodoRaiz, 7);
        insercion.insert(nodoRaiz, 2);
        insercion.insert(nodoRaiz, 4);
        insercion.insert(nodoRaiz, 6);
        insercion.insert(nodoRaiz, 8);

        System.out.println("Raíz: " + nodoRaiz.getValue());
        System.out.println("Izquierdo: " + nodoRaiz.getLeft().getValue());
        System.out.println("Derecho: " + nodoRaiz.getRight().getValue());
        System.out.println("Izquierdo del izquierdo: " + nodoRaiz.getLeft().getLeft().getValue());
        System.out.println("Derecho del izquierdo: " + nodoRaiz.getLeft().getRight().getValue());
        System.out.println("Izquierdo del derecho: " + nodoRaiz.getRight().getLeft().getValue());
        System.out.println("Derecho del derecho: " + nodoRaiz.getRight().getRight().getValue());

        System.out.println("\n--EJERCICIO 2--");
        Node arbolInvertido = null;

        arbolInvertido = insercion.insert(arbolInvertido, 4);
        insercion.insert(arbolInvertido, 2);
        insercion.insert(arbolInvertido, 7);
        insercion.insert(arbolInvertido, 1);
        insercion.insert(arbolInvertido, 3);
        insercion.insert(arbolInvertido, 6);
        insercion.insert(arbolInvertido, 9);

        InvertBinaryTree inversor = new InvertBinaryTree();
        inversor.invertTree(arbolInvertido);

        System.out.println("Raíz invertida: " + arbolInvertido.getValue());
        System.out.println("Izquierdo: " + arbolInvertido.getLeft().getValue());
        System.out.println("Derecho: " + arbolInvertido.getRight().getValue());
        System.out.println("Izquierdo del izquierdo: " + arbolInvertido.getLeft().getLeft().getValue());
        System.out.println("Derecho del izquierdo: " + arbolInvertido.getLeft().getRight().getValue());
        System.out.println("Izquierdo del derecho: " + arbolInvertido.getRight().getLeft().getValue());
        System.out.println("Derecho del derecho: " + arbolInvertido.getRight().getRight().getValue());

        System.out.println("\n--EJERCICIO 3--");
        ArbolBinario otroArbol = new ArbolBinario();
        otroArbol.insert(4);
        otroArbol.insert(2);
        otroArbol.insert(7);
        otroArbol.insert(1);
        otroArbol.insert(3);
        otroArbol.insert(6);
        otroArbol.insert(9);

        ListLevels recorrido = new ListLevels();
        List<List<Node>> niveles = recorrido.listLevels(otroArbol.getRoot());

        int nivelActual = 0;
        for (List<Node> nivel : niveles) {
            System.out.print("Nivel " + nivelActual++ + ": ");
            for (Node nodo : nivel) {
                System.out.print(nodo.getValue() + " - ");
            }
            System.out.println();
        }

        System.out.println("\n--EJERCICIO 4--");
        Depth calcularProfundidad = new Depth();
        int profundidadMaxima = calcularProfundidad.maxDepth(otroArbol.getRoot());
        System.out.println("Profundidad máxima: " + profundidadMaxima + " (del mismo árbol del ejercicio 3)");
    }
}


