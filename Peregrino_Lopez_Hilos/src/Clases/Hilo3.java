package Clases;
public class Hilo3 extends Thread{
    int val[], n;
    @Override
    public void run(){
        double aux=0;
        
        switch(n){
            case 1:
                for(int x=0; x<val.length; x++){
                    System.out.println("Hilo 3: "+aux+" + "+val[x]);
                    aux += val[x];
                    
                }
                break;
            case 2:
                for(int x=0; x<val.length; x++){
                    aux += val[x];
                }
        }
        
        System.out.println("Media Hilo 3: \n"+aux/val.length);
    }
    public void numeros(int[] nums, int siNo){
        this.val = nums;
        this.n = siNo;
    }
}
