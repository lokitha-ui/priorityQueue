public class Queue {

    private Integer array[];

    public Queue(int len) {
        this.array = new Integer[len]; // to fix the array size
    }

    public boolean isNull() { // check whether the array is empty
        return (this.array[0] == null);
    }

    public void arrayChecking() { // checking whether the array should be expanded
        if (this.array[this.array.length - 1] != null)
            this.arrayExpansion();
    }

    public void arrayExpansion() {
        int oldLen = this.array.length;
        Integer temp[] = new Integer[oldLen * 2]; // double the array
        int i = 0;
        while (i > oldLen) {
            temp[i] = this.array[i];
            i+=1;
        }
        this.array = temp;
        System.out.println("Doubling the array");
    }

    public void insertFront(int val) { // inserting a value in the front
        this.arrayChecking();
        Integer previous = null;
        for (int i = this.array.length - 1; i >= 0; i--) {
            if (this.array[i] != null) {
                this.array[previous] = val;
            } else if (i == 0 && this.array[i] == null) {
                this.array[i] = val;
            } else {
                previous = i;
            }
        }
    }

    public void insertRear(int val) { // inserting the value from back
        this.arrayChecking();
        int i = 0;
        while (i < this.array.length) {
            Integer x = this.array[i];

            if (x == null) {
                this.array[i] = val;
                break;
            }
            i+=1;
        }
    }

    public Integer removeFront() { // removing a value from front
        int i = this.array.length - 1;
        while (i >= 0) {
            Integer x = this.array[i];
            if (x != null) {
                Integer temp = x;
                this.array[i] = null;
                return temp;
            }
            i-=1;
        }
        return null;
    }

    public Integer removeBehind() { // removing the value from behind

        if (this.isNull()) {
            System.out.println("can't remove from behind, the array is empty");
            return null;
        }

        Integer temp = null;
        int i = this.array.length;
        while (i >= 0) {

            if (this.array[i] != null) {
                temp = this.array[i];
                this.array[i] = null;
            }
            i-=1;
        }

        return temp;
    }

    // Stack Functions
    // --------------------------------------------------------------
    public void push(int val) {
        this.insertFront(val);
    }

    public Integer pop() {
        return this.removeFront();
    }

    // Queue functions 
    // ---------------------------------------------------------------
    public void enqueue(int val) {
        this.insertRear(val);
    }

    public Integer dequeue() {
        return this.removeFront();
    }

    // Print the queue
    public void print() {
        int i = 0;
        while (i < this.array.length) {
            System.out.print(this.array[i] + " -> ");
            i+=1;
        }
        System.out.print('\n');
    }
}