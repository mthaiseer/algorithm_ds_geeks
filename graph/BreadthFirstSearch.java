package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {


    static void bfs(List<List<Integer>> adjList, int source, int size) {

        boolean visited[] = new boolean[size];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();
            System.out.print(current + "->");
            for (int child : adjList.get(current)) {
                if (visited[child] != true) {
                    visited[child] = true;
                    queue.add(child);
                }
            }
         }
    }

    static void addEdge(List<List<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }


    public static void main(String[] args) {

        int size = 4;
        ArrayList<List<Integer>> adjList = new ArrayList<List<Integer>>(size);
        for (int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);

        bfs(adjList, 0, size);


    }


}
