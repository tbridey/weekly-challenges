package linkedList_StackChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.

2) Implement a stack that has the following methods:
• push ( val ) : push val onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

Each method should run in constant time.
*/

public class listStack {

    public static void stackInit(Stack stack) {
        stack.push("val");
    }

    public static int findIntersect(List<Integer> a, List<Integer> b) {
        int node = 0;
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) == (b.get(i))){
                node = i;
                break;
            }else{
                node = 0;
            }
        }
        return node;
    }
  
    public static void main(String[] args) {
        // initialize 2 linked lists with values
        List<Integer> listA = new LinkedList<Integer>(Arrays.asList(3, 7, 8, 10));
        List<Integer> listB = new LinkedList<Integer>(Arrays.asList(99, 1, 8, 10));
        // find the intersecting node and print it
        int intersectingNode = findIntersect(listA, listB);
        switch(intersectingNode){
            case 0: System.out.println("there is no intersecting node between lists A and B");
            break;
            default: System.out.println("The intersecting node of lists A and B is: " + intersectingNode);  
        }
        
        // Initialize stack
        Stack<String> stack = new Stack<>();
        stackInit(stack);
    }
}
