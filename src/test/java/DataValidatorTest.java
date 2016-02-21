/**
 * Created by simonhamermesh on 2/21/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class DataValidatorTest {

    @Test
    public void testDataValidator_isValidUsername(){
        assertTrue(DataValidator.isValidUsername("abc"));
        assertFalse(DataValidator.isValidUsername("ab"));
        assertFalse(DataValidator.isValidUsername("a b"));
        assertFalse(DataValidator.isValidUsername("abc1"));
        assertFalse(DataValidator.isValidUsername("Abc"));
        assertFalse(DataValidator.isValidUsername("acbdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testDataValidator_isValidEnhancedUsername(){
        assertTrue(DataValidator.isValidUsername("abc"));
        assertTrue(DataValidator.isValidUsername("a_bc"));
        assertTrue(DataValidator.isValidUsername("a1bc"));
        assertFalse(DataValidator.isValidUsername("_abc"));
        assertFalse(DataValidator.isValidUsername("a b"));
        assertFalse(DataValidator.isValidUsername("1ab"));
    }

    @Test
    public void testDataValidator_isValidIPAddress(){
        assertTrue(DataValidator.isValidUsername("111.111.111"));
        assertTrue(DataValidator.isValidUsername("255.255.255"));
        assertTrue(DataValidator.isValidUsername("000.000.000"));
        assertFalse(DataValidator.isValidUsername("111111111"));
        assertFalse(DataValidator.isValidUsername("111.111111"));
        assertFalse(DataValidator.isValidUsername("111.111.1111"));
        assertFalse(DataValidator.isValidUsername("256.111.111"));
        assertFalse(DataValidator.isValidUsername("111.256.111"));
        assertFalse(DataValidator.isValidUsername("111.111.256"));

    }

}
