package toy;

import java.util.Iterator;
import java.util.List;

public class IteratorShop<E extends ShopItem> implements Iterator<E> {
    private int index;
    private List<E> rates;
    public IteratorShop(List<E> rates){
        this.rates = rates;
    }
    public boolean hasNext(){
        return rates.size()> index;

    }
    public E next() {
        return rates.get(index++);
    }

}
