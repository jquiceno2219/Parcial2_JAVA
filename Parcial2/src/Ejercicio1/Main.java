package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        for (Transporte transporte : Transporte.values()) {
            System.out.println("\nTransporte: " + transporte);
            System.out.println("Descripción: " + transporte.mostrarDescripcion());
        }
    }
}

//Cada elemento de la enumeración deberá tener un método que muestre la descripción general del medio de
//trasnsporte mostrarDescripcion().
//4. Hacer su clase principal, usando cada uno de los elementos de la enumeración.