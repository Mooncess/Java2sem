package task6.fabricpattern.fabric;

import task6.fabricpattern.commands.Command;

public abstract class Dialog {

    public void showInfo(){
        Command userCommand = createCommand();
        userCommand.print();
        userCommand.execute();
    }


    public abstract Command createCommand();
}
