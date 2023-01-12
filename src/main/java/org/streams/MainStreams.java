package org.streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MainStreams {
    public static void main(String[] args) {
        List<String> sarasas = Arrays.asList("a9", "a2", "b9", "b3", "b5", "b6", "bc8", "ba7");
        List<String> modifikuotasSarasas;
        //modifikuotasSarasas = sarasas.stream().filter(elements -> elements.contains("9")).map(elements->elements + "_"+ LocalTime.now().getNano()).toList();
        //System.out.println(modifikuotasSarasas);
        sarasas.stream().filter(elements ->elements.contains("x")).map(elements -> elements + "_" + UUID.randomUUID()).forEach(System.out::println);
    }

}
