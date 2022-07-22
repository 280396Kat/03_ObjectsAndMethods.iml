public class CompanyClient extends Client {

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0.0) {
            super.put(amountToPut);
        }
    }

    @Override
    public void take(double amountToTake) {
        double commissionToTake = 0.01;
        super.take(amountToTake + amountToTake * commissionToTake);

    }
}
