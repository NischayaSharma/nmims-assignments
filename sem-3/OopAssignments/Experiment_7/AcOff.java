package exp7.ques1;

class AcOff implements Command {
    private Ac ac;

    AcOff(Ac ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.off();
    }
}
