package toy;

import java.io.Serializable;

public class FrequencyRate<E> implements Serializable {
    private E toy;
    private int frequency;

    public FrequencyRate(E toy,  int frequency){
        this.toy = toy;
        this.frequency = frequency;

    }
    public E getGood(){
        return toy;
    }
    public int changeFrequencyRate(int num){
        frequency = num;
        return frequency;
    }
    public int getFrequencyRate(){
        return frequency;
    }
}
