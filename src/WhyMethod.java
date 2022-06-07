import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void main(String[] args) throws IOException {

        printTwoTimes("a","_");
        printTwoTimes("a","*");
        printTwoTimes("a","&");
        printTwoTimes("b","!");
        writeFileTwoTimes("a","*");

    }

    public static void printTwoTimes(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static void writeFileTwoTimes(String text, String delimiter) throws IOException {

        FileWriter fw = new FileWriter("output.txt");
        fw.write(delimiter+"\n");
        fw.write(text+"\n");
    }
}
