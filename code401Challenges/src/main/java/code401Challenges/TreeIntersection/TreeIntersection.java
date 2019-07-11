package code401Challenges.TreeIntersection;

import code401Challenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {
        public static ArrayList<Integer> treeIntersection(BinaryTree<Integer> treeA, BinaryTree<Integer> treeB){
            if(treeA.getRoot() == null || treeB.getRoot() == null){
                throw new NullPointerException("one of the trees is null");
            }
            HashSet<Integer> hashTreeA = new HashSet<>();
            HashSet<Integer> hashTreeB = new HashSet<>();

            hashTreeA.addAll(treeA.inOrder());
            hashTreeB.addAll(treeB.inOrder());

            hashTreeA.retainAll(hashTreeB);
            return new ArrayList<Integer>(hashTreeA);
        }
}
