package task6.fabricpattern.fabric;

import task6.fabricpattern.commands.Command;
import task6.fabricpattern.commands.LinuxCommand;

public class LinuxDialog extends Dialog{

    @Override
    public Command createCommand() {
        return new LinuxCommand();
    }
}
