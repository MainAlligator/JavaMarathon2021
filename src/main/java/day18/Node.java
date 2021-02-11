package day18;

public class Node {

    private int value;

    private Node leftSon;
    private Node rightSon;

    public Node(int value) {
        this.value = value;
    }

    public void add(int number) {

        if (number < this.getValue()) {
            if (leftSon != null)
                leftSon.add(number);
            else
                leftSon = new Node(number);
        } else if (rightSon != null)
            rightSon.add(number);
        else
            rightSon = new Node(number);

    }


    public int getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }
}
