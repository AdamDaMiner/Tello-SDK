package tello.modes.mode;
import tellolib.command.TelloFlip;
public class MoveLeftAndFlip extends AbstractMode {
    public MoveLeftAndFlip(String name, String Description) {
        super(name, Description);
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
        telloControl.left(150);

        telloControl.doFlip(TelloFlip.left);
        //
        stopExecution();
    }
    @Override
    public void execute() {
        run();
    }
}
