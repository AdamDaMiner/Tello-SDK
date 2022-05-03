package tello.modes.mode;

public class HoverLeftMode extends AbstractMode {
        
    public HoverLeftMode(String name, String description) {
            super(name, description);
            //TODO Auto-generated constructor stub
        }
    public void run() { 
        stillRunning = true; 

        // Everything else here
        tellocoms.setTimeout(50000);
        telloControl.connect();

        telloControl.enterCommandMode();

        telloControl.takeOff(); 

        telloControl.startStatusMonitor();
        telloControl.setSpeed(10); 
        telloControl.up(50); 
        telloControl.left(100);
        // 
        stopExecution();
    }
    @Override
    public void execute() { 
        run();
    }
}
