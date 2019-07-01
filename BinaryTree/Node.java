
class Node{
    private Node tree;

    private int data;
    private Node left;
    private Node right;

    public Node( ){
    }

    public Node( int d){
        this.data = d;
    }
    public void setData(int d){
        this.data = d;
    }
    public int getData(){
        return this.data;
    }
    public void setLeft(Node node){
        this.left = node;
    }
    public Node getLeft(){
        return this.left;
    }public void setRight(Node node){
        this.right = node;
    }
    public Node getRight(){
        return this.right;
    }
    @Override
    public String toString(){
        return "data:"+data+"left"+left.data+"right"+right.data;
    }

    //向二叉树中插入数据
    public void insertBT( int d){
        if(tree == null){
          tree = new Node(d);
            return;
        }
        Node node = tree;
        while(node != null){
            if(d < node.data){
                if(node.left == null){
                    node.left = new Node(d);
                    return;
                }
                node = node.left;
            }else{
                if(node.right == null){
                    node.right = new Node(d);
                    return;
                }
                node = node.right;
            }
        }
    }


}