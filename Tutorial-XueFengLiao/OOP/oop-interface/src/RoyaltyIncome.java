
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {
    public double income;
	// TODO
    public RoyaltyIncome(double income){ this.income=income;}

    @Override
    public double getTax() {
        return this.income *0.2;
    }
}
