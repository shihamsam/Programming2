public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;



    public TreeNode(int data){
        this.data = data;
    }


    public void Insert(int data){
        if(this.data < data){
            TreeNode current = this.getRightChild();
            if( current == null)
                this.setRightChild(new TreeNode(data));
            else
                current.Insert(data);

        }else{

            TreeNode current = this.getLeftChild();
            if(current == null)
                this.setLeftChild(new TreeNode(data));
            else
                current.Insert(data);
        }
    }

    public int getMin(){
        TreeNode left = this.getLeftChild();
        if(left == null){
            return this.data;
        }else{
           return left.getMin();
        }
    }

    public int getMax(){
        TreeNode right = this.getRightChild();
        if(right == null){
            return  this.data;
        }else{
            return right.getMax();
        }
    }


    public int Search(int data){

        int result = -1;
        if(this.data == data)
            return data;

        if(this.data < data){
            TreeNode right = this.getRightChild();
               if(right == null) {
                   System.out.println(" Data not found ");
               }else{
                   result =  right.Search(data);
               }
        }else{
            TreeNode left = this.getLeftChild();

            if(left == null){
                System.out.println(" Data not found ");
            }else{
                result =left.Search(data);
            }
        }

        return  result;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
