package api;

import model.data_structures.LinkedList;
import model.vo.VOMovingViolations;

/**
 * Interface para los servicios de MovingViolationManager
 * @author Mario Hurtado
 */
public interface IMovingViolationsManager {

	/**
	 * Método para cargar la información de los archivos
	 * @param movingViolationsFile 
	 */
	void loadMovingViolations(String movingViolationsFile);
	
	/**
	 * Método para cargar la información de los archivos por código de violación.
	 * @param violationCode Código de violación.
	 * @return Lista con las violaciones por código.
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode);
	
	/**
	 * Método que obtiene las infracciones por accidente.
	 * @param accidentIndicator String que representa el indicador del accidente.
	 * @return Lista con los las infracciones por accidente.  
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator);

	
}
