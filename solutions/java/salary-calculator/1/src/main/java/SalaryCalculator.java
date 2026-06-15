public class SalaryCalculator {

    double base = 1.0;
    double baseSalary = 1000;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? base -= 0.15 : base;
    }

    public int bonusMultiplier(int productsSold) {

        if (productsSold == 0) {
            return 0;
        }

        return productsSold >= 20 ? 13 : 10;

    }

    public double bonusForProductsSold(int productsSold) {

        if (productsSold == 0){
            return 0;
        }

        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double result = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return result <= 2000.0 ? result : 2000.0;


    } 
}
