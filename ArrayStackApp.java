package PR2;

class ArrayStackApp {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        
        stack.push("Decade");
        stack.push("Zi-o");
        stack.push("Legend");

        printStack(stack);

        ArrayStack copyStack = new ArrayStack(5);
        copyStack(stack, copyStack);

        System.out.println("\nCopied stack:");
        printStack(copyStack);
    }

    public static void copyStack(ArrayStack src, ArrayStack des) {
        while (!src.isEmpty()) {
            String item = src.pop();
            des.push(item);
        }
    }

    public static void printStack(ArrayStack s) {
        System.out.print("Stack contents: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
}