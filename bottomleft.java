package geeks.binarytree;
// FIND THE BOTTOM LEFT TREE VALUE.
import java.util.*;
class Node{
    int val;
    Node left ,right;
    Node (){}
    public Node (int val){
        this.val=val;
    }
    Node (int val ,Node left ,Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class bottomleft {
    public int findbottomleft(Node root){
        Queue <Node> q = new LinkedList <>();
        q.add(root);
        int bottom = root.val;

        while (!q.isEmpty()){
            int size =q.size();
            for (int i= 0;i<size ;i++){
                Node curr = q.poll();
                if(i==0){
                    bottom = curr.val;
                }
                if (curr.left!= null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
        }
        return bottom;
    }
}
