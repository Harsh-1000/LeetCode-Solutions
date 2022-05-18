class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] steps=new int[n+1];
        List<Integer>[] conn=getConnections(n,connections);
        List<List<Integer>> ret=new ArrayList<>();
        dfs(0,-1,0,steps,ret,conn);
        return ret;
    }
    
    List<Integer>[] getConnections(int n, List<List<Integer>> connections){
        List<Integer>[] ret=new ArrayList[n];
        for(List<Integer> list:connections){
            int a=list.get(0);
            int b=list.get(1);
            if(ret[a]==null) ret[a]=new ArrayList<>();
            ret[a].add(b);
            if(ret[b]==null) ret[b]=new ArrayList<>();
            ret[b].add(a);
        }
        return ret;
    }
    
    
    private int dfs(int cur, int parent, int step, int[] steps, List<List<Integer>> ret,
                   List<Integer>[] conn){
        
        steps[cur]=step+1;
        for(int child:conn[cur]){
            if(child==parent) {
                continue;
            } else if(steps[child]==0){
                steps[cur]=Math.min(steps[cur],dfs(child,cur,step+1,steps,ret,conn));       
            } else {
                steps[cur]=Math.min(steps[cur],steps[child]);
            }
        }
        if(steps[cur]==step+1 && parent!=-1){
            ret.add(Arrays.asList(cur,parent));
        }
        return steps[cur];
    }
}