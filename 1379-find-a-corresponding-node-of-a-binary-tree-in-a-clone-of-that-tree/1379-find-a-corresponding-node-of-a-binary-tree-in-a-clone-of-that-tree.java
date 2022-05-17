class Solution {
    TreeNode ref =null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inOrder(original,cloned,target);
        return ref;
    }
    void inOrder(TreeNode original, TreeNode cloned,TreeNode target){
        if(original==null){
            return ;
        }
        inOrder(original.left,cloned.left,target);
        if(original.val==target.val){
            ref = cloned;
            return;
        }
        inOrder(original.right,cloned.right,target);
        return ;
    }
}