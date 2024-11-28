package bt;

public class ThreadExample {
    public static void main(String[] args) {
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 Thread với NumberGenerator làm tham số
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt priority cho các thread
        thread1.setPriority(Thread.MAX_PRIORITY);  // Thứ tự ưu tiên cao nhất
        thread2.setPriority(Thread.MIN_PRIORITY);  // Thứ tự ưu tiên thấp nhất

        // In ra thông tin về priority của các thread
        System.out.println("Thread1 Priority: " + thread1.getPriority());
        System.out.println("Thread2 Priority: " + thread2.getPriority());

        // Bắt đầu chạy 2 thread
        thread1.start();
        thread2.start();
    }
}