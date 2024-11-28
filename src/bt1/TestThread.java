package bt1;

// Lớp TestThread để tạo và chạy các thread
public class TestThread {
    public static void main(String[] args) {
        // Tạo 2 đối tượng OddThread và EvenThread
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Chạy OddThread trước
        oddThread.start();
        try {
            // Dùng join() để đảm bảo OddThread hoàn thành trước khi EvenThread bắt đầu
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sau khi OddThread kết thúc, bắt đầu EvenThread
        evenThread.start();
    }
}
