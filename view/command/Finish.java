package toy.view.command;

import toy.view.ConsoleUi;

public class Finish extends Command {
    public Finish(ConsoleUi consoleUi) {
        super("Завершить работу", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().finish();
    }
}
