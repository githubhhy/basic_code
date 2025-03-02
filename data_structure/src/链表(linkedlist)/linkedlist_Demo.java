public class linkedlist_Demo {
    public static void main(String[] args) {
        HeroNode node1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode node2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode node3 = new HeroNode(3, "吴用", "智多星");
        HeroNode node4 = new HeroNode(4, "林冲", "豹子头");
        HeroNode node5 = new HeroNode(5, "xx", "xxxx");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add1(node1);
        singleLinkedList.add1(node2);
        singleLinkedList.add1(node5);
        singleLinkedList.showList();
        singleLinkedList.add2(node4);
        singleLinkedList.showList();
        singleLinkedList.add2(node3);
        singleLinkedList.showList();
    }
}

//节点定义
class HeroNode {
    public int no;
    public String name;
    public String nicknema;
    public HeroNode next;
    
    public HeroNode(int no, String name, String nicknema) {
        this.no = no;
        this.name = name;
        this.nicknema = nicknema;
    }

    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + ", nicknema=" + nicknema + "]";
    }

}

class SingleLinkedList {
    //初始化一个头节点，头节点不能动
    private HeroNode head = new HeroNode(0, null, null);

    //添加节点到单链表。不考虑顺序，直接加到最后
    public void add1(HeroNode node){
        HeroNode tmpnode = head;
        while (true) {
            if (tmpnode.next == null) {
                tmpnode.next = node;
                break;
            } else {
                tmpnode = tmpnode.next;
            }
        }
    }
    //添加节点到单链表。考虑顺序，按照No大小排序
    public void add2(HeroNode node){
        HeroNode tmpnode = head;
        boolean flag = false;//编号是否存在
        while (true) {
            if (tmpnode.next == null) {//当前是最后一个，添加到当前节点之后
                break;
            }
            if (tmpnode.next.no > node.no) {//
                break;
            } else if (tmpnode.next.no == node.no) {
                flag =true;
            } else {
                tmpnode = tmpnode.next;
            }
        }
        if (!flag) {
            node.next = tmpnode.next;
            tmpnode.next = node;
        } else {
            System.out.println("已经存在，添加失败");
        }
    }
    public void updateNode(HeroNode node){
        if (head.next == null) {
            return;
        }
        HeroNode tmpnode = head.next;
        boolean flag = false;
        while (true) {
            if (tmpnode == null) {
                break;
            }
            if (tmpnode.no == node.no) {
                flag = true;
            }
            tmpnode.name = node.name;
            tmpnode.nicknema = node.nicknema;
        }
    }

    public void showList(){
        //判断是否为空
        if (head.next == null) {
            return;
        }
        //遍历
        HeroNode tmpnode = head.next;        
        while (true) {
            //判断是否为链表末尾
            if (tmpnode.next == null) {
                System.out.println(tmpnode.toString());
                break;
            } else {
                System.out.println(tmpnode.toString());
                tmpnode = tmpnode.next;
            }  
        }
    }
}