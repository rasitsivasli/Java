package _____OSA_____.OCA_Tum_Sorular.Q118_Equals;

public class App {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String("java");
        //line1
        if(str2.equals(str1.toLowerCase())) // burası yok soruda
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
/*
Which code fragment, when inserted at line n1, enables the App class to print Equal?
 A)  Str1.toLowerCase();
     if(str1=str2)
  B) if(str2.equals(str1.toLowerCase()))

        {
 C)  Str1.toLowerCase();
     if(str1.equals(str2))
 D)  if(str1.toLowerCase()==str2.toLowerCase())
 A. Option A
 B. Option B
 C. Option C
 D. Option D
 Answer: B


 */