import java.util.Scanner;

public class Desafio {
    NoDesafio root;

    public Desafio() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    NoDesafio insertRec(NoDesafio root, int data) {
        if (root == null) {
            root = new NoDesafio(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(NoDesafio root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}



