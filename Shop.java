package toy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Shop<E extends ShopItem> implements Iterable<E>, Serializable {
    private List<FrequencyRate<E> frequencyRates;
    private List<E> goods ;

    private List<E> outGoods;
    private Random random;

    public Shop(){
        this.goods = new ArrayList<>();
        this.outGoods = new ArrayList<>();
        this.frequencyRates = new ArrayList<>();
        this.random = new Random();
    }
    private long idGoods;

    public long getIdGoods(){
        return idGoods;
    }
    public void addGoods (E good, int num) {
        frequencyRates.add(new FrequencyRate<>(good,num));
        goods.add(good);
        good.setId(idGoods++);

    }
    public void d delGoodById(long id){
        FrequencyRate<E> foundFrequencyRate = null;
        for (FrequencyRate<E> frequencyRate: frequencyRates) {
            if (getGoodById(id).getId() ==id){
                foundFrequencyRate = frequencyRate;
                break;
            }

        }
        if (foundFrequencyRate != null){
            frequencyRates.remove(foundFrequencyRate);
            goods.remove(foundFrequencyRate.getGood());
        }

    }
    public  void  setOutGoods(E good){
        this.outGoods.add(good);
    }

    public List<E> getOutGoods(){
        return outGoods;
    }
    public  E getRandomGood(){
        double randomNumber = random.nextDouble() * 100.0;
        double cumulativeAge = 0.0;
        for(FrequencyRate<E> frequencyRate : frequencyRates){
            cumulativeAge +=frequencyRate.getFrequencyRate();
            if(randomNumber<=cumulativeAge) {
                setOutGoods(frequencyRate.getGood());
                return frequencyRate.getGood();
            }
        }
        return null;
    }

    public void  changeFrequencyRate(long id,double newRate){
        for(FrequencyRate<E> frequencyRate: frequencyRates){
            if(getGoodById(id).getId() == id){
                frequencyRate.changeFrequencyRate(newRate);
                break;
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В магазине ");
        sb.append(goods.size());
        sb.append(" шт.: \n");
        for (FrequencyRate frequencyRate : frequencyRates) {
            sb.append(frequencyRate.getGood().toString());
            sb.append(" шанс выпадения одинаковый ");
            sb.append(frequencyRate.getFrequencyRate());
            sb.append("%\n");
        }
        return sb.toString();

    }
}
