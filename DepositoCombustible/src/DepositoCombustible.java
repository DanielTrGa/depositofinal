/**
 * DepositoCombustible es una clase que representa el depósito de gasolina de
 * un coche Un objeto DepositoCombustible agrupa la información necesaria para
 * describir el estado del depósito:
 * <ul>
 * <li>depMax capacidad del depósito
 * <li>depNivel nivel de gasolina del depósito
 * </ul>
 * 
 * class invariante 0.0 &lt;= depNivel &lt;= depMax
 * 
 * @author IES Seveero Ochoa Team
 * @version 1.0
 *
 */
public class DepositoCombustible {

	private static double depMax;
	private static double depNivel;

	/**
	 * DepositoCombustible es el constructor de la clase.
	 * 
	 * <hr>
	 * <br>
	 * precondición depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax() <br>
	 * postcondición depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax()
	 * <hr>
	 * 
	 * @param tankMax   es la cantidad de combustible (medida en litros) que cabe en
	 *                  el depósito
	 * @param tankLevel es la cantidad de combustible (medida en litros) que
	 *                  contiene el depósito inicialmente
	 * 
	 */
	DepositoCombustible(double tankMax, double tankLevel) {
		this.depMax = tankMax;
		this.depNivel = tankLevel;
	}

	/**
	 * getDepositoNivel es un método para obtener información
	 * 
	 * @return la cantidad de combustible en el depósito
	 */
	public static double getDepositoNivel() {
		return depNivel;
	}

	/**
	 * getDepositoMax es un método para obtener información
	 * 
	 * @return la capacidad (en litros) del depósito
	 */
	public static double getDepositoMax() {
		return depMax;
	}

	/**
	 * estaVacio da información del estado
	 * 
	 * @return <code>true</code> si el depósito está vacio <code>false</code> en
	 *         otro caso.
	 */
	public static boolean estaVacio() {
		return depNivel == 0;
	}

	/**
	 * estaLleno información del estado
	 * 
	 * @return <code>true</code> si el depósito está lleno <code>false</code> en
	 *         otro caso.
	 */
	public static boolean estaLleno() {
		return depNivel == depMax;
	}

	/**
	 * llenar es un método que efectúa cambios añadiendo combustible al depósito
	 * 
	 * <hr>
	 * <br>
	 * precondicion 0.0 &lt; amount &lt;= getDepositoMax() - getDepositoNivel() <br>
	 * postcondicion no vacio <br>
	 * postcondicion depNivel &gt; depNivel_inicial
	 * <hr>
	 * 
	 * @param amount Cantidad de combustible que añade
	 * 
	 */
	public static void fill(double amount) {
		depNivel = depNivel + amount;
	}

	/**
	 * consumir es un método que efectua cambios reduciendo el combustible del
	 * depósito
	 * 
	 * @param amount cantidad de fuel consumida
	 * 
	 */
	public static void consumir(double amount) {
		depNivel = depNivel - amount;
	}
}
