package Graphs;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacncyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacncyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacncyMatrix[i][j] = 1;
        adjacncyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("  ");
        for (int i=0; i<nodeList.size(); ++i) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i=0; i<nodeList.size();++i) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacncyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
