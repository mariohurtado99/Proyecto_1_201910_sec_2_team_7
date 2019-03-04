package api;

import model.data_structures.ILinkedList;
import model.data_structures.IQueue;
import model.data_structures.IStack;
import model.data_structures.LinkedList;
import model.data_structures.Queue;
import model.data_structures.Stack;
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
	LinkedList<VOMovingViolations> loadMovingViolations(String movingViolationsFile);

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

	public ILinkedList<VOMovingViolations> verificarObjectID();

	public IQueue<VOMovingViolations> ConsultarInfraccionesFecha(String fechaInicial,String fechaFinal) throws Exception;
	
	public String darPromedio(String pViolationCode, LinkedList<VOMovingViolations>cargado);
	
	public String darDesvEstandar(String pViolationCode);
	
	public double deudaTotal (String pFechaInicial, String pFechaFinal) throws Exception;

	public IStack<VOMovingViolations> ConsultarInfraccionesDireccion(String fechaInicial,String fechaFinal, String pAdressId) throws Exception;

	public IQueue ConsultarInfraccionesPromedioRango(String min, String max);

    public Stack ConsultarInfraccionesPagadoRango(int min2, int max2, String orden);

	public IQueue ConsultarInfraccionesFecha2(String fechaInicial2, String fechaFinal2);
}
