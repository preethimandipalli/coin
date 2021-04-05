package utility;

public class Coin {
    double totalPossibleOutcomes;
    int coinsCount;

    public Coin(int coinsCount) {
        this.coinsCount=coinsCount;
    }

    public boolean checkEqualityOfProbability() {
        totalPossibleOutcomes= Math.pow(2,coinsCount);
        double headProbability = (1/totalPossibleOutcomes);
        double tailProbability= 1/(totalPossibleOutcomes);
        return headProbability==tailProbability;

    }

}
