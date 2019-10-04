package exp7.ques1;

class StereoOff implements Command {
    private Stereo stereo;

    StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
