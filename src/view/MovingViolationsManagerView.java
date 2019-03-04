package view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import controller.Controller;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Queue;
import model.data_structures.Stack;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;

/**
 * Clase que maneja lo que se va a mostrar en consola al correr la aplicación.
 * @author Mario Hurtado
 *
 */
public class MovingViolationsManagerView 
{
	/**
	 * Método main para que la aplicación corra.
	 * @param args Arreglo de Strings.
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean fin=false;
		while(!fin)
		{
			printMenu();

			int option = sc.nextInt();

			/**
			 * Switch para que se ejecute la instrucción que haya escogido el usuario.
			 */
			switch(option)
			{
			case 1:
				System.out.println("Ingrese el Cuatrimestre");
				Controller.loadMovingViolations(sc.next());
				System.out.println("Listo");
				break;

			case 2:
				System.out.println("Ingrese el código de la infracción:");
				String violationCode = sc.next();
				LinkedList<VOMovingViolations> violationsByCodeList = Controller.getMovingViolationsByViolationCode (violationCode);
				System.out.println("Se encontraron "+ violationsByCodeList.getCounter() + " elementos");
				for (VOMovingViolations violations : violationsByCodeList) 
				{
					System.out.println(violations.getObjectId() + " " + violations.getLocation() + " " + violations.getTicketIssue()+ " " + violations.getPaid() + " " + violations.getAccidentId()+ " " + violations.getViolationDesc());
				}
				break;

			case 3:
				System.out.println("Ingrese el indicador de Accidente que quiere consulta (No/Yes):");
				String accidentIndicator = sc.next();
				LinkedList<VOMovingViolations> violationsByAccidentsList = Controller.getMovingViolationsByAccident (accidentIndicator);
				System.out.println("Se encontraron "+ violationsByAccidentsList.getCounter() + " elementos");
				for (VOMovingViolations violations : violationsByAccidentsList) 
				{
					System.out.println(violations.getObjectId() + " " + violations.getLocation() + " " + violations.getTicketIssue()+ " " + violations.getPaid() + " " + violations.getAccidentId()+ " " + violations.getViolationDesc());
				}
				break;

			case 4:	
				fin=true;
				sc.close();
				break;
			case 5:
				int contador = 0;
				System.out.println("PASO1");
				LinkedList<VOMovingViolations> repetidasList = Controller.verificarObjectID();
				for (int i=0; i<repetidasList.size(); i++) {
					if (repetidasList.get(i) != null)
						contador++;
				}
				System.out.println("Se encontraron "+ contador+ " elementos repetidos:");
				for (VOMovingViolations violations : repetidasList) 
				{
					System.out.println(violations.getObjectId() + " " + violations.getLocation() + " " + violations.getTicketIssue()+ " " + violations.getPaid() + " " + violations.getAccidentId()+ " " + violations.getViolationDesc());
				}
				break;
			case 6:	

				System.out.println("Ingrese la fecha inicial de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaInicial=sc.next();
				System.out.println("Ingrese la fecha final de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaFinal=sc.next();

				try {
					Queue<VOMovingViolations> resultado = Controller.ConsultarInfraccionesFecha(fechaInicial,fechaFinal);
					for (VOMovingViolations violations : resultado) 
					{
						System.out.println(violations.getObjectId() + " " + violations.getLocation() + " " + violations.getTicketIssue()+ " " + violations.getPaid() + " " + violations.getAccidentId()+ " " + violations.getViolationDesc());
					}
					
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
				
			case 7:
				System.out.println("Ingrese el Violation Code: ");
				String codigo = sc.next();
				System.out.println(Controller.darPromedio(codigo));
				break;
				
			case 8:
				System.out.println("Ingrese la fecha inicial de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaInicial1 = sc.next();
				System.out.println("Ingrese la fecha final de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaFinal1 = sc.next();
				System.out.println("Ingrese la dirección de la infracción a consultar: ");
				String direccion = sc.next();

				try {
					Stack<VOMovingViolations> resultado = Controller.ConsultarInfraccionesDireccion(fechaInicial1,fechaFinal1, direccion);
					for (VOMovingViolations violations : resultado) 
					{
						System.out.println(violations.getObjectId() + " " + violations.getTicketIssue() + " " + violations.getSegid() + " " + violations.getAddressId());
					}
					
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
				
			case 9:
				System.out.println("Ingrese valor mínimo");
				String min = sc.next();
				System.out.println("Ingrese valor máximo");
				String max = sc.next();
				Controller.ConsultarInfraccionesPromedioRango(min,max);
				break;
				
			case 10:
				System.out.println("Ingrese valor mínimo");
				int min2 = Integer.parseInt(sc.next());
				System.out.println("Ingrese valor máximo");
				int max2 = Integer.parseInt(sc.next());
				System.out.println("1 para orden ascendente, 0 para orden descendente (1/0)");
				String orden = sc.next();
				
				try {
					Stack<VOMovingViolations> resultado = Controller.ConsultarInfraccionesPagadoRango(min2,max2,orden);
					for (VOMovingViolations violations : resultado) 
					{
						System.out.println(violations.getObjectId() + " " + violations.getTicketIssue() + " " + violations.getPaid());
					}
					
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
				
				
			case 11:
				System.out.println("Ingrese la fecha inicial de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaInicial2 = sc.next();
				System.out.println("Ingrese la fecha final de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaFinal2 = sc.next();
				try {
					Queue<VOMovingViolations> resultado = (Queue<VOMovingViolations>) Controller.ConsultarInfraccionesFecha2(fechaInicial2,fechaFinal2);
					for (VOMovingViolations violations : resultado) 
					{
						System.out.println(violations.getObjectId() + " " + violations.getTicketIssue() + " " + violations.getViolationDesc());
					}
					
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 12:
				System.out.println("Ingrese el Violation Code: ");
				String codigo2 = sc.next();
				System.out.println(Controller.darDesvEstandar(codigo2));
				break;
				
			case 15:
				System.out.println("Ingrese la fecha inicial de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaInicial3 = sc.next();
				System.out.println("Ingrese la fecha final de la consulta: (formato dd-mm-yyyy hh:mm:ss)");
				String fechaFinal3 = sc.next();

				try {
					double resultado = Controller.deudaTotal(fechaInicial3,fechaFinal3);
					System.out.println("La deuda total es: " + resultado);
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			}


		}
	}

	/**
	 * Método que imprime en la consola el menú para que el usuario elija la opción que desee.
	 */
	private static void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Proyecto 1----------------------");
		System.out.println("1. Cree una nueva coleccion de infracciones en movimiento");
		System.out.println("2. Dar listado de infracciones reportadas dado un código de infracción");
		System.out.println("3. Dar listado de infracciones reportadas de acuerdo a si hay o no accidente reportado");
		System.out.println("4. Salir");
		System.out.println("5. [1.A] Verificar si el OBJECTID es identificador único");
		System.out.println("6. [2.A] Consultar infracciones por fecha");
		System.out.println("7. [3.A] Informar el FINEAMT promedio (accidentes)");
		System.out.println("8. [4.A] Consultar infracciones en una dirección");
		System.out.println("9. [1.B] Consultar tipo de infracciones con FINEAMT en un rango dado");
		System.out.println("10. [2.B] Consultar infrancciones cantidad pagada en rango dado");
		System.out.println("11. [3.B] Consultar infrancciones por fecha y ordenar por violationdesc");
		System.out.println("12. [4.B] Informar el FINEAMT promedio y la desviación estándar");
		System.out.println("15. [3.C] Consultar deuda total por rango de fechas");
		System.out.println("Digite el número de opción para ejecutar la tarea, luego presione enter: (Ej., 1):");

	}  
}
