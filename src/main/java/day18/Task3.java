package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node (18);

        root.add(5);
        root.add(150);
        root.add(27);
        root.add(24);
        root.add(23);
        root.add(8);
        root.add(11);
        root.add(14);
        root.add(16);
        root.add(18);
        root.add(20);
        root.add(22);

       dfs(root);

    }

    public static void dfs(Node node) {
        if (node.getLeftSon() != null)
            dfs(node.getLeftSon());
        System.out.print(node.getValue() + " ");
        if (node.getRightSon() != null)
            dfs(node.getRightSon());
    }
}

//5 8 11 14 15 16 18 20 22 23 24 27 150