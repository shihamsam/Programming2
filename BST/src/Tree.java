public class Tree {

    private TreeNode root;

    public void Insert(int data){

        if(root == null){
            root = new TreeNode(data);
        }else {
            root.Insert(data);

        }
    }

    public int Search(int data){
        int result = -1;
        if(root == null){
            System.out.println("No data. Root is null ");

        }else {
            result = root.Search(data);
        }

        return  result;
    }

    public int getMin(){
        if(root == null){
            System.out.println("Tree does not exist! ");
        } else{
            return root.getMin();

        }

        return  -1;

    }
    public int getMax(){
        if(root == null){
            System.out.println("Tree does not exist! ");
        } else{
            return root.getMax();
        }
        return  -1;

    }
}
