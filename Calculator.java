public class Calculator {
    public int cong(int a, int b) {
        return a + b;
    
    }
     public int tru(int a, int b) {
        return a - b;
    }  public int nhan(int a, int b) {
        return a * b;
    }
    public double chia(int a, int b) {
        if (b == 0) throw new ArithmeticException("Không thể chia cho 0");
        return (double) a / b;
    }
    }
