package bt;

class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500); // Dừng 500ms trước khi in số tiếp theo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // In số tự nhiên và hashCode của đối tượng
            System.out.println("Number: " + i + " from Thread with hashCode: " + this.hashCode());
        }
    }
}
