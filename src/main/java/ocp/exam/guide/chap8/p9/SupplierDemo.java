package ocp.exam.guide.chap8.p9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<List<Double>> readingsSupplier =
                () -> Arrays.asList(405.91, 405.98, 406.14, 406.48, 406.20, 406.03);

        Map<String, String> map = new HashMap<>();

    }
}
