package task6.fabricpattern.commands;

public class WindowsCommand implements Command{
    @Override
    public void print() {
        System.out.println("<Install package from GUI>");
    }

    @Override
    public void execute() {
        System.out.println("self install package....");
    }
}
