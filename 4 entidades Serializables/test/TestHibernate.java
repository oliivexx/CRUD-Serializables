

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestHibernate {
    
    public TestHibernate() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void test_constructor_clase_insituto() {
        Instituto inst = new Instituto("Cristo Rey", "Granada", "San Gregorio");
        Assert.assertEquals("Cristo Rey", inst.getNombre());
        Assert.assertEquals("Granada", inst.getProvincia());
        Assert.assertEquals("San Gregorio", inst.getCalle());
    }
    
    @Test
    public void test_constructor_clase_profesor() {
        Profesor profe = new Profesor("Jaime", "Matas", "687236487H");
        Assert.assertEquals("Jaime", profe.getNombre());
        Assert.assertEquals("Matas", profe.getApellido());
        Assert.assertEquals("687236487H", profe.getDni());
    }
    
    
    @Test
    public void test_comprobar_añadido_correctamente_instituto(){
        int longArray, longArray2;
        ClaseTest test1 = new ClaseTest();
        
        longArray = test1.institutos.size();
        test1.añadirInstituto();
        longArray2 = test1.institutos.size();
        
        Assert.assertEquals(longArray2, longArray + 1);
    }
    
    
    @Test
    public void test_comprobar_añadido_correctamente_profesor(){
        int longArray, longArray2;
        ClaseTest test1 = new ClaseTest();
        
        longArray = test1.profesores.size();
        test1.añadirProfesor();
        longArray2 = test1.profesores.size();
        
        Assert.assertEquals(longArray2, longArray + 1);
    }
}
