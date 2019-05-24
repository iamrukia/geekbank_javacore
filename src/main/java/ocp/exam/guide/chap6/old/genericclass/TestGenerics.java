package ocp.exam.guide.chap6.old.genericclass;

public class TestGenerics<T> {
    T anInstance;
    T[] anArrayOfTs;

    TestGenerics(T anInstance) {
        this.anInstance = anInstance;
    }

    T getT() {
        return anInstance;
    }
}
