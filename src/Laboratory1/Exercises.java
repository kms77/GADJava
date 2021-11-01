package Laboratory1;

public class Exercises {
    public void arrays(){
        char[] copyFrom = {'d', 'e', 'c', 'a' , 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println("copyTo: " + new String(copyTo));
        char [] copyToSecond = java.util.Arrays.copyOfRange(copyFrom, 2, 7);
        System.out.println("copyToSecond: " + new String(copyTo));
    }
}
