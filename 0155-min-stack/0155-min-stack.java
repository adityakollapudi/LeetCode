class pair{
    int element;
    int min;
    public pair(int element,int min){
        this.element=element;
        this.min=min;
    }
}

class MinStack {
    ArrayList<pair> li;
   // int min;

    public MinStack() {
        li=new ArrayList<>();
    }
    
    public void push(int value) {
        if(li.size()==0){
            li.add(new pair(value,value));
        }else{
           int min=Math.min(value,li.get(li.size()-1).min);
            li.add(new pair(value,min));
        }
    }
    
    public void pop() {
        li.remove(li.size()-1);
    }
    
    public int top() {
        return li.get(li.size()-1).element;
    }
    
    public int getMin() {
        return li.get(li.size()-1).min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */