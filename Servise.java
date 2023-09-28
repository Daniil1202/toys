package toy;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.Scanner;

public class Servise {
    private Shop<Toy> shop;
    private FileHandler<Toy> fileHandler;

    public Servise(){
        this.shop = new Shop<>():
        this.fileHandler = new FileHandler<>();

    }
    public Toy getRandomGood() {
        return shop.getRandomGood();
    }

    public void addGood(Scanner scanner) {
        System.out.println("Введите тип игрушки");
        String name = scanner.nextLine();
        System.out.println("Введите шанс выпада игрушки в формате XX.XX");
        String rate = scanner.nextLine();
        shop.addGoods(new Toy(name), Double.parseDouble(rate));
    }

    public void writeFile(){
        fileHandler.writeFile(shop.getOutGoods());
    }
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В магазине ");
        sb.append(shop.getIdGoods());
        sb.append(" товаров: \n");

        for (Toy good : shop) {
            sb.append(good);
            sb.append("\n");
        }
        return sb.toString();
    }
}
