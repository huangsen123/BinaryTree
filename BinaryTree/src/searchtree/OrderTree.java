package searchtree;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
	
}
public class OrderTree {
	TreeNode root;
	OrderTree(){
		root = null;
	}
	public void insert(int val){
		TreeNode newnode = new TreeNode(val); 
		if (root == null){
			root = newnode;
		}
		else{
		     TreeNode parent = root;
		     TreeNode current = root;
		    while(true){
		    	parent = current;
			if (val<current.val){
				current = current.left;
				if(current==null){
					parent.left = newnode;
				    break;
				}
			}
			else{
				current = current.right;
				if(current == null){
					parent.right = newnode;
					break;
				}
			}
		    }
		}				
		
	}
	public void BuildTree(int[] arr){
		for (int i = 0; i<arr.length; i++)
			insert(arr[i]);
		
	}

	public void inorder(TreeNode node){
		if (node != null){
	    inorder(node.left);
		System.out.println(node.val+"");
		inorder(node.right);
		}
	}
	public void inorder(){
		this.inorder(this.root);
	} 
   public void preorder(TreeNode node){
	   if (node != null){
		   System.out.println(node.val+"");
		   preorder(node.left);
		   preorder(node.right);
	   }
   }
   public void preorder(){
	   this.preorder(this.root);
	   
   }
   public void postorder(TreeNode node){
	   if (node != null){
	       postorder(node.left);
		   postorder(node.right);
		   System.out.println(node.val+"");
	   }
   }
   public void postorder(){
	   this.postorder(this.root);
	   
   }
   public static void main(String[] args){
	   int[] arr = {2,8,4,9,3,1,6,7,5};
	   OrderTree sort = new OrderTree();
	   sort.BuildTree(arr);
	   System.out.println("中序遍历结果为：");
	   sort.inorder();
	   System.out.println("前序遍历结果为：");
	   sort.preorder();
	   System.out.println("后序遍历结果为：");
	   sort.postorder();
   }
}

