public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int count =0;

        try{
            while(true){
                Thread.sleep(2000);
                System.out.println("I'm still here counting " + count++);
            }
        }catch(InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }

}
