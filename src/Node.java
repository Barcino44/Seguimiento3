public class Node {
    private Node next;
    private Node previous;
    private int actual;
    private int numberOfTurn;
    private int passedTimes;

    public int getPassedTimes() {
        return passedTimes;
    }

    public void setPassedTimes(int passedTimes) {
        this.passedTimes = passedTimes;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public Node(int numberOfTurn) {
        this.numberOfTurn = numberOfTurn;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getNumberOfTurn() {
        return numberOfTurn;
    }

    public void setNumberOfTurn(int numberOfTurn) {
        this.numberOfTurn = numberOfTurn;
    }
}


