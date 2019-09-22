package exp7.ques1;

public class Main {
    public static void main(String args[]) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        Ac ac = new Ac();
        remote.setCommand(new LightOn(light));
        remote.pressButton();
        remote.setCommand(new LightOff(light));
        remote.pressButton();
        remote.setCommand(new StereoOn(stereo));
        remote.pressButton();
        remote.setCommand(new StereoOff(stereo));
        remote.pressButton();
        remote.setCommand(new AcOn(ac));
        remote.pressButton();
        remote.setCommand(new AcOff(ac));
        remote.pressButton();
    }
}