import org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LowestCommonAncestorTest {

    @org.junit.Test
    public void testfindLCA() {

        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int result = tree.findLCA(4,5);
        assertEquals(result, 2);
    }

    @Test
    public void testInvalidOption() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int result = tree.findLCA(10,20);
        assertEquals(result, -1);
    }

    @Test
    public void testEmptyTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        int result = tree.findLCA(10, 11);
        assertEquals(result, -1);
    }

    @Test
    public void testSingleNodeTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);

        int result = tree.findLCA(1,1);
        assertEquals(result,1);
    }

    @Test
    public void testingDAG(){
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(2);
        tree.root.left = new Node(5);
        tree.root.right = new Node(6);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(7);

        int result = tree.findLCA(5,7);
        assertEquals(result, 2);
    }
}