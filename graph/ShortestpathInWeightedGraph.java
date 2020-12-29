package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestpathInWeightedGraph {

    static int[] path;

    static void shortestPath(ArrayList<List<Integer>> adjList, int source, int numberofVertices){

        boolean visited[] = new boolean[numberofVertices];
        path = new int[numberofVertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()){

            int v = queue.poll();
            for(int u: adjList.get(v)){
                if(!visited[u] ){
                    path[u] = path[u]+ path[v] +1;
                    visited[u] = true;
                    queue.add(u);
                }
            }

        }


        for(int i=0; i<numberofVertices; i++){
            System.out.print(path[i] + " ");
        }
    }
    
    static int qureyPath(int source, int destination, int totalDestinations){
        if(source > totalDestinations || destination > totalDestinations){
            return -1;
        }
        return path[destination] - path[source];
    }



    static void addEdge(List<List<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }

    public static void main(String[] args) {

        int totalVertices = 4;
        ArrayList<List<Integer>> adjList = new ArrayList<List<Integer>>(totalVertices);
        for (int i = 0; i < totalVertices; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);

        shortestPath(adjList, 0, totalVertices);

        System.out.println();

        System.out.println("QUERY 1 to 3 : "+qureyPath(1, 3, totalVertices));
        System.out.println("QUERY 0 to 3 : "+qureyPath(0, 3, totalVertices));
        
    }

}
