package view;

import java.util.Scanner;

import controller.Controller;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.vo.VOMovingViolations;

/**
 * Clase que maneja lo que se va a mostrar en consola al correr la aplicaci�n.
 * @author Mario Hurtado
 *
 */
public class MovingViolationsManagerView 
{
	/**
	 * M�todo main para que la aplicaci�n corra.
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
			 * Switch para que se ejecute la instrucci�n que haya escogido el usuario.
			 */
			switch(option)
			{
				case 1:
					System.out.println("Ingrese el cuatrimestre");
					Controller.loadMovingViolations(sc.next());
					System.out.println("Listo");
					break;
					
				case 2:
					System.out.println("Ingrese el c�digo de la infracci�n:");
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
			}
		}
	}

	/**
	 * M�todo que imprime en la consola el men� para que el usuario elija la opci�n que desee.
	 */
	private static void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Taller 2----------------------");
		System.out.println("1. Cree una nueva coleccion de infracciones en movimiento");
		System.out.println("2. Dar listado de infracciones reportadas dado un c�digo de infracci�n");
		System.out.println("3. Dar listado de infracciones reportadas de acuerdo a si hay o no accidente reportado");
		System.out.println("4. Salir");
		System.out.println("Digite el n�mero de opci�n para ejecutar la tarea, luego presione enter: (Ej., 1):");
		
	}
}
