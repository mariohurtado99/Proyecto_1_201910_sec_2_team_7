package api;

import model.data_structures.LinkedList;
import model.vo.VOMovingViolations;

/**
 * Interface para los servicios de MovingViolationManager
 * @author Mario Hurtado
 */
public interface IMovingViolationsManager {

	/**
	 * M�todo para cargar la informaci�n de los archivos
	 * @param movingViolationsFile 
	 */
	void loadMovingViolations(String movingViolationsFile);
	
	/**
	 * M�todo para cargar la informaci�n de los archivos por c�digo de violaci�n.
	 * @param violationCode C�digo de violaci�n.
	 * @return Lista con las violaciones por c�digo.
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode);
	
	/**
	 * M�todo que obtiene las infracciones por accidente.
	 * @param accidentIndicator String que representa el indicador del accidente.
	 * @return Lista con los las infracciones por accidente.  
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator);

	
}
