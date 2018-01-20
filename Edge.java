public class Edge {

        private Node source;

        private Node destination;

        private int weight;

        public Edge() {
            super();
        }

        public Edge(Node sourceNodeId, Node destNodeId) {
            super();
            this.source = sourceNodeId;
            this.destination = destNodeId;
            this.weight = 1;
        }

        public Edge(Node sourceNodeId, Node destNodeId, int weight) {
            super();
            this.source = sourceNodeId;
            this.destination = destNodeId;
            this.weight = weight;
        }

        public Node getSourceNode() {
            return source;
        }

        public void setSourceNode(Node sourceNodeId) {
            this.source = sourceNodeId;
        }

        public Node getDestNodeId() {
            return destination;
        }

        public void setDestNodeId(Node destNodeId) {
            this.destination = destNodeId;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

}
