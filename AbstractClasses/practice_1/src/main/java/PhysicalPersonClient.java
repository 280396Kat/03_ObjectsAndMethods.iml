public class PhysicalPersonClient extends Client {



    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0.0) {
            super.put(amountToPut);
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake < amountMoney) {
            super.take(amountToTake);
        }
    }
}
