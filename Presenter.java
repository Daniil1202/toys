package toy;

import toy.view.View;

import java.util.Scanner;

public class Presenter {
    private Servise servise;
    private View view;

    public Presenter(View view){
        this.view = view;
        this.servise = new Servise();
    }
    public void addGood(Scanner scanner){
        servise.addGood(scanner);
    }
    public Toy getRandomGood(){
        return servise.getRandomGood();
    }

    public void writeFile() {
        servise.writeFile();
    }


}
