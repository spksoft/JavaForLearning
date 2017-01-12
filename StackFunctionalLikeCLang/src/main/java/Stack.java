/**
 * Created by spksoft on 1/12/2017 AD.
 */
public class Stack {

    static int top;
    static int[] st;

    public static void main(String args[]) {
        int j;
        top = 0;
        st = new int[10];
        for(j=0;j<=10;j++) {
            push(j+1);

        }
        for(j=0;j<=10;j++) {
            System.out.println(pop());

        }
    }

    static void push(int x) {
        if(top >= st.length)
            System.out.println("Stack is full ");
        else
            st[top++] = x;
    }

    static int pop() {
        if(top > 0)
            return st[--top];
        System.out.println("Stack underflow!");
        return 0;
    }

}
