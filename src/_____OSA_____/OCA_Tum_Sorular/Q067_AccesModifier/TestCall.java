package _____OSA_____.OCA_Tum_Sorular.Q067_AccesModifier;


class Caller {
    private void init() {
        //private cannot access
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }

}

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
       /* c.start();
        c.init();*/


    }
}

//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.





//Answer: D

