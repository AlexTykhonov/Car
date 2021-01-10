//Создать базовый класс Саг, характеризуемый торговой маркой (строка), весом,? мощностью.
// Определить методы переназначения и изменения мощности. Создать производный класс Lorry (грузовик),
// характеризуемый также грузоподъемностью кузова. Определить для него функции переназначения марки и изменения грузоподъемности.

public class Car {

    private String trade;
    private int weight;
    private int pwr;

    public Car(String trade, int weight, int pwr) {
        this.trade = trade;
        this.weight = weight;
        this.pwr = pwr;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPwr() {
        return pwr;
    }

    public void setPwr(int pwr) {
        this.pwr = pwr;
    }
}