package com.Graphs_37;

import java.util.ArrayList;

public class SD_12_Bellman_Ford_Algorithm{
    static class Edge{
        int src;
        int dest;
        int wt;


        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph []){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i=0; i< dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        // TOTAL TIME T.C - > O(V*E)
        // Algo - O(v)
        for(int i=0; i<V-1; i++){
            // Edges - O(E)
            for(int j=0; j<graph.length; j++){ // Vertex
                for(int k=0; k<graph[j].size(); k++){ // Edges
                    Edge e = graph[j].get(k);
                    // U, V, Wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // Relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt <dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        // Print
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}
