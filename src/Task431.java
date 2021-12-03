public class Task431 {
    public static void sbTest() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
