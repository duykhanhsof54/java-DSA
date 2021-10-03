public class Linkedlist {
    private int data = 0;
    private Linkedlist next = null;

    public Linkedlist(int data) {
        this.data = data;
        this.next = null;
    }
    static class SinglyLinkedList {
        public Linkedlist head;
        public Linkedlist tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            Linkedlist node = new Linkedlist(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    /**
     * in ra cac phan tu trong llist .
     * @param head : node dau DS .
     */
    static void printLinkedList(Linkedlist head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    /**
     * chen them node vao cuoi DS .
     * @param head .
     * @param data .
     * @return
     */
    static Linkedlist insertNodeAtTail(Linkedlist head, int data) {
        if (head == null) {
            head = new Linkedlist(data);
        } else {
            Linkedlist tail = head;
            while (tail.next != null) tail = tail.next;
            tail.next = new Linkedlist(data);
        }
        return head;
    }

    /**
     * chen phan tu vao dau DS .
     * @param llist .
     * @param data .
     * @return
     */
    static Linkedlist insertNodeAtHead(Linkedlist llist, int data) {
        Linkedlist temp = new Linkedlist(data);
        if (llist == null) {
            llist = temp;
            return llist;
        } else {
            temp.next = llist;
        }
        return temp;
    }

    /**
     * chen vao 1 VT bat ky .
     * @param llist .
     * @param data .
     * @param position .
     * @return .
     */
    public static Linkedlist insertNodeAtPosition(Linkedlist llist, int data, int position) {
        Linkedlist cur = llist;
        Linkedlist temp = new Linkedlist(data);
        int i = 0;
        if (position == 0) {
            temp.next = cur;
            return cur;
        }
        if (position < 0) {
            return null;
        }
        while (i < position - 1 && cur != null) {
            cur = cur.next;
            i++;
        }
        if (i != position - 1) return null;
        temp.next = cur.next;
        cur.next = temp;
        return llist;
    }

    /**
     * xoa node .
     * @param llist .
     * @param position .
     * @return
     */
    public static Linkedlist deleteNode(Linkedlist llist, int position) {
        // Write your code here
        Linkedlist cur = llist;
        int i = 0;
        if (position == 0) {
            llist = llist.next;
            return llist;
        }

        while (i < position - 1 && cur != null) {
            cur = cur.next;
            i++;
        }

        Linkedlist del = cur.next;
        cur.next = del.next;
        return llist;
    }

    /**
     * in ra DS dao nguoc .
     * @param llist .
     */
    public static void reversePrint(Linkedlist llist) {
        // Write your code here
        Linkedlist cur = llist;
        Linkedlist prev = null;
        while (cur != null) {
            Linkedlist temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        while (prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }
    }

    /**
     * dao nguoc DS .
     * @param llist
     * @return.
     */
    public static Linkedlist reverse(Linkedlist llist) {
        if (llist == null) {
            return null;
        }
        Linkedlist prev = null, cur = llist;
        while (cur != null) {
            Linkedlist nextptr = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextptr;
        }
        return prev;

    }

    /**
     * sap xep va hop nhat 2 DS .
     * @param head1
     * @param head2
     * @return
     */
    static boolean compareLists(Linkedlist head1, Linkedlist head2) {
        Linkedlist temp = head1;
        Linkedlist temp2 = head2;
        int count1 = 0;
        while (temp != null) {
            temp = temp.next;
            count1++;
        }
        int count2 = 0;
        while (temp2 != null) {
            temp2 = temp2.next;
            count2++;
        }
        if (count1 != count2) {
            return false;
        }
        while (head1 != null) {
            int count = 0;
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;


        }
        return true;
    }

    /**
     * lay gtri tai node cach tail 1 khoang .
     * @param llist .
     * @param positionFromTail vi tri cach tail.
     * @return
     */
    public static int getNode(Linkedlist llist, int positionFromTail) {
        // Write your code here
        Linkedlist node = llist;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        node = llist;
        size -= positionFromTail;
        int k = 0;
        while (node != null && size != 0) {
            k = node.data;
            node = node.next;
            size--;
        }
        return k;
    }
}
