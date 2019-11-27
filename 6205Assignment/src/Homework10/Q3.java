package Homework10;

/**
 * Created by Hao Wu on 11/22/19.
 */
public class Q3 {
}
class Prim {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int minId = 0;
        int sum = 0;
        String[] Vertex = new String[] {"0","1","2","3","4","5","6","7","8" };	//顶点集
        int[][] Matrix = {
                {0,4,min,min,min,min,min,8,min},
                {4,0,8,min,min,min,min,11,min},
                {min,8,0,7,min,4,min,min,2},
                {min,min,7,0,9,14,min,min,min},
                {min,min,min,9,0,10,min,min,min},
                {min,min,4,14,10,0,2,min,min},
                {min,min,min,min,min,2,0,1,6},
                {8,11,min,min,min,min,1,0,7},
                {min,min,2,min,min,min,6,7,0}
        };	//邻接矩阵

        //邻接矩阵初始化


        int vertexSize = Vertex.length;//顶点个数
        int lowcost[]  = new int[vertexSize];//定义最小代价矩阵
        int adjvex[] = new int[vertexSize];//定义数组保存最小权值的顶点编号

        //lowcost矩阵初始化
        for(int i=0;i<vertexSize;i++) {
            lowcost[i] = Matrix[0][i];
        }

        for(int i=1;i<vertexSize;i++) {
            min = Integer.MAX_VALUE;
            minId = 0;
            for(int j=1;j<vertexSize;j++) {
                if(lowcost[j]!=0&&lowcost[j]<min) {//找到lowcost中的最小有效权值
                    min = lowcost[j];//记录最小值
                    minId = j;//记录最小权值的顶点编号
                }
            }
            lowcost[minId] = 0;
            sum += min;
            System.out.println("Vertex：" +Vertex[adjvex[minId]]+" value: " +min);
            for(int j=1;j<vertexSize;j++) {
                if(lowcost[j]!=0&&Matrix[minId][j]<lowcost[j]) {//在邻接矩阵中以编号为minId的顶点作为下一个顶点对lowcost中进行最小值替换
                    lowcost[j] = Matrix[minId][j];
                    adjvex[j] = minId;
                }
            }
        }
        System.out.println("the sum of values is：" + sum);
    }
}

