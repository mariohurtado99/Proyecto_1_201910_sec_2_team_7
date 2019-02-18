package controller;

import api.IMovingViolationsManager;
import model.data_structures.LinkedList;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;

/**
 * Clase que controla las acciones del view y las env�a al modelo.
 * @author Mario Hurtado
 *
 */
public class Controller {

	/**
	 * Referencia al service manager.
	 */
	@SuppressWarnings("unused")
	private static IMovingViolationsManager  manager = new MovingViolationsManager();
	
	/**
	 * M�todo que carga la informaci�n de la ruta que entra por par�metro.
	 * @param path Ruta del archivo.
	 */
	public static void loadMovingViolations(String path) {
		manager.loadMovingViolations(path);
		
	}
	
	/**
	 * @see IMovingViolationsManager#getMovingViolationsByViolationCode(String).
	 * @param violationCode
	 * @return
	 */
	public static LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		return manager.getMovingViolationsByViolationCode(violationCode);
	}
	
	
	/**
	 * @see IMovingViolationsManager#getMovingViolationsByAccident(String).
	 * @param accidentIndicator
	 * @return
	 */
	public static LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		return manager.getMovingViolationsByAccident(accidentIndicator);
	}
}
