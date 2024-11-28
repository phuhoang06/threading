package bt1;

// Lớp OddThread để in ra các số lẻ
class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            try {
                Thread.sleep(10); // Chờ 10ms trước khi in số tiếp theo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Odd: " + i);
        }
    }
}

