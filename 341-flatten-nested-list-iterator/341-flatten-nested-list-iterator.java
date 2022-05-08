/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    
    List<Integer> res = new ArrayList<>();
    Iterator<Integer> it;
    

    public NestedIterator(List<NestedInteger> nestedList) {
        
        flatting(nestedList, res);
        it = res.iterator();
        
        
        
    }
    
    private List<Integer> flatting(List<NestedInteger> nestedList, List<Integer> res)
    {
        for(int i=0; i<nestedList.size();i++)
        {
            if(nestedList.get(i).isInteger())
            {
                res.add(nestedList.get(i).getInteger());
            }
            
            else
            {
                flatting(nestedList.get(i).getList(), res);
            }
            
        }
        
        return res;
    }

    @Override
    public Integer next() {
        
        return it.next();
        
    }

    @Override
    public boolean hasNext() {
        
        return it.hasNext();
        
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */