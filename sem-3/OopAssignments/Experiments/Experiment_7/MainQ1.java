package exp7.ques1;

interface Command {
    public void execute();
}

class Stereo {
    public void on() {
        System.out.println("The Stereo is on");
    }

    public void off() {
        System.out.println("The Stereo is off");
    }
}

class StereoOn implements Command {
    private Stereo stereo;

    StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }
}

class StereoOff implements Command {
    private Stereo stereo;

    StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}

class Ac {
    public void on() {
        System.out.println("The Ac is on");
    }

    public void off() {
        System.out.println("The Ac is off");
    }
}

class AcOff implements Command {
    private Ac ac;

    AcOff(Ac ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.off();
    }
}

class AcOn implements Command {
    private Ac ac;

    AcOn(Ac ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }
}

class Light {
    public void on() {
        System.out.println("The Light is on");
    }

    public void off() {
        System.out.println("The Light is off");
    }
}

class LightOff implements Command {
    private Light light;

    LightOff(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}

class LightOn implements Command {
    private Light light;

    LightOn(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class MainQ1 {
    public static void main(String args[]) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        Ac ac = new Ac();
        remote.setCommand(new AcOn(ac));
        remote.pressButton();
        remote.setCommand(new AcOff(ac));
        remote.pressButton();
        remote.setCommand(new StereoOn(stereo));
        remote.pressButton();
        remote.setCommand(new StereoOff(stereo));
        remote.pressButton();
        remote.setCommand(new LightOn(light));
        remote.pressButton();
        remote.setCommand(new LightOff(light));
        remote.pressButton();
    }
}