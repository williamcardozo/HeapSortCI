package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for heap sort.
 */
public class HeapSortTest {
    private HeapSort heap = new HeapSort();

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void deveConseguirOrdenarNumerosPositivos() {
        int[] arrayEsperado = {1, 2, 3, 4};
        int[] array = {3, 1, 2, 4};

        heap.sort(array);

        assertArrayEquals(arrayEsperado, array);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void deveConseguirOrdenarNumerosNegativos() {
        int[] arrayEsperado = {-4, -3, -2, -1};
        int[] array = {-3, -1, -2, -4};

        heap.sort(array);

        assertArrayEquals(arrayEsperado, array);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void deveConseguirOrdenarNumerosPositivosENegativos() {
        int[] arrayEsperado = {-4, -3, -2, -1, 2, 5, 7, 11};
        int[] array = {-3, -1, -2, 7, 5, 11, 2, -4};

        heap.sort(array);

        assertArrayEquals(arrayEsperado, array);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    void deveConseguirOrdenarNumerosPositivosENegativosComZero() {
        int[] arrayEsperado = {-4, -3, -2, -1, 0, 2, 5, 7, 11};
        int[] array = {-3, -1, 0, -2, 7, 5, 11, 2, -4};

        heap.sort(array);

        assertArrayEquals(arrayEsperado, array);
    }

}
