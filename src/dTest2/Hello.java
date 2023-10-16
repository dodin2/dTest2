package dTest2;

public class Hello {
    String msg = "hello";

    public Hello(String msg) {
        this.msg = msg;
    }

    public void say() {
        say(this.msg);
    }

    public void say(String msg) {
        System.out.println(msg);
    }
}
