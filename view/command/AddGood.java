package toy.view.command;

import toy.view.ConsoleUi;

public class AddGood extends Commad{
    public AddGood(ConsoleUi consoleUi){
        super("Добавить товар в магазин", consoleUi);
    }
    public void execute(){
        super.getConsoleUi().addGood();
    }
}
