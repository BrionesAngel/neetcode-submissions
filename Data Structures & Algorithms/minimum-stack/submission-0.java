class MinStack {
    List<Integer> stack;
    int minIdx;
    public MinStack() {
        this.stack=new LinkedList<>();
        this.minIdx=0;
    }
    
    public void push(int val) {
        this.stack.add(val);
        if(val<this.stack.get(this.minIdx))
            this.minIdx=this.stack.size()-1;
    }
    
    public void pop() {
        if(!this.stack.isEmpty()){
            int num=this.stack.removeLast();

            if(!this.stack.isEmpty() && this.stack.size()-1<this.minIdx){
                int min=this.stack.get(0);
                this.minIdx=0;
                for(int i=0; i<this.stack.size(); i++){
                    if(this.stack.get(i)<min) this.minIdx=i;
                }
            }
        }
            
    }
    
    public int top() {
        if(this.stack.isEmpty()) return -1;
        return this.stack.get(this.stack.size()-1);
    }
    
    public int getMin() {
        if(this.stack.isEmpty()) return -1;
        return this.stack.get(this.minIdx);
    }
}
