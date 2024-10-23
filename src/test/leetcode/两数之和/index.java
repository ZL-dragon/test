package test.leetcode.两数之和;

class ListNode {        //类名 ：Java类就是一种自定义的数据结构
    int val;            //数据 ：节点数据
    ListNode next;      //对象 ：引用下一个节点对象。在Java中没有指针的概念，Java中的引用和C语言的指针类似
    ListNode() {}
    ListNode(int val){  //构造方法 ：构造方法和类名相同
        this.val=val;   //把接收的参数赋值给当前类的val变量
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Test{
    public static void main(String[] args){

        ListNode l1 = new ListNode(9);    //创建首节点
        ListNode listNode = new ListNode(9);
        ListNode listNode1 = new ListNode(9);

        l1.next=listNode;
        listNode.next=listNode1;

        ListNode l2 = new ListNode(5);    //创建首节点
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3   = new ListNode(4);
        l2.next=listNode2;
        listNode2.next=listNode3;

        Solution solution = new Solution();
        ListNode listNode4 = solution.addTwoNumbers(l1, l2);
        print(listNode4);

    }

    //打印输出方法
    public  static void print(ListNode listNoed){
        //创建链表节点
        while(listNoed!=null){
            System.out.println("节点:"+listNoed.val);
            listNoed=listNoed.next;
        }
        System.out.println();
    }


}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeSta  = new ListNode();//首节点
        ListNode nextNode;
        nextNode=nodeSta;
        //进位
        int jinwei=0;
        while (l1!=null||l2!=null){
            //取值
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int sum=num1+num2+jinwei;
            jinwei=sum/10;
            sum=sum%10;

            ListNode Node = new ListNode();
            Node.val=sum;
            nextNode.next=Node;
            nextNode=nextNode.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        if (jinwei!=0){
            nextNode.next=new ListNode(jinwei);
        }
        nextNode=nodeSta;
        return nextNode.next;
    }
}
