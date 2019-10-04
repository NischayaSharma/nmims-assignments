package exp7.ques1;

class StereoOn implements Command {
    private Stereo stereo;

    StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }
}