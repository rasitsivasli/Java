package _____OSA_____.OCA_Tum_Sorular.Q215_Exeption_Tekrar;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class App {
    public static void main(String[] args) throws  LogFileException{ // line 2
         App obj=new App();
         try {
             obj.open();
             obj.process();
                  //insert code here // line 7

         }catch (Exception e){
             System.out.println("completed.");
         }
    }
    public void  process() {  // line 13
        System.out.println("Processed");
//        throw new LogFileException();
   }
    public void open() {  // line 17
        System.out.println("Opened.");
        throw new AccessViolationException();

    }
}
/*    Which action fixes the compiler error?
        A. At line 17, add throws AccessViolationException
        B. At line 13, add throws LogFileException
        C. At line 2, replace throws LogFileException with throws AccessViolationException
        D. At line 7, insert throw new LogFileException ();





Answer: D cvp B i think
*/