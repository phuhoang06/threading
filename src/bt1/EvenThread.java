package bt1;

// Lớp EvenThread để in ra các số chẵn
class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                Thread.sleep(15); // Chờ 15ms trước khi in số tiếp theo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Even: " + i);
        }
    }
}
