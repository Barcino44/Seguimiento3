public class Circular_List {
    public static int counter=1;
    public static int counter1=0;
    private Node head;
        public void addNode(){
            Node node =new Node(counter++);
            if(head==null){ //Enlazo el nodo asi mismo, ya que la cabeza es nula
                head=node;
                head.setNext(head);
                head.setPrevious(head);
                node.setActual(head);
            }
            else{
                Node tail=head.getPrevious();//Guardo el nodo previo a la cabeza
                node.setNext(head);//Lo siguiente al nodo que voy a agregar, será la cabeza (node->head)
                head.setPrevious(node);//Lo anterior a la cabeza, sera el nodo. (node<-head)
                tail.setNext(node);//Lo siguiente a la cola será el nodo.(tail ->node)
                node.setPrevious(tail);//Lo anterior al nodo, será la cola. (tail <-node)
            }
    }
        public void print(){
        print(head);
    }
        private void print(Node current){
            if(current==head.getPrevious()){
                System.out.println(current.getNumberOfTurn());
                return;
            }
            System.out.println(current.getNumberOfTurn());
            print(current.getNext());
    }
        public void printActualTurn(){
            printActualTurn(head);
        }
        public void printActualTurn(Node node){
            if(node==node.getActual()){
                System.out.println("El turno actual es"+node.getNumberOfTurn());
                return;
            }
            printActualTurn(node.getNext());
        }
        public void pasarTurno(){
            pasarTurno(head);
        }
        private void pasarTurno(Node node){
            if (node == node.getActual()) {
                Node nextTurn = node.getNext();
                node.setActual(nextTurn);
                System.out.println("El turno actual es "+ nextTurn.getNumberOfTurn());
                return;
            }
            pasarTurno(node.getNext());
    }
            public void deletePerson(Node current){
                if(counter1==3){
                    if (current == head) {
                        Node prev = head.getPrevious();
                        Node next = head.getNext();
                        next.setPrevious(prev);
                        prev.setNext(next);
                        head = next;
                    } else {
                        Node prev = current.getPrevious();
                        Node next = current.getNext();
                        next.setPrevious(prev);
                        prev.setNext(next);
                    }
                    return;
                }
                if (current.getNext()==head){
                    return;
                }
                delete(current.getNext(),goal);
            }
    }

