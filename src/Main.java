public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double high = 1.70; //рост в метрах
        double weight = 77; //веc в килограммах
        
        double massIndex = service.calculate(high, weight);
        System.out.println("Индекс массы тела = " + massIndex);
    }
}
