package ads.poo;

public class Stack<E>{
    private E[] stack;
    private int size;
    private int top;

    public Stack(int sizeStack) {
        size = sizeStack;
        this.top = - 1;
        stack = (E[]) new Object[sizeStack];
    }

    public boolean stackUp(E element) throws Exception {
        if(isFull()){
            throw new Exception("A Pilha está cheia");
        }
        stack[++top] = element;
        return  true;
    }

    public E unstack() throws Exception {
        if(isEmpty()){
            throw new Exception("A Pilha está vázia");
        }
            E element = stack[top];
            stack[top--] = null;

            return element;
    }

    public E getElementTop() throws Exception {
        if(isEmpty()){
            throw new Exception("A Pilha Está vázia");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == - 1;
    }

    public boolean isFull(){
        return top == size - 1;
    }
}
