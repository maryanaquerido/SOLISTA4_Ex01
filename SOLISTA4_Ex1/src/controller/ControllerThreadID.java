package controller;

public class ControllerThreadID implements Runnable {
    public ControllerThreadID(){
        super();
    }
    
     public void run (){
        int tid = getID();
	System.out.println("Thread ID: " + tid);
	}
        
    private int getID() {
        return (int) Thread.currentThread().getId();
    }
}
    
