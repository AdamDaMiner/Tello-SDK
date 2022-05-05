package tello.modes.mode;

import tellolib.command.TelloFlip;

public class FlyAndFlip extends AbstractMode {
    public FlyAndFlip(String name, String description) { 
        super(name, description);

    }
    public void run () { 
        stillRunning = true;
        tellocoms.setTimeout(50000);
        
        telloControl.connect();
        
        telloControl.enterCommandMode();

        telloControl.takeOff();
        
        telloControl.startStatusMonitor();

        telloControl.setSpeed(20);

        telloControl.up(25); // up 25 cm    

        telloControl.forward(40);
        if(telloControl.getBattery() > 60) {
            telloControl.doFlip(TelloFlip.backward);
        }
        else{

            telloControl.backward(25);

        if (telloControl.getBattery() > 60) {
            telloControl.doFlip(TelloFlip.backward);
        }
        else{
            
            telloControl.left(45);
            stopExecution();
        
        }
        }
        }
    @Override 
    public void execute() {
        run();
    }
    }

