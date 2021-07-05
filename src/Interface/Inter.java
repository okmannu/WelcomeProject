package Interface;

public interface Inter {

    public static void main(String args[]) {

        test t = new test();
                t.show();



    }
}

class If
{
    // it is public static type of it putin bydefault
    // it also used deafact and static
    void show() {

    }

    public static final int a = 10;

}

class If2{

    void dispaly(){
        System.out.println("Display");
    }
}
class test extends If{

    public void show() {
        System.out.println( "md");
    }


}

