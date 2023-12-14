package programapila;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramaPila {
    public static Scanner en=new Scanner(System.in);
    public static LinkedList<Integer> list=new LinkedList<Integer>();
    
    
    public static void apilar(){
        int dato;
        System.out.println("Ingresa el dato a apilar: ");
        dato = en.nextInt();
        list.push(dato);
    }
    
    public static void vacio(){
        if(list.isEmpty()){
            System.out.println("La lista esta vacía");
        }
        else{
            System.out.println("La lista tiene " + list.size() + " valores");
        }
    }
    
    public static void agregarCola(){
        int dato;
        System.out.println("Ingresa el dato a agregar a la cola: ");
        dato = en.nextInt();
        list.add(dato);
    }

    public static void main(String[] args) {
        int pilaCola;
        int opcion;
        
        System.out.println("Selecciona el programa que deseas correr");
        System.out.println("1. Pilas");
        System.out.println("2. Colas");
        System.out.println("Ingresa cualquier otra opción para salir");
        pilaCola = en.nextInt();
        System.out.println();
        
        switch(pilaCola){
            case 1: 
            {do{
                    System.out.println("Ingresa la opción que se desea ejecutar en una pila");
                    System.out.println("1. Apilar dato");
                    System.out.println("2. Desapilar dato");
                    System.out.println("3. Mostrar pila");
                    System.out.println("4. Mostrar primer dato en la pila");
                    System.out.println("5. Verificar Pila");
                    System.out.println("6. Salir del sistema");
                    opcion = en.nextInt();

                    switch(opcion){
                        case 1:
                            apilar();
                            break;
                        case 2:
                            list.pop();
                            break;
                        case 3:
                            System.out.println("----- Pila -----");
                            vacio();
                            System.out.println(list);
                            System.out.println("----------------");
                            break;
                        case 4:
                            System.out.println(list.getFirst());
                            break;
                        case 5:
                            vacio();
                            break;
                        case 6:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no valida");
                            break;
                    }
                }
                while(opcion != 6);}
                break;
                
            case 2:
            {
                do{
                    System.out.println("Ingresa la opción que se desea ejecutar en la cola");
                    System.out.println("1. Agregar dato a la cola");
                    System.out.println("2. Liberar dato de la cola");
                    System.out.println("3. Mostrar cola");
                    System.out.println("4. Mostrar primer dato en la cola");
                    System.out.println("5. Verificar cola");
                    System.out.println("6. Salir del sistema");
                    opcion = en.nextInt();

                    switch(opcion){
                        case 1:
                            agregarCola();
                            break;
                        case 2:
                            list.pop();
                            break;
                        case 3:
                            System.out.println("----- Cola -----");
                            vacio();
                            System.out.println(list);
                            System.out.println("----------------");
                            break;
                        case 4:
                            System.out.println(list.getFirst());
                            break;
                        case 5:
                            vacio();
                            break;
                        case 6:
                            System.out.println("Saliendo...");
                            break;  
                        default:
                            System.out.println("Opción no valida");
                            break;
                    }
                }
                while(opcion != 6);
            }
                break;
                
            default:
                System.out.println("Saliendo...");
                break;
        }
    }
    
}
