public class Node {

        //private HashMap<Node, List<Edge>> graph;

        private int nodeId;

        public Node(int nodeId) {
            super();
            this.nodeId = nodeId;
        }

        public int getNodeId() {
            return nodeId;
        }

        public void setNodeId(int nodeId) {
            this.nodeId = nodeId;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + nodeId;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
            if (nodeId != other.nodeId)
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Node [nodeId=" + nodeId + "]";
        }

}


