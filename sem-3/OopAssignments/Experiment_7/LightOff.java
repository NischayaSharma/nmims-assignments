package exp7.ques1;

class LightOff implements Command {
    private Light light;

    LightOff(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
