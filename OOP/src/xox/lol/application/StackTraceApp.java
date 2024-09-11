package xox.lol.application;

public class StackTraceApp {

    public static void main(String[] args) {
        
        // try {
        //     String[] name = {
        //         "Budi", "tuti", "sadas",
        //     };
        //     System.out.println(name[100]);
        // } catch (Throwable throwable) {
        //     StackTraceElement[] stackTraceElements = throwable.getStackTrace();

        //     throwable.printStackTrace();
        // }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] name = {
                "Budi", "tuti", "sadas",
            };
            System.out.println(name[100]);
        } catch (Throwable throwable) {
           throw new RuntimeException(throwable);
        }
    }
    
}
