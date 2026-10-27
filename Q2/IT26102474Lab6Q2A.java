
public class IT26102474Lab6Q2A {
    static void display(int n) {
        if (n <= 10) {
            System.out.print(n + " ");
            display(n + 1);
        }
    }

    public static void main(String[] args) {
        display(1);
    }
}
