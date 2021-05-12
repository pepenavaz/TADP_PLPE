package Clases;
import java.util.Scanner;
//Peregrino López Pedro Emmanuel N.C.: 19290940
public class Main {
        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Hilo1 suma = new Hilo1();
        Hilo2 sumaCu = new Hilo2(); //Suma de cuadrados
        Hilo3 media = new Hilo3();
        System.out.println("Valores del Vector:");
        int nums[] = new int[10]; // Puede cambiar el tamaño si así lo desea
        for(int x=0; x<nums.length; x++){
            nums[x] = (int) (Math.random()*10)+1;
            System.out.println(nums[x]);
        }
        System.out.println("");
        
        
        
        int op= 0;
        do{
            try{
                System.out.println("Puedes cambiar el tamaño del vector a tu gusto \nen el codigo ya que aun no es un ejecutable xd\n");
                System.out.println("Desea ver como reaccionan los hilos?");
                System.out.println("[1]Si\n[2]No");
                op = leer.nextInt();
            }catch(Exception e){
                op=0;
                leer.nextLine();
            }
            switch(op){
                case 1:
                    suma.numeros(nums, op);
                    sumaCu.numeros(nums, op);
                    media.numeros(nums, op);
                    break;
                case 2:
                    suma.numeros(nums, op);
                    sumaCu.numeros(nums, op);
                    media.numeros(nums, op);
                    break;
                default:
                    System.out.println("Ingrese un valor coreecto");
            }
        }while(op < 1 || op > 2);
        
        suma.start();
        sumaCu.start();
        media.start();
    }
}
