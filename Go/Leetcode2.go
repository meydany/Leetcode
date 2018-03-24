/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

import "fmt"
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    sumNode, currSum := &ListNode{},0
    point := sumNode

    for l1 != nil || l2 != nil {
        if(l1 != nil) {
            currSum += l1.Val
            l1 = l1.Next
        }

        if(l2 != nil) {
            currSum += l2.Val
            l2 = l2.Next
        }

        val := currSum%10
        currSum /= 10

        fmt.Println(val, currSum)

        sumNode.Next = &ListNode{Val: val}
        sumNode = sumNode.Next
    }

    if currSum != 0 {
        sumNode.Next = &ListNode{Val: currSum}
        sumNode = sumNode.Next
    }

    return point.Next
}
