package Clases;
public class Hilo2 extends Thread{
    int val[], n;
    @Override
    public void run(){
        int aux=0;
        switch(n){
            case 1:
                for(int x=0; x<val.length; x++){
                    System.out.println("Hilo 2: "+aux+" + "+Math.pow(val[x], 2));
                    aux += Math.pow(val[x], 2);
                    
                }
                break;
            case 2:
                for(int x=0; x<val.length; x++){
                    aux += Math.pow(val[x], 2);
                }
        }
        
        System.out.println("Suma Cuadrados Hilo 2: \n"+aux);
    }
    public void numeros(int[] nums,int siNo){
        this.val = nums;
        this.n = siNo;
    }
}
