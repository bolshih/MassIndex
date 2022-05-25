public class BmiService {

    public double calculate(double high, double weight) {
        double massIndex = weight / (high * high);
        return massIndex;
    }
}
