package calc;

public class CalculatorService {
  private Calculator calculator;
  
  public CalculatorService(Calculator calculator) {
      this.calculator =calculator;
  }
   public String addAndreport(int a, int b) {
       int result = calculator.add(a, b);
       return "Resuilt:" +result;
}
public String subtractAndReport(int a, int b) {
    int result = calculator.subtract(a, b);
    return "Result:" +result;
    
}
}

