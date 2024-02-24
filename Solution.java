class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }

        ListNode p = head ; // 1 1 2 
        while(p.next != null){  
            if(p.val == p.next.val){ // 1 == 1 (t), 2 == null (f)
                p.next = p.next.next ; // 1->1 = 1->1->2 
            }else{
                p = p.next ; // 2
            }

        }
        return head ; 
    }
}
