package sem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        BinaryTree<Integer> tree = new BinaryTree<>();

        List<Integer> nums = new ArrayList<>();

        tree.add(20);
        for (int i = 1; i < 21; i++) {
            nums.add(i * 2);
        }
        for (int i =0; i < 20; i++) {
            int rand = new Random().nextInt(0, nums.size());
            tree.add(nums.get(rand));
            nums.remove(rand);
        }

        tree.print();
    }
}
