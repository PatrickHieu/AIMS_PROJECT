package hust.soict.dsai.aims.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long start, end;

        //String
        String str = "";
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Time with String: " + (end - start) + " ms");

        //StringBuffer
        StringBuffer strb = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (end - start) + " ms");

        //StringBuilder
        StringBuilder strbd = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strbd.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end - start) + " ms");
    }
}
