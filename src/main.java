public class main {
    public static void main(String[] args) {
        // Creando e iniciando un nuevo hilo utilizando runnable
        Runnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("Dentro del metodo main");
        // Cambio la prioridad del hilo
        t.setPriority(Thread.MAX_PRIORITY);
        //t.setPriority(Thread.MIN_PRIORITY);
        try {
            // Detenemos temporalmente
            t.sleep(1000); // 1000 milliseconds
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Dentro de mi metodo 2");
    }
}
