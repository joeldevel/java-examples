public class TryCatch {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 100;
            System.out.println("" + y + "/" + x + " = " + y/x);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("this is finally block");
            System.out.println("All that's novelty is but oblivion");
        }
    }
}
