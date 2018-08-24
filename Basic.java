stack is a linear data structure which follows a particular order in which operations are performed . 
LIFO or FIFO
java collection framework provides Stack class that impliments stack data structure 


operations inbuilt are : 
1.push 
2.pop
3.empty
4.search
5. peek

class support a default constructor helps to create a empty stack.

class Stack{

static void stack_push(Stack<Integer> stack)
  {
   for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
  }
static void stack_pop(Stack<Integer> stack){
System.out.println("Pop :");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop(); // did u observe change of class
            System.out.println(y);
        }
}

   static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }
  
  static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        stack_push(stack);
}

}
