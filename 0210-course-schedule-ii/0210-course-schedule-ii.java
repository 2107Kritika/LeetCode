class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> prerequisities = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            prerequisities.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            prerequisities.get(pre[1]).add(pre[0]);
        }
        
        int indegree[]= new int[numCourses];
        for(int[] it : prerequisites){
            indegree[it[0]]++;
        }
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] topo=new int[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[i++]=node;
            for(int it: prerequisities.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
         if (i == numCourses) {
            return topo;
        } else {
            return new int[0];
        }
    }
}