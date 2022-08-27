package GraphList;

import java.util.ArrayList;

public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append("  ");
//        for (int i=0; i<nodeList.size(); ++i) {
//            s.append(nodeList.get(i).name + " ");
//        }
//        s.append("\n");
//        for (int i=0; i<nodeList.size();++i) {
//            s.append(nodeList.get(i).name + ": ");
//            for (int j : adjacncyMatrix[i]) {
//                s.append((j) + " ");
//            }
//            s.append("\n");
//        }
//        return s.toString();
//    }
}
