package controller;

public class ControllerThreadID implements Runnable {
    public ControllerThreadID(){
        super();
    }
    
     public void run (){
       int tid = threadId();
	System.out.println("Thread ID: " + tid);
	}
        
    private int threadId() {
        return (int) Thread.currentThread().threadId();
    }
}
    

    
