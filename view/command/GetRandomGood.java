package toy.view.command;

import toy.view.ConsoleUi;

public class GetRandomGood {
    public GetRandomGood(ConsoleUi consoleUi){
        super("Попробуйте выиграть игрушку", consoleUi);
    }
    public void execute(){
        super.getConsoleUi().getRandomGood();
    }
}
