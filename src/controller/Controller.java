package controller;

import api.IMovingViolationsManager;
import model.data_structures.IQueue;
import model.data_structures.LinkedList;
import model.data_structures.Queue;
import model.data_structures.Stack;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;

/**
 * Clase que controla las acciones del view y las envía al modelo.
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
	 * Método que carga la información de la ruta que entra por parámetro.
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

	public static LinkedList <VOMovingViolations> verificarObjectID() {
		return  manager.verificarObjectID();
		
	}

	public static Queue<VOMovingViolations> ConsultarInfraccionesFecha(String fechaInicial, String fechaFinal) throws Exception {
		// TODO Auto-generated method stub
		return (Queue<VOMovingViolations>) manager.ConsultarInfraccionesFecha(fechaInicial,fechaFinal);
	}
	
	public static String darPromedio(String pViolationCode) {
		return manager.darPromedio(pViolationCode);
	}
	
	public static String darDesvEstandar(String pViolationCode) {
		return manager.darDesvEstandar(pViolationCode);
	}
	
	public static double deudaTotal(String pFechaInicial, String pFechaFinal) throws Exception{
		return manager.deudaTotal(pFechaInicial, pFechaFinal);
	}
	
	public static Stack<VOMovingViolations> ConsultarInfraccionesDireccion(String fechaInicial, String fechaFinal, String pAdressId) throws Exception {
		// TODO Auto-generated method stub
		return (Stack<VOMovingViolations>) manager.ConsultarInfraccionesDireccion(fechaInicial,fechaFinal, pAdressId);
	}

	public static IQueue ConsultarInfraccionesPromedioRango(String min, String max) {
		return manager.ConsultarInfraccionesPromedioRango(min,max);
		
	}

	public static Stack ConsultarInfraccionesPagadoRango(int min2, int max2, String orden) {
		// TODO Auto-generated method stub
		return manager.ConsultarInfraccionesPagadoRango( min2, max2,  orden);
	}

	public static IQueue ConsultarInfraccionesFecha2(String fechaInicial2, String fechaFinal2) {
		// TODO Auto-generated method stub
		return manager.ConsultarInfraccionesFecha2(fechaInicial2,fechaFinal2);
	}
}
