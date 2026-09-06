class Solution {
    public int calPoints(String[] op) {
       Stack<Integer> stack=new Stack<>();
       int score=0;
       for(int i=0;i<op.length;i++){
        String ch=op[i];
        

        if(ch.equals("+")){
            int top=stack.pop();
            int top2=stack.peek();
            int sum=top+top2;
            stack.push(top);
            stack.push(sum);
            score+=sum;
        }
        else if(ch.equals("D")){
            int top=stack.peek();
            top=top*2;
            stack.push(top);
            score+=top;
        }
        else if(ch.equals("C")){
            score-=stack.pop();
        }
        else{
            int k=Integer.parseInt(ch);
            stack.push(k);
            score+=k;
        }
       }
       return score;

    }
}