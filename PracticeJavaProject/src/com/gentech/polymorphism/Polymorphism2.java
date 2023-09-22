package com.gentech.polymorphism;

interface Processor {
    void hardware();
}

class Computer implements Processor {
    public void hardware() {
        String processorName;
        String coreType;
        processorName = "Intel";
        coreType = "i5";
        System.out.println("PROCESSOR NAME: " + processorName);
        System.out.println("CORE TYPE: " + coreType);
    }
}

class Server implements Processor {
    public void hardware() {
        String processorName;
        String coreType;
        processorName = "AMD";
        coreType = "Ryzen 9";
        System.out.println("PROCESSOR NAME: " + processorName);
        System.out.println("CORE TYPE: " + coreType);
    }
}

class MobileProcessor implements Processor {
    public void hardware() {
        String processorName;
        String coreType;
        processorName = "Qualcomm";
        coreType = "Snapdragon 888";
        System.out.println("PROCESSOR NAME: " + processorName);
        System.out.println("CORE TYPE: " + coreType);
    }
}

class GraphicsCard implements Processor {
    public void hardware() {
        String processorName;
        String coreType;
        processorName = "NVIDIA";
        coreType = "GeForce RTX 3080";
        System.out.println("PROCESSOR NAME: " + processorName);
        System.out.println("CORE TYPE: " + coreType);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Processor pc = null;
        
        Computer c = new Computer();
        Server s = new Server();
        MobileProcessor mp = new MobileProcessor();
        GraphicsCard gc = new GraphicsCard();

        pc = c;
        pc.hardware(); 
        
        pc = s;
        pc.hardware(); 
        
        pc = mp;
        pc.hardware(); 
        
        pc = gc;
        pc.hardware(); 
    }
}
