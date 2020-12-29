package graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    static void  dfs(ArrayList<List<Integer>> adjList, int source, boolean[] visited ){
        System.out.print(source + "->");
        visited[source] = true;
        for(int child: adjList.get(source)){
            if(visited[child] != true){
                dfs(adjList, child, visited);
            }

        }
    }

    static void addEdge(List<List<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }


    public static void main(String[] args) {

        int size = 7;
        ArrayList<List<Integer>> adjList = new ArrayList<List<Integer>>(size);
        for (int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }

        boolean[] visited = new boolean[size];

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 4, 5);
        addEdge(adjList, 4, 6);
        addEdge(adjList, 5, 6);

        dfs(adjList, 0, visited);

    }
}
