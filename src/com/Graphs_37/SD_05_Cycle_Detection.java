package com.Graphs_37;

import java.util.ArrayList;

public class SD_05_Cycle_Detection {
    static class Edge{
        int src;
        int dest;


        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // O(V+E)
    public static boolean detechCycle(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detechCycleUtil(graph, vis, i, -1)){
                    return true;
                    // Cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detechCycleUtil(ArrayList<Edge> [] graph, boolean vis[], int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // e.dest = neighbour
            // Case 3
            if (!vis[e.dest]) { // && detechCycleUtil(graph, vis, e.dest, curr))
                if(detechCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                return true;
            }
            // Case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // Case 2 -> Do nothing -> continue
        }
        return false;
    }
    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detechCycle(graph));
    }
}
