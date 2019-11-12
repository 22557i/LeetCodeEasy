package Homework6;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Tree23<Key extends Comparable<Key>,Value> {
    private class Data<Key extends Comparable<Key>,Value>{
        private Key key;
        private Value value;
        public Data(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
        public void displayData(){
            System.out.println("/" + key+"---"+value);
        }
    }

    private class Node23<Key extends Comparable<Key>,Value>{

        public void displayNode() {
            for(int i = 0; i < itemNum; i++){
                itemDatas[i].displayData();
            }
            System.out.println("/");
        }

        private static final int N = 3;

        private Node23 parent;
        private Node23[] chirldNodes = new Node23[N];

        private Data[] itemDatas = new Data[N - 1];
        private int itemNum = 0;

        private boolean isLeaf(){

            return chirldNodes[0] == null;
        }

        private boolean isFull(){
            return itemNum == N-1;
        }

        private Node23 getParent(){
            return this.parent;
        }

        private void connectChild(int index,Node23 child){
            chirldNodes[index] = child;
            if (child != null){
                child.parent = this;
            }
        }

        private Node23 disconnectChild(int index){
            Node23 temp = chirldNodes[index];
            chirldNodes[index] = null;
            return temp;
        }

        private Data getData(int index){
            return itemDatas[index];
        }

        private Node23 getChild(int index){
            return chirldNodes[index];
        }

        public int getItemNum(){
            return itemNum;
        }

        private int findItem(Key key){
            for (int i = 0; i < itemNum; i++) {
                if (itemDatas[i] == null){
                    break;
                }else if (itemDatas[i].key.compareTo(key) == 0){
                    return i;
                }
            }
            return -1;
        }

        private int insertData(Data data){
            itemNum ++;
            for (int i = N -2; i >= 0 ; i--) {
                if (itemDatas[i] == null){
                    continue;
                }else{
                    if (data.key.compareTo(itemDatas[i].key)<0){
                        itemDatas[i+1] = itemDatas[i];
                    }else{
                        itemDatas[i+1] = data;
                        return i+1;
                    }
                }
            }
            itemDatas[0] = data;
            return 0;
        }

        private Data removeItem(){
            Data temp = itemDatas[itemNum - 1];
            itemDatas[itemNum - 1] = null;
            itemNum --;
            return temp;
        }
    }

    private Node23 root = new Node23();
    public Value find(Key key) {
        Node23 curNode = root;
        int childNum;
        while (true) {
            if ((childNum = curNode.findItem(key)) != -1) {
                return (Value) curNode.itemDatas[childNum].value;
            }

            else if (curNode.isLeaf()) {
                return null;
            } else {
                curNode = getNextChild(curNode,key);
            }
        }
    }

    private Node23 getNextChild(Node23 node,Key key){
        for (int i = 0; i < node.getItemNum(); i++) {
            if (node.getData(i).key.compareTo(key)>0){
                return node.getChild(i);
            }
            else if (node.getData(i).key.compareTo(key) == 0){
                return node;
            }
        }
        return node.getChild(node.getItemNum());
    }

    public void insert(Key key,Value value){
        Data data = new Data(key,value);
        Node23 curNode = root;
        while(true){
            if (curNode.isLeaf()){
                break;
            }else{
                curNode = getNextChild(curNode,key);
                for (int i = 0; i < curNode.getItemNum(); i++) {
                    if (curNode.getData(i).key.compareTo(key) == 0){
                        curNode.getData(i).value =value;
                        return;
                    }
                }
            }
        }
        if (curNode.isFull()){
            split(curNode,data);
        }
        else {
            curNode.insertData(data);
        }
    }

    private void split(Node23 node, Data data) {
        Node23 parent = node.getParent();
        Node23 newNode = new Node23();
        Node23 newNode2 = new Node23();
        Data mid;

        if (data.key.compareTo(node.getData(0).key)<0){
            newNode.insertData(node.removeItem());
            mid = node.removeItem();
            node.insertData(data);
        }else if (data.key.compareTo(node.getData(1).key)<0){
            newNode.insertData(node.removeItem());
            mid = data;
        }else{
            mid = node.removeItem();
            newNode.insertData(data);
        }
        if (node == root){
            root = newNode2;
        }
        newNode2.insertData(mid);
        newNode2.connectChild(0,node);
        newNode2.connectChild(1,newNode);
        connectNode(parent,newNode2);
    }

    private void connectNode(Node23 parent, Node23 node) {
        Data data = node.getData(0);
        if (node == root){
            return;
        }
        if (parent.isFull()){
            Node23 gParent = parent.getParent();
            Node23 newNode = new Node23();
            Node23 temp1,temp2;
            Data itemData;

            if (data.key.compareTo(parent.getData(0).key)<0){
                temp1 = parent.disconnectChild(1);
                temp2 = parent.disconnectChild(2);
                newNode.connectChild(0,temp1);
                newNode.connectChild(1,temp2);
                newNode.insertData(parent.removeItem());

                itemData = parent.removeItem();
                parent.insertData(itemData);
                parent.connectChild(0,node);
                parent.connectChild(1,newNode);
            }else if(data.key.compareTo(parent.getData(1).key)<0){
                temp1 = parent.disconnectChild(0);
                temp2 = parent.disconnectChild(2);
                Node23 tempNode = new Node23();

                newNode.insertData(parent.removeItem());
                newNode.connectChild(0,newNode.disconnectChild(1));
                newNode.connectChild(1,temp2);

                tempNode.insertData(parent.removeItem());
                tempNode.connectChild(0,temp1);
                tempNode.connectChild(1,node.disconnectChild(0));

                parent.insertData(node.removeItem());
                parent.connectChild(0,tempNode);
                parent.connectChild(1,newNode);
            } else{
                itemData = parent.removeItem();

                newNode.insertData(parent.removeItem());
                newNode.connectChild(0,parent.disconnectChild(0));
                newNode.connectChild(1,parent.disconnectChild(1));
                parent.disconnectChild(2);
                parent.insertData(itemData);
                parent.connectChild(0,newNode);
                parent.connectChild(1,node);
            }
            connectNode(gParent,parent);
        }
        else{
            if (data.key.compareTo(parent.getData(0).key)<0){
                Node23 tempNode = parent.disconnectChild(1);
                parent.connectChild(0,node.disconnectChild(0));
                parent.connectChild(1,node.disconnectChild(1));
                parent.connectChild(2,tempNode);
            }else{
                parent.connectChild(1,node.disconnectChild(0));
                parent.connectChild(2,node.disconnectChild(1));
            }
            parent.insertData(node.getData(0));
        }
    }
}