class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : prerequisites){
            int src=edge[0];
            int des=edge[1];
            graph.get(src).add(des);
        }
        boolean[] vis= new boolean[numCourses];
        boolean[] path= new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(check(graph,vis,path,i))
                return false;
            }
        }
        return true;
    }

    public boolean check(List<List<Integer>> graph, boolean[] vis, boolean[] path, int src){
        vis[src]=true;
        path[src]=true;
        
        for(int neighbour : graph.get(src)){
            if(!vis[neighbour]){
                if(check(graph, vis, path, neighbour))
                return true;
            }
            else if(path[neighbour])
                return true;
        }
        path[src]=false;
        return false;
    }
}