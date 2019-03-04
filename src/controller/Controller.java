package controller;

import api.IMovingViolationsManager;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Queue;
import model.data_structures.Stack;
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
	private static IMovingViolationsManager  manager = new MovingViolationsManager();
	
	/**
	 * M�todo que carga la informaci�n de la ruta que entra por par�metro.
	 * @param path Ruta del archivo.
	 */
	public static LinkedList<VOMovingViolations> loadMovingViolations(String path) {
		return manager.loadMovingViolations(path);
		
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

	public static ILinkedList <VOMovingViolations> verificarObjectID() {
		return  manager.verificarObjectID();
		
	}

	public static Queue<VOMovingViolations> ConsultarInfraccionesFecha(String fechaInicial, String fechaFinal) throws Exception {
		// TODO Auto-generated method stub
		return (Queue<VOMovingViolations>) manager.ConsultarInfraccionesFecha(fechaInicial,fechaFinal);
	}
	
	public static String darPromedio(String pViolationCode, LinkedList<VOMovingViolations>cargado) {
		return manager.darPromedio(pViolationCode, cargado);
	}
	
	public static String darDesvEstandar(String pViolationCode) {
		return manager.darDesvEstandar(pViolationCode);
	}
	
	public static double deudaTotal(String pFechaInicial, String pFechaFinal) throws Exception{
		return manager.deudaTotal(pFechaInicial, pFechaFinal);
	}
	
	public static Stack<VOMovingViolations> ConsultarInfraccionesDireccion(String fechaInicial, String fechaFinal, String pAdressId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(fechaFinal);
		return (Stack<VOMovingViolations>) manager.ConsultarInfraccionesDireccion(fechaInicial,fechaFinal, pAdressId);
	}
}
