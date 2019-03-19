/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import com.mycompany.pruebasunitarias.Inicio;
import com.mycompany.pruebasunitarias.Persona;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johann alejandro torres soler 
 */
public class NewEmptyJUnitTest {
    /**
 *
 *se llama al mapa 
 */
    public static HashMap<Integer, Persona> mapaAbuelo;
    static Inicio pp; 
    
    @BeforeClass
    public  static void setUpClass() {
       pp = new Inicio();
       quemadoTest();
    }
    
    public static void quemadoTest(){  
        /**
 *
 *mapa quemado en el test 
 */
        mapaAbuelo = new HashMap<>();
        mapaAbuelo.put(1, new Persona(1, "Juan"));
        mapaAbuelo.put(2, new Persona(2, "Jose"));
        mapaAbuelo.get(1).getDatos().put(3, new Persona(3, "Andres"));
        mapaAbuelo.get(1).getDatos().put(4, new Persona(4, "Maria"));
        mapaAbuelo.get(1).getDatos().put(5, new Persona(5, "Carlos"));
        mapaAbuelo.get(2).getDatos().put(6, new Persona(6, "Alberto"));
        mapaAbuelo.get(2).getDatos().put(7, new Persona(7, "Jimmy"));
        mapaAbuelo.get(2).getDatos().put(8, new Persona(8, "Jhon"));
        mapaAbuelo.get(1).getDatos().get(3).getDatos().put(9, new Persona(9, "Juana"));
        mapaAbuelo.get(1).getDatos().get(3).getDatos().put(10, new Persona(10, "Paola"));
        mapaAbuelo.get(1).getDatos().get(4).getDatos().put(11, new Persona(11, "Sofia"));
        mapaAbuelo.get(1).getDatos().get(5).getDatos().put(12, new Persona(12, "Jaime"));
        mapaAbuelo.get(2).getDatos().get(6).getDatos().put(13, new Persona(13, "Tatiana"));
        mapaAbuelo.get(2).getDatos().get(6).getDatos().put(14, new Persona(14, "Fernanda"));
        mapaAbuelo.get(2).getDatos().get(7).getDatos().put(15, new Persona(15, "Viviana"));
        mapaAbuelo.get(2).getDatos().get(8).getDatos().put(16, new Persona(16, "Diana"));
    }
    
    @AfterClass
    public  static void tearDownClass() {
    }
    
    
    @Test
    public void Abuelo(){
        /**
 *respuesta quemada por defecto  para el  abuelo 
 *
 */
        String respuesta="Juan Andres Maria Carlos Juana Paola Sofia Jaime";
        String menu = pp.buscar(1);
        assertEquals(respuesta,menu);
    }
    
    @Test
    public void Padre(){
        /**
 *respuesta quemada pord efecto para el padre 
 *
 */
        String resp1="Andres Juan Juana Paola";
        String menu1 = pp.buscar(3);
        assertEquals(resp1, menu1);
    }
    
    @Test
    public void Hijo(){
        /**
 *respuesta quemada por defecto  para el hijo 
 *
 */
        String resp2 = "Juana Andres Juan";
        String menu2 = pp.buscar(9);
        assertEquals(resp2, menu2);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
