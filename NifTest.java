import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NifTest {
    @Test
    public void testCalcularLetra() {
        // Arrange
        int numero = 5; // Pon el número que quieras aquí para probar

        // Act
        char letraCalculada = NifTest.calcularLetra(numero);

        // Assert
        char letraEsperada = 'A'; // Reemplaza esto con la letra esperada para el número proporcionado
        assertEquals(letraEsperada, letraCalculada);
    }

    private static char calcularLetra(int numero) {
        return 0;
    }
}
