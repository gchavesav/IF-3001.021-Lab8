package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BTreeTest {

    @Test
    void test() {
        BTree bTree = new BTree();
        for (int i = 0; i < 10; i++) {
            bTree.add(util.Utility.getRandom(50));
        }

        try {
            System.out.println(bTree.toString());
            System.out.println("Size: "+bTree.size());
        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }
}