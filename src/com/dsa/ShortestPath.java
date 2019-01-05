package com.dsa;

public class ShortestPath {

    public static int[] Dijkstra(int[][] graph, int start){

        int V = graph.length;
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];

        for(int i=0; i<V; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;
        int current = findNextMin(distance, visited);
        while (current>-1){
            visited[current] = true;
            updateDistance(graph, distance, visited, current);
            current = findNextMin(distance, visited);
        }
        return distance;
    }

    private static void updateDistance(int[][] graph, int[] distance, boolean[] visited, int current) {

        for(int i=0; i<graph[current].length; i++){
            if(graph[current][i] == 0 || visited[i])
                continue;

            if(distance[current] != Integer.MAX_VALUE && distance[i]> distance[current] + graph[current][i]){
                distance[i] = distance[current]+graph[current][i];
            }

        }

    }

    private static int findNextMin(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minInd = -1;
        for(int i=0; i<distance.length; i++){
            if(visited[i])
                continue;
            if(min>distance[i]){
                min = distance[i];
                minInd = i;
            }
        }
        return minInd;
    }


}
