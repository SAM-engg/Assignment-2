class Outer {

    class Inner {
        void show() {
            System.out.println("This is inner class.");
        }
    }


    void displayInner() {
        Inner in = new Inner();
        in.show();
    }
}


interface MyInterface {
    void display();
}


public class InnerclassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.displayInner();


        MyInterface obj = new MyInterface() {
            @Override
            public void display() {
                System.out.println("This is anonymous class.");
            }
        };

        obj.display();
    }
}
