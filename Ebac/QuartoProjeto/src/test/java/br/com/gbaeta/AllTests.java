/**
 * 
 */
package br.com.gbaeta;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author GuilhermeBaeta
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
