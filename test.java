public class test {

  public static void main(String args[]) {
    Queue stack = new Queue(5);

    // Testing Stacks (Push & Pop)
    stack.push(8);
    stack.push(13);
    stack.push(21);
    stack.push(26);
    stack.pop();
    stack.print();

    // Overflowing the array

    stack.push(800);
    stack.push(1111);
    stack.push(1250);
    stack.push(1850);
    stack.push(2134);
    stack.push(2874);
    stack.print();

    // Testing queues (Enqueue & Dequeue)

    stack.enqueue(40);
    stack.enqueue(90);
    stack.enqueue(95);
    stack.dequeue();
    stack.print();
  }
}