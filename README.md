# 🌳 Práctica de Árboles Binarios en Java

## 📚 Información del Proyecto

- **Proyecto:** Manipulación de Árboles Binarios
- **Materia:** Estructura de Datos
- **Estudiante:** Brandon Rivera
- **Carrera:** Computación
- **Docente:** Ing. Pablo Torres
- **Fecha:** 6 de julio de 2025

---

## ⚙️ Descripción General

Este proyecto abarca cuatro ejercicios esenciales que ponen en práctica el uso de árboles binarios de búsqueda. Cada uno explora un aspecto fundamental:

- Inserción de nodos
- Inversión estructural de un árbol
- Recorrido por niveles
- Cálculo de profundidad máxima

---

## 🧠 Ejercicios Desarrollados

### 🔹 Ejercicio 1: Inserción de Nodos

Se implementa un método recursivo que inserta nodos de tipo `int` de manera ordenada dentro de un árbol binario.

Método principal:
```java
public Node insert(Node node, int value) {  
    if (node == null) {  
        return new Node(value);  
    }  
    if (value < node.getValue()) {  
        node.setLeft(insert(node.getLeft(), value));  
    } else if (value > node.getValue()) {  
        node.setRight(insert(node.getRight(), value));  
    }  
    return node;  
}
```
---

### 🔹 Ejercicio 2: Inversión del Árbol

Este método invierte todos los nodos de un árbol binario, intercambiando el hijo izquierdo con el derecho de cada nodo:
```java
public Node invertTree(Node root){  
    if (root == null) return null;  
    Node temp = root.getLeft();  
    root.setLeft(invertTree(root.getRight()));  
    root.setRight(invertTree(temp));  
    return root;  
}
````


---

### 🔹 Ejercicio 3: Listado de Niveles

Se recorre el árbol por niveles (estrategia Breadth-First Search) utilizando una cola para procesar los nodos:
```java
public List<List<Node>> listLevels(Node root){  
    List<List<Node>> result = new ArrayList<>();  
    LinkedList<Node> queue = new LinkedList<>();  
    queue.add(root);  
    while (!queue.isEmpty()) {  
        List<Node> currentLevel = new ArrayList<>();  
        int size = queue.size();  
        for (int i = 0; i < size; i++) {  
            Node current = queue.poll();  
            currentLevel.add(current);  
            if (current.getLeft() != null) queue.add(current.getLeft());  
            if (current.getRight() != null) queue.add(current.getRight());  
        }  
        result.add(currentLevel);  
    }  
    return result;  
}
```
---

### 🔹 Ejercicio 4: Profundidad Máxima

Calcula la profundidad del árbol a través de un enfoque recursivo:
```java
public int maxDepth(Node root){  
    if (root == null) return 0;  
    return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));  
}
```
---

## 🧪 Ejemplo de Salida en Consola
```plaintext
--EJERCICIO 1--
Raíz: 5
Izquierdo: 3
Derecho: 7
Izquierdo del izquierdo: 2
Derecho del izquierdo: 4
Izquierdo del derecho: 6
Derecho del derecho: 8

--EJERCICIO 2--
Raíz invertida: 4
Izquierdo: 7
Derecho: 2
Izquierdo del izquierdo: 9
Derecho del izquierdo: 6
Izquierdo del derecho: 3
Derecho del derecho: 1

--EJERCICIO 3--
Nivel 0: 4 -
Nivel 1: 2 - 7 -
Nivel 2: 1 - 3 - 6 - 9 -

--EJERCICIO 4--
Profundidad máxima: 3 (del mismo árbol del ejercicio 3)
````

## 🚀 Ejecución

Para ejecutar el proyecto:

1. **Compila el código:**
   ```bash
   javac App.java

## 🚀 Ejecución

Para ejecutar el proyecto:

2. **Ejecuta la aplicación:**
   ```bash
   java App
