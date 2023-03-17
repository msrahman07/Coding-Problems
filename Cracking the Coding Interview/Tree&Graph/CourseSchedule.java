import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseSchedule {
    Map<Integer, ArrayList<Integer>> preReqMap = new HashMap<Integer, ArrayList<Integer>>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // build preReq map
        for(int i = 0; i < numCourses; i++) {
            preReqMap.put(i, new ArrayList<Integer>());
        }
        for(int[] preReq : prerequisites) {
            preReqMap.get(preReq[0]).add(preReq[1]);
        }

        int[] visited = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(visited[i] == 0) {
                if(isCyclic(visited, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCyclic(int[] visited, int curr) {
        if(visited[curr] == 2) {
            return true;
        }

        visited[curr] = 2;

        for(int i = 0; i < preReqMap.get(curr).size(); i++) {
            if(visited[preReqMap.get(curr).get(i)] != 1) {
                if(isCyclic(visited, preReqMap.get(curr).get(i))) {
                    return true;
                }
            }
        }
        visited[curr] = 1;
        return false;
    }
}
