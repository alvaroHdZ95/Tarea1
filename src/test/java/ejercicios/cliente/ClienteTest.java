package ejercicios.cliente;

import ejercicios.cliente.Cliente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente c;

    @BeforeEach
    public void setUpTest(){
        this.c = new Cliente();
    }

    @Test
    @DisplayName("Constructor No Nulo")
    public void constructorNotNullTest(){
        assertNotNull(c);
    }

    @Test
    @DisplayName("Constructor Esperado")
    public void constructorExpectedContentTest(){
        assertEquals("", c.getNombre());
        assertEquals("", c.getApellido());
        assertEquals("", c.getDni());
        assertEquals("", c.getEmail());
        assertNull(c.getFechaNacimiento());
    }

    @Test
    @DisplayName("Nombre Completo Correcto")
    public void getFullNameTest(){
        c.setNombre("Pepín");
        c.setApellido("Gálvez");
        assertEquals("Pepín Gálvez", c.getNombreCompleto());
    }
}
