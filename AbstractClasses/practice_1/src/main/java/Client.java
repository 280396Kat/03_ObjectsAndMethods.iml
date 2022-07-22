public abstract class Client {

    public double amountMoney;

    public double getAmount() {
        //TODO: реализуйте метод и удалите todo
        return amountMoney;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amountMoney += amountToPut;

            //TODO: реализуйте метод и удалите todo
        }
    }


    public void take(double amountToTake) {
        if (amountMoney > amountToTake) {
            amountMoney -= amountToTake;

            //TODO: реализуйте метод и удалите todo
        }
    }
}


