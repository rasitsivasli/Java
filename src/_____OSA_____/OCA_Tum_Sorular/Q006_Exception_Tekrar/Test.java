package _____OSA_____.OCA_Tum_Sorular.Q006_Exception_Tekrar;

import java.io.IOException;

class X {

    public void printFileContent() throws IOException {

        throw new IOException();  //bu satiri düzelt
    }
}
public class Test {

    public static void main(String[] args) {
        X xobj = new X();
        try {
            xobj.printFileContent();
        } catch (IOException e) {
            System.out.println("Main bitti");
        }

    }
}

    /* Which two modifications should you make so that
        the code compiles successfully? (Choose two.)
        A. try {
               xobj.printFileContent();
            }
            catch(Exception e)  { }
            catch(IOException e) { }
        B. Replace line 7 with throw IOException(Exception raised);
        C. Replace line 11 with public static void main(String[] args) throws IOException {
        D. At line 14, insert throw new IOException();
        E. Replace line 5 with public void printFileContent() throws IOException {








Answer C E
 */
