package toy;

import toy.view.ConsoleUi;
import toy.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUi();
        view.start();
    }
}
