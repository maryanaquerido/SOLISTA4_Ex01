package view;
import controller.ControllerThreadID;
public class PrincipalThreadID {
    public static void main (String[]args){
        
        for (int i = 0; i<5; i++){
			ControllerThreadID threadIdRunnable = new ControllerThreadID();
                        Thread t = new Thread(threadIdRunnable);
                        t.start(); 
                }
        }
}
   
   
