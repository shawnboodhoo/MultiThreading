public class MyThread implements Runnable{

    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i=0; i <= 5; i++){
            System.out.println(i + " " + "from thread number" + " " +threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
