import java.util.Scanner;

public class Main {
    /*Escribir un programa en Java que recorra un arreglo y genere un histograma en base a los números de este. El arreglo se llama myArray y contiene 10 elementos
     que corresponden a números enteros del 1 al 5. Un histograma representa que tanto un elemento aparece en un conjunto de datos (Debe mostrar la frecuencia para
     todos los números del 1 al 5, incluso si no están presentes en el arreglo). Por ejemplo, para el arreglo: myArray:=(1,2,1,3,3,1,2,1,5,1)
      el histograma se vería así:


      1: ***
      2: **
      3: **
      4:
      5: *
     */

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
       ingresoDeDatos();
    }


    public static void ingresoDeDatos(){
        int nums;
        int myArray[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("ingrese sus numeros, pueden repetirse, pero respete el rango de 1-5");
            nums=scan.nextInt();
            myArray[i]=nums;
        }
        histograma(myArray);
    }

    public static void histograma(int myArray[]) {
        int[] frecuencias = new int[5]; // Arreglo para almacenar las frecuencias
        for (int num : myArray) {
            frecuencias[num - 1]++; // Incrementa la frecuencia del número encontrado
        }

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}