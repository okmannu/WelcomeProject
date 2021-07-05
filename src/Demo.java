
class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.a = 10;
        obj.b = 20;
        obj.demo();
        obj.run();

        System.out.println("total number is = "+obj.total);
    }
}

class Demo {
     int a, b, total;

   public void demo() {
         total = a + b;
     }

  public void run() {
        System.out.println("i am runing");
    }


}

