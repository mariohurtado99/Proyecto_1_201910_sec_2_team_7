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
	 * 
	 * @param violationCode
	 * @return
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode);
	
	/**
	 * 
	 * @param accidentIndicator
	 * @return
	 */
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator);

	
}
