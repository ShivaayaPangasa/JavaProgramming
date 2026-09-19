package Module3.Q02_RunnableReverse;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        ReverseTask task = new ReverseTask("Multithreaading");

        Thread thread = new Thread(task);

        thread.start();
        thread.join();
    }
}

class ReverseTask implements Runnable{
    private final String text;
    ReverseTask(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int index = text.length() -1; index >= 0; index--){
            System.out.println(text.charAt(index));
        }
    }
}