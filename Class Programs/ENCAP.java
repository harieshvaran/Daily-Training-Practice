class AccessDemo {
    public int publicVar = 100;
    protected int protectedVar = 200;
    int defaultVar = 300;
    private int privateVar = 400;

    public void showPrivate() {
        System.out.println("Private: " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }
}

public class ENCAP {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        System.out.println("Public: " + demo.publicVar);
        System.out.println("Protected: " + demo.protectedVar);
        System.out.println("Default: " + demo.defaultVar);

        demo.showPrivate();
    }
}