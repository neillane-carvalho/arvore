public class Ativ1 {
    No1 raiz;

    public Ativ1(){
        raiz = null;
    }

    void inOrder(No1 node) {
        if (node != null) {
            inOrder(node.esquerda);
            System.out.print(node.data + " ");
            inOrder(node.direita);
        }
    }

    void preOrder(No1 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.esquerda);
            preOrder(node.direita);
        }
    }

    void postOrder(No1 node) {
        if (node != null) {
            postOrder(node.esquerda);
            postOrder(node.direita);
            System.out.print(node.data + " ");
        }
    }

    void printLeaves(No1 node) {
        if (node != null) {
            if (node.esquerda == null && node.direita == null) {
                System.out.print(node.data + " ");
            }
            printLeaves(node.esquerda);
            printLeaves(node.direita);
        }
    }

    // Apresentar pai (raiz) e seus filhos
    void printRootAndChildren(No1 node) {
        if (node != null) {
            System.out.print("Raiz: " + node.data + ", Filhos: ");
            if (node.esquerda != null) {
                System.out.print(node.esquerda.data + " ");
            }
            if (node.direita != null) {
                System.out.print(node.direita.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ativ1 tree = new Ativ1();

        // Criando a árvore
        tree.raiz = new No1(5);
        tree.raiz.esquerda = new No1(3);
        tree.raiz.direita = new No1(9);
        tree.raiz.esquerda.esquerda = new No1(4);
        tree.raiz.direita.esquerda = new No1(7);
        tree.raiz.direita.direita = new No1(11);

        // a) Mostrar o caminhamento central a esquerda (in-order)
        System.out.print("Caminhamento central a esquerda (in-order): ");
        tree.inOrder(tree.raiz);
        System.out.println();

        // b) Mostrar o caminhamento pré-fixado a direita (pre-order)
        System.out.print("Caminhamento pré-fixado a direita (pre-order): ");
        tree.preOrder(tree.raiz);
        System.out.println();

        // c) Mostrar o caminhamento pós-fixado a esquerda (post-order)
        System.out.print("Caminhamento pós-fixado a esquerda (post-order): ");
        tree.postOrder(tree.raiz);
        System.out.println();

        // d) Apresentar todos os nós folhas
        System.out.print("Nós folhas: ");
        tree.printLeaves(tree.raiz);
        System.out.println();

        // e) Liste o pai (Raiz) e seus Filhos
        System.out.print("Pai (Raiz) e seus Filhos: ");
        tree.printRootAndChildren(tree.raiz);
    }
}
