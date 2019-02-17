package model.logic;


import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.time.Clock;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;




public class MovingViolationsManager implements IMovingViolationsManager {

	
	ILinkedList<VOMovingViolations> listaViolaciones;
	
	
	public void loadMovingViolations(String movingViolationsFile){
//		listaViolaciones= new CsvToBeanBuilder(new FileReader(movingViolationsFile)).withType(VOMovingViolations.class).build().parse();
		System.out.println("ejecuto");
		if(movingViolationsFile.equals("1")) {
			System.out.println("1 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("path enero"));
				String [] nextLine;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {
						

						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
												,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
												,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					CSVReader reader2 = new CSVReader (new FileReader ("path feb"));
					String [] nextLine2;

					reader2.readNext();
					while ((nextLine2 = reader2.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
										,nextLine2[14],nextLine2[15],nextLine2[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader3 = new CSVReader (new FileReader ("path marzo"));
					String [] nextLine3;

					reader3.readNext();
					while ((nextLine3 = reader3.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
										,nextLine3[14],nextLine3[15],nextLine3[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader4 = new CSVReader (new FileReader ("path abril"));
					String [] nextLine4;

					reader4.readNext();
					while ((nextLine4 = reader4.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
										,nextLine4[14],nextLine4[15],nextLine4[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					
				System.out.println("terminado"+System.currentTimeMillis());
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(movingViolationsFile.equals("2")) {
			System.out.println("2 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("path enero"));
				String [] nextLine;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {
						

						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
												,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
												,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					CSVReader reader2 = new CSVReader (new FileReader ("path feb"));
					String [] nextLine2;

					reader2.readNext();
					while ((nextLine2 = reader2.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
										,nextLine2[14],nextLine2[15],nextLine2[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader3 = new CSVReader (new FileReader ("path marzo"));
					String [] nextLine3;

					reader3.readNext();
					while ((nextLine3 = reader3.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
										,nextLine3[14],nextLine3[15],nextLine3[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader4 = new CSVReader (new FileReader ("path abril"));
					String [] nextLine4;

					reader4.readNext();
					while ((nextLine4 = reader4.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
										,nextLine4[14],nextLine4[15],nextLine4[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					
				System.out.println("terminado"+System.currentTimeMillis());
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(movingViolationsFile.equals("3")) {
			System.out.println("3 aquiiii");
			try {
				listaViolaciones= new LinkedList<>();
				CSVReader reader = new CSVReader (new FileReader ("path enero"));
				String [] nextLine;
				try {
					reader.readNext();
					while ((nextLine = reader.readNext()) != null) {
						

						VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
												,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
												,nextLine[14],nextLine[15],nextLine[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					CSVReader reader2 = new CSVReader (new FileReader ("path feb"));
					String [] nextLine2;

					reader2.readNext();
					while ((nextLine2 = reader2.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine2[0],nextLine2[1],nextLine2[2],nextLine2[3],nextLine2[4],nextLine2[5],nextLine2[6]
								,nextLine2[7],nextLine2[8],nextLine2[9],nextLine2[10],nextLine2[11],nextLine2[12],nextLine2[13]
										,nextLine2[14],nextLine2[15],nextLine2[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader3 = new CSVReader (new FileReader ("path marzo"));
					String [] nextLine3;

					reader3.readNext();
					while ((nextLine3 = reader3.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine3[0],nextLine3[1],nextLine3[2],nextLine3[3],nextLine3[4],nextLine3[5],nextLine3[6]
								,nextLine3[7],nextLine3[8],nextLine3[9],nextLine3[10],nextLine3[11],nextLine3[12],nextLine3[13]
										,nextLine3[14],nextLine3[15],nextLine3[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
					CSVReader reader4 = new CSVReader (new FileReader ("path abril"));
					String [] nextLine4;

					reader4.readNext();
					while ((nextLine4 = reader4.readNext()) != null) {


						VOMovingViolations mV =new VOMovingViolations(nextLine4[0],nextLine4[1],nextLine4[2],nextLine4[3],nextLine4[4],nextLine4[5],nextLine4[6]
								,nextLine4[7],nextLine4[8],nextLine4[9],nextLine4[10],nextLine4[11],nextLine4[12],nextLine4[13]
										,nextLine4[14],nextLine4[15],nextLine4[16]);
						listaViolaciones.add(mV);
						System.out.println("mapeando");
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					
				System.out.println("terminado"+System.currentTimeMillis());
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getViolationCode().
						equals(violationCode)) {
					resp.add(listaViolaciones.get(i));
				}
			}
		}
		return resp;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getAccidentId().
						equals(accidentIndicator)) {
					resp.add(listaViolaciones.get(i));
				}
			}
		
		}
		return resp;
	}	


}
