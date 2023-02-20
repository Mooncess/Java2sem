package task6.fabricpattern.fabric;

import task6.fabricpattern.commands.Command;
import task6.fabricpattern.commands.WindowsCommand;

public class WindowsDialog extends Dialog{

    @Override
    public Command createCommand() {
        return new WindowsCommand();
    }
}
