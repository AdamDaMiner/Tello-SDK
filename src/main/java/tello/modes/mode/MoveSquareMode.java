package tello.modes.mode;

public class MoveSquareMode extends AbstractMode {
    public MoveSquareMode(String name, String Description) {
        super(name, Description);
        //TODO Auto-generated constructor stub
    }
    public void run() { 
        stillRunning= true; 

        // Everything else here
        tellocoms.setTimeout(50000);
        telloControl.connect();

        telloControl.enterCommandMode();

        telloControl.takeOff();

        telloControl.startStatusMonitor();
        telloControl.setSpeed(20);
        telloControl.up(40);
        for(int i=0; i<4; i++) {
            telloControl.forward(40);
            System.out.println(telloControl.getBattery());
            telloControl.right(40);
            System.out.println(telloControl.getBattery());
            telloControl.backward(40);
            System.out.println(telloControl.getBattery());
            telloControl.left(40);
            System.out.println(telloControl.getBattery());
            i++;
        }
        stopExecution();
        }
    @Override
    public void execute() {
        run();
    }
}
