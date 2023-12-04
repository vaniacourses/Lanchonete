package Helpers;

import static org.junit.jupiter.api.Assertions.*;

import javax.servlet.http.Cookie;
import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import DAO.DaoToken;

class ValidadorCookieTest {





    @Test
    void testGetCookieIdCliente() {
        // Create ValidadorCookie instance
        ValidadorCookie validadorCookie = new ValidadorCookie();

        // Create a cookie array with a sample token
        Cookie[] cookies = {new Cookie("token", "123-amostraToken")};

        // Call the getCookieIdCliente method and assert the result
        String resultado = validadorCookie.getCookieIdCliente(cookies);
        assertEquals("123", resultado);
    }

    @Test
    void testGetCookieIdFuncionario() {
        // Create ValidadorCookie instance
        ValidadorCookie validadorCookie = new ValidadorCookie();

        // Create a cookie array with a sample token for the employee
        Cookie[] cookies = {new Cookie("tokenFuncionario", "456-amostraToken")};

        // Call the getCookieIdFuncionario method and assert the result
        String resultado = validadorCookie.getCookieIdFuncionario(cookies);
        assertEquals("456", resultado);
    }
    
    //Mutante1
    /*
	 * 
	 * 
    @Test
    void testGetCookieMutanteConditionalOperatorReplacement1IdCliente() {
        // Create ValidadorCookie instance
        ValidadorCookieMutanteConditionalOperatorReplacement1 validadorCookie = new ValidadorCookieMutanteConditionalOperatorReplacement1();

        // Create a cookie array with a sample token
        Cookie[] cookies = {new Cookie("token", "123-amostraToken")};

        // Call the getCookieIdCliente method and assert the result
        String resultado = validadorCookie.getCookieIdCliente(cookies);
        assertEquals("123", resultado);
    }
    */
    
    /*
	 * 
	 * 
    @Test
    void testGetCookieMutanteConditionalOperatorReplacement1IdFuncionario() {
        // Create ValidadorCookie instance
        ValidadorCookieMutanteConditionalOperatorReplacement1 validadorCookie = new ValidadorCookieMutanteConditionalOperatorReplacement1();

        // Create a cookie array with a sample token for the employee
        Cookie[] cookies = {new Cookie("tokenFuncionario", "456-amostraToken")};

        // Call the getCookieIdFuncionario method and assert the result
        String resultado = validadorCookie.getCookieIdFuncionario(cookies);
        assertEquals("456", resultado);
    }
    
   */
   
    
    //Mutante2
    /*
	 * 
	 * 
    @Test
    void testGetCookieMutanteConditionalOperatorReplacement2IdCliente() {
        // Create ValidadorCookie instance
        ValidadorCookieMutanteConditionalOperatorReplacement2 validadorCookie = new ValidadorCookieMutanteConditionalOperatorReplacement2();

        // Create a cookie array with a sample token
        Cookie[] cookies = {new Cookie("token", "123-amostraToken")};

        // Call the getCookieIdCliente method and assert the result
        String resultado = validadorCookie.getCookieIdCliente(cookies);
        assertEquals("123", resultado);
    }
    */

    
    /*
	 * 
	 * 
    @Test
    void testGetCookieMutanteConditionalOperatorReplacement2IdFuncionario() {
        // Create ValidadorCookie instance
        ValidadorCookieMutanteConditionalOperatorReplacement2 validadorCookie = new ValidadorCookieMutanteConditionalOperatorReplacement2();

        // Create a cookie array with a sample token for the employee
        Cookie[] cookies = {new Cookie("tokenFuncionario", "456-amostraToken")};

        // Call the getCookieIdFuncionario method and assert the result
        String resultado = validadorCookie.getCookieIdFuncionario(cookies);
        assertEquals("456", resultado);
    }
    */
}
