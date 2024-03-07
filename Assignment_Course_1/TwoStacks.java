package Assignment_Course_1;

public class TwoStacks {
    private int[] array;
    private int size;
    private int top1, top2;
    private int capacity;

    public TwoStacks(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
        top1 = -1;
        top2 = capacity;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            array[top1] = x;
            size++;
        } else {
            System.out.println("Stack Overflow - Stack 1 is full");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            array[top2] = x;
            size++;
        } else {
            System.out.println("Stack Overflow - Stack 2 is full");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = array[top1];
            top1--;
            size--;
            return x;
        } else {
            System.out.println("Stack Underflow - Stack 1 is empty");
            return Integer.MIN_VALUE;
        }
    }

    public int pop2() {
        if (top2 < capacity) {
            int x = array[top2];
            top2++;
            size--;
            return x;
        } else {
            System.out.println("Stack Underflow - Stack 2 is empty");
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from stack1 is " + ts.pop1());
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }
}

