package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    @Test
    void add() {
        int nombre1 = 10;
        int nombre2 = 2;
        Sample sample = new Sample();
        int somme = sample.op(Sample.Operation.ADD,nombre1, nombre2);

        Assertions.assertThat(somme).as("somme of 10 + 2")
            .isEqualTo(12);
    }

    @Test
    void mult() {
        int nombre1 = 10;
        int nombre2 = 2;
        Sample sample = new Sample();
        int produit = sample.op(Sample.Operation.MULT,nombre1, nombre2);
        Assertions.assertThat(produit).as("produit of 10 * 2")
            .isEqualTo(20);
    }




}
