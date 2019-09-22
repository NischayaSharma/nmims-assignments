package exp7.ques1;

class AcOn implements Command {
    private Ac ac;

    AcOn(Ac ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }
}
