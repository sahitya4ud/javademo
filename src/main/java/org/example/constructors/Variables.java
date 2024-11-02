package org.example.constructors;

public class Variables {
    private int instanceNumber;
    private static int staticNumber;

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(int instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public static int getStaticNumber() {
        return staticNumber;
    }

    public static void setStaticNumber(int staticNumber) {
        Variables.staticNumber = staticNumber;
    }
}
