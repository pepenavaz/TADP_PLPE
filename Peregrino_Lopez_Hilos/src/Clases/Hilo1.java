package Clases;
public class Hilo1 extends Thread{
    int val[], n;
    @Override
    public void run(){
        int aux=0;
        switch(n){
            case 1:
                for(int x=0; x<val.length; x++){
                    System.out.println("Hilo 1: "+aux+" + "+val[x]);
                    aux += val[x];
                    
                }
                break;
            case 2:
                for(int x=0; x<val.length; x++){
                    aux += val[x];
                }
        }
        
        System.out.println("Suma Hilo 1: \n"+aux);
    }
    public void numeros(int[] nums, int siNo){
        this.val = nums;
        this.n = siNo;
    }
}
