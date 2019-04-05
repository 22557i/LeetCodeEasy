public class Solution427 {
    public Node construct(int[][] grid) {
        int len = grid.length;
        return construct(0, 0, len, grid);
    }
    public Node construct(int x1, int y1, int length, int[][] grid){
        if (length == 1){

            return new Node(grid[x1][y1] == 1, true, null, null, null, null);
        }else{
            int len = length / 2;
            Node t1 = construct(x1, y1, len, grid);
            Node t2 = construct(x1 + len, y1, len, grid);
            Node t3 = construct(x1, y1 + len, len, grid);
            Node t4 = construct(x1 + len, y1 + len, len, grid);
            if (t1.isLeaf && t2.isLeaf && t3.isLeaf && t4.isLeaf){
                if (t1.val == t2.val && t2.val == t3.val &&
                        t3.val == t4.val)
                    return new Node(t1.val, true, null, null, null, null);
            }
            Node t = new Node(true, false, t1,t3,t2,t4);
            return t;

        }
    }
}
