public class heap {
    public static void main(String[] args) {
        Counter c = new Counter();
        three(c);
        int count = c.get();
        System.out.println(count);
    }

    public static void three(Counter c){
        c.increment();
        c.increment();
        c.increment();
    }
}

    class Counter {
        private int state = 0;
        public void increment() {   
            state++;    
        }
        public int get() {  
            return state;   
        }
    }
