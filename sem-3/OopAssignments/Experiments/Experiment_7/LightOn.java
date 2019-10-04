package exp7.ques1;

class LightOn implements Command {
    private Light light;

    LightOn(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}