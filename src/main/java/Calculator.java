public class Calculator {
    public int add(int a, int b){
       return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0){
            throw new NullPointerException();
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(String method, int a, int b){
        return add(div(30, 10), times(5, dif(10, 2)));
    }
}
