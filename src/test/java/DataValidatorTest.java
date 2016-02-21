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
        assertTrue(DataValidator.isValidEnhancedUsername("abc"));
        assertTrue(DataValidator.isValidEnhancedUsername("a_bc"));
        assertTrue(DataValidator.isValidEnhancedUsername("a1bc"));
        assertTrue(DataValidator.isValidEnhancedUsername("abcdefghijklm123456789101"));
        assertFalse(DataValidator.isValidEnhancedUsername("_abc"));
        assertFalse(DataValidator.isValidEnhancedUsername("a b"));
        assertFalse(DataValidator.isValidEnhancedUsername("1ab"));
        assertFalse(DataValidator.isValidEnhancedUsername("abcdefghijklm12345678902425"));
    }

    @Test
    public void testDataValidator_isValidIPAddress(){
        assertTrue(DataValidator.isValidIPAddress("111.111.111"));
        assertTrue(DataValidator.isValidIPAddress("255.255.255"));
        assertTrue(DataValidator.isValidIPAddress("000.000.000"));
        assertFalse(DataValidator.isValidIPAddress("111111111"));
        assertFalse(DataValidator.isValidIPAddress("111.111111"));
        assertFalse(DataValidator.isValidIPAddress("111.111.1111"));
        assertFalse(DataValidator.isValidIPAddress("256.111.111"));
        assertFalse(DataValidator.isValidIPAddress("111.256.111"));
        assertFalse(DataValidator.isValidIPAddress("111.111.256"));

    }

}
