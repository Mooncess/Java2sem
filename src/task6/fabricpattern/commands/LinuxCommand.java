package task6.fabricpattern.commands;

public class LinuxCommand implements Command{

    @Override
    public void print() {
        System.out.println("sudo apt get htop");
    }

    @Override
    public void execute() {
        System.out.println("installing package....");
    }
}
