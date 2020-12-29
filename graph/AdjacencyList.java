package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

    static void addEdge(List<List<Integer>> adjList, int u, int v){

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }

    public static void main(String[] args) {

        int size = 4;
        ArrayList<List<Integer>> adjList  = new ArrayList<List<Integer>>(size);
        for(int i=0; i<size; i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);

        System.out.println(adjList);

    }
}
