public class Main {

    public static void main(String[] args) {

        for (int i =0; i <= 3; i++){
            MyThread myThread = new MyThread(i);
            Thread myThreadObject = new Thread(myThread);
            myThreadObject.start();
            try {
                myThreadObject.join();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

        System.out.println("==========================");

        MyThread myThread2 = new MyThread();

        Thread myThreadObject = new Thread(myThread2);

        myThreadObject.setDaemon(true);

        System.out.println("is daemon " + myThreadObject.isDaemon());

        myThreadObject.start();

        System.out.println("is alive " + myThreadObject.isAlive());
        // is alive currently executing a thread

        myThreadObject.setName("hi im thread");

        System.out.println("name " + myThreadObject.getName());

        System.out.println("priority " + myThreadObject.getPriority());

        System.out.println("active count " + Thread.activeCount());







    }


}
