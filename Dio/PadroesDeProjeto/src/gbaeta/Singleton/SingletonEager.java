package gbaeta.Singleton;

/**
 * Singleton 'apressado';
 * @author GuilhermeBaeta
 */

public class SingletonEager {

	private static SingletonEager instancia =  new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
