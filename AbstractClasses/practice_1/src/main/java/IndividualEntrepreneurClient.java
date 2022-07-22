public class IndividualEntrepreneurClient extends Client {

    public double commissionToTake;
    @Override
    public void put(double amountToPut) {
        if (amountToPut < 1000) {
            commissionToTake = amountToPut * 0.01;
        }
      else if (amountToPut >= 1000) {
            commissionToTake = amountToPut * 0.005;
        }
        super.put(amountToPut - commissionToTake);

    }

    public void take(double amountToTake) {
            super.take(amountToTake);
        }
}
