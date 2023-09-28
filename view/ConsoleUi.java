package toy.view;

import com.sun.tools.javac.Main;
import toy.Presenter;

import java.util.Scanner;

public class ConsoleUi implements View{
    private Presenter presenter;
    private Scanner scanner;
    private MainMenu menu;
    private boolean work;

    public ConsoleUi(){
        this.menu = new MainMenu(this);
        this.presenter = new Presenter(this);
        this.scanner = new Scanner(System.in);
        this.work = true;
    }
    public void start() {
        System.out.println("Удача лежит за сильнейшими");
        while (work) {
            System.out.println(menu.menu());
            String choice = scanner.nextLine();
            try {
                int choiceInt = Integer.parseInt(choice);
                menu.execute(choiceInt);
            } catch (NumberFormatException ex) {
                System.out.println("Введите целое число");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Введите число от 1 до 4");
            }
        }
    }
    public void finish(){
        scanner.close();
        work = false;
    }
    public void writeFile(){
        presenter.writeFile();
    }
    public void addGood() {
        presenter.addGood(scanner);
    }

    public void getRandomGood(){
        String result = presenter.getRandomGood().toString();
        printAnswer("Вы выиграли: " + result);
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
