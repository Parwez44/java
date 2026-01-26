class ClassA {
    int x;

    ClassA(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class ClassB {
    int y;

    ClassB(int y) {
        this.y = y;
    }

    int getY() {
        return y;
    }
}

class ClassC {
    int z;

    ClassC(int z) {
        this.z = z;
    }

    int addValues(ClassA a, ClassB b) {
        return a.getX() + b.getY() + z;
    }
}

public class asgnmnt03{
    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 20;
        int c = args.length > 2 ? Integer.parseInt(args[2]) : 30;

        ClassA objA = new ClassA(a);
        ClassB objB = new ClassB(b);
        ClassC objC = new ClassC(c);

        int result = objC.addValues(objA, objB);
        System.out.println(result);
    }
}
