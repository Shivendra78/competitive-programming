package BinaryTree;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Arrays.Sum;

class Node{
    int val;
    Node left;
    Node right;

    Node (int val){
        this.val=val;
    }
}

class Pair{
    Node node;
    int level;
    public String val;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public class implementation {
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1); 
        Node e=new Node(1); 
        Node f=new Node(6); 
        Node g=new Node(9); 

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        //level order traversal
        for(int i=0;i<levels(a);i++){
            kthLevel(a, 0, i);
            System.out.println();
        }

        kthLevel(a,0,2);
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println("Sum "+Sum(a));
        System.out.println(max(a));
        System.out.println("Levels"+levels(a));
        
        // System.out.println("Preorder"+preOrder(a));
        // System.out.println("Preorder"+postOrder(a));
        // System.out.println("Preorder"+inOrder(a));

        levelOrder(a);
    }

    private static void kthLevel(Node root, int level, int k) {
       if(root==null) return;
       if(level==k) System.out.println(root.val+" ");
       kthLevel(root.left, level+1, k);
       kthLevel(root.right, level+1, k);
    }

    private static void levelOrder(Node root) {
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.println(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }

        System.out.println();

    }

    private static void postOrder(Node root) {
      if(root==null) return;
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.val+" ");
      
    }

    private static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    private static void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static int size(Node root) {
       if(root==null){
        return 0;
       }
       int leftSize=size(root.left);
       int rightSize=size(root.right);
       return 1+rightSize+leftSize;
    }

    private static int Sum(Node root) {
       if(root==null){
        return 0;
       }
       int leftSize=Sum(root.left);
       int rightSize=Sum(root.right);
       return root.val+rightSize+leftSize;
    }

     private static int levels(Node root) { //kaam ki chij
       if(root==null){
        return 0;
       }

       return 1+size(root.left)+size(root.right);
      
    }

     private static int max(Node root) {
       if(root==null){
        return Integer.MIN_VALUE;
       }
       
       return Math.max(root.val,Math.max(max(root.left),max(root.left)));
    }


    private static void display(Node root) {
            if(root==null){
                return;
            }
            System.out.print(root.val+" ");
            display(root.left); //left ki saari values print
            display(root.right); //rigght ki saari values print
    }

    private static void levelOrderLineWise(Node root){
        Queue <Pair> q=new LinkedList<>();
        int currLevel=0;
        q.add(new Pair(root, 0));
        while(q.size()>0){
            Pair front=q.remove();

            Node node=front.node;
            int level=front.level;

            if(front.level!=currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.println(front.node.val+" ");
            if(node.left!=null) q.add(new Pair(node.left, level+1));
            if(node.right!=null) q.add (new Pair(node.right,level+1));
        }
        System.out.println();
    }

      public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList <ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,new ArrayList<>(),ans);
        return ans; 
        
    }

      private static void dfs(Node root, ArrayList <Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ArrayList <Integer> list=new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size()-1);//backtraking
      }

        public ArrayList<Integer> rightView(Node root) {
           ArrayList <Integer> ans=new ArrayList<>();
           view(root,0,ans); 
            return ans;
        // code here
        
    }

        private void view(Node root, int level, ArrayList<Integer> ans) {
            if(root==null) return;
            if(level>=ans.size()) ans.add(root.val);
            else ans.set(level,root.val);
            view(root.left,level+1,ans);
            view(root.right,level+1,ans);
        }

        Node lca(Node root,int p,int q){
            if(root==null) {
                return null;
            }
            if(root.val==p || root.val==q ){
                return root;
            }

            boolean pLiesInLeft=exists(root.left,p);
            boolean qLiesInRight=exists(root.right,q);
            if(pLiesInLeft && qLiesInRight){
                return lca(root, p, q);
            }else if(!pLiesInLeft && qLiesInRight){
                return lca(root.right,p,q);
            }else{
                return root;
            }
        }

        private boolean exists(Node root, int val) {
            if(root==null) return false;
            if(root.val==val) return true;
            return exists(root.left, val) || exists(root.right, val);
        }

        Node Lca(Node root,int p,int q){
            //TC=O(n)
            if(root==null){
                return null;
            }
            if(root.val==p ||root.val==q){
                return root;
            }
            Node l=lca(root.left,p,q);
            Node r=lca(root.right,p,q);
            if(l!=null && r!=null) return root;
            return (l==null) ? r:l;
        }

        int findDist(Node root,int a ,int b){
            Node LCA=lca(root,a,b);
            int [] dis={0,0};
            dfs(LCA,a,b,0,dis);
            return dis[0]+dis[1];
        }

        private void dfs(Node root, int a, int b, int level, int[] dis) {
            if(root==null) return;
            if(root.val==a) dis[0]=level;
            if(root.val==b) dis[1]=level;
            dfs(root.left,a,b,level+1,dis);
            dfs(root.right,a,b,level+1,dis) ;
        }
        
        
        public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        
            ArrayList <ArrayList<Integer>> ans=new ArrayList<>();
            ArrayList <Integer> arr=new ArrayList<>();
            dfs(root, arr, ans,sum);
            return ans;
        
    }

        private void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {

                    if(sum==0){
                        ArrayList <Integer> arr2=new ArrayList<>();
                        arr2.addAll(arr);
                        ans.add(arr2);
                        
                    }
                    if(root==null) return; 

                    arr.add(root.val);
            
                    dfs(root.left, arr, ans,sum-root.val);
                    if(root.left!=null || root.right!=null){
                        dfs(root.right,arr,ans,sum-root.val);
                    }
                     arr.remove(arr.size()-1);
        }
}
