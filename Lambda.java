public class Lambda {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread 1 em execução.");
            }
        });
        t1.start();

        // Lambda no talo
        Thread t2 = new Thread(()-> System.out.println("Thread 2 em execução."));
        t2.start();
    }
}
