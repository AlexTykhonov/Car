//Создать базовый класс Саг, характеризуемый торговой маркой (строка), весом,? мощностью.
// Определить методы переназначения и изменения мощности. Создать производный класс Lorry (грузовик),
// характеризуемый также грузоподъемностью кузова. Определить для него функции переназначения марки и изменения грузоподъемности.

public class Lorry extends Car {

    private int load;
    String trade = getTrade();

    public Lorry(String trade, int weight, int pwr, int load) {
        super(trade, weight, pwr);
    }

    public Lorry(String trade, int weight, int pwr, int load, String trade1) {
        super(trade, weight, pwr);
        this.load = load;
        this.trade = trade1;
    }

    public int getLoad() {
        return load;
    }

    public String newTrade (String newMark) {
        trade = newMark;
        return trade;
    }

    public int newWeight (int newW) {
        load = newW;
        return load;
    }
}
