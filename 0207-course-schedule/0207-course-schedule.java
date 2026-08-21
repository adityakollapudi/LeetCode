class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] pair : prerequisites){
            int course = pair[0];
            int prerequisite = pair[1];
            graph.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int completed = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            completed++;

            for(int next : graph.get(current)){
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        return completed == numCourses;
    }
}