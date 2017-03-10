package com.ericsson.designpattern;

import java.io.*;

public interface Prototype<T> {
    default public T myClone() {
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(this);

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bin);
            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}


class ConcretePrototype implements Prototype<ConcretePrototype>, Serializable {
}

class Main {
    public static void main(String arg[]) {
        ConcretePrototype obj1 = new ConcretePrototype();
        ConcretePrototype obj2 = (ConcretePrototype) obj1.myClone();
    }

}
