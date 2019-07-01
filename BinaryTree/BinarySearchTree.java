/* 
    需求：将2,23,4,5,56,4,33,55,12序列存入二叉树中

*/
class BinarySearchTree{

    

    
    //前序遍历
    // public static void preTraverse(){

    // }


    public static void main(String[] args){
        int[] a = {2,23,4,5,56,4,33,55,12};
        Node node = new Node();
        for(int i=0; i<a.length; i++){
            node.insertBT(a[i]);
            
        }

        // node.preTraverse();
    }
}