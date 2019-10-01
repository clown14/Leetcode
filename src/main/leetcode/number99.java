package main.leetcode;

/**
 * @program: Leetcode
 * @author: onion
 * @create: 2019-10-01 14:57
 **/

/*
用中序遍历序列的递归方法可以解决该问题，我们先写一个简单的中序遍历的递归代码：

void traverse(TreeNode *root){
    if(root == NULL)
        return ;
    traverse(root->left);
    //Do something
    traverse(root->right);
}

在 Do something 部分可以完成诸如输出，入栈等操作。那么对于这道题目来说，我们在Do something部分将要完成的工作是找到 fristElement和
secondElement，即第一个逆序的节点和第二个逆序的节点。

中序遍历序列是13245
我们比较每个节点与其中序遍历的下一个节点，我们可以发现，3是第一个要交换的节点firstElement，因为3应该小于后一个节点，
而2是第二个要交换的节点secondElement，因为2应该大于前一个节点。

我们定义的前一个节点和后一个节点是按照中序遍历序列定义的。

我们定义三个变量firstElement,secondElement,preElement，分别存储要交换的两个节点和当前遍历到的节点的中序前驱。
 */

public class number99 {
    class Solution {
        TreeNode firstElement;
        TreeNode secondElement;
        TreeNode preElement;   //代表当前遍历的位置的中序前驱节点，先赋一个最小值

        //traverse函数负责找到两个逆序的位置，随后用swap函数将这两个位置进行交换
        public void recoverTree(TreeNode root) {
            traverse(root);
            //swap(firstElement.val, secondElement.val);
            int temp = firstElement.val;
            firstElement.val = secondElement.val;
            secondElement.val = temp;
        }
        //中序遍历序列找到两个逆序的位置
        public void traverse(TreeNode root){
            if(root == null)
                return ;
            //中序遍历左子树
            traverse(root.left);

            if(preElement != null){
                //查看是否逆序，如果逆序，给firstElement和secondElement赋值
                if(firstElement == null && preElement.val > root.val){
                    //当firstElement还没有被赋值，第一个逆序位置是pre节点
                    firstElement = preElement;
                }
                if(firstElement != null && preElement.val > root.val){
                    //当firstElement已经被赋值，第二个逆序位置是root节点
                    secondElement = root;
                }
            }
            preElement = root;   //更新preElement的值

            //中序遍历右子树
            traverse(root.right);
        }
    }
}

    