package montañanorusa;
import java.io.File;

import java.util.Scanner;

public class RecorridodeMontaña {
	private int vec[];
	public RecorridodeMontaña(String nombreArch,Carrito car1)
	{
		File fr = new File(nombreArch);
		try {
			
			Scanner sc = new Scanner(fr);
			this.vec =new int [sc.nextInt()];
			for(int i=0; i < this.vec.length; i++)
			{
				this.vec[i] = sc.nextInt();
			}
			int x=sc.nextInt();
			car1.setY(this.vec[0]-x);
			car1.setX(x);
			car1.setAsc(car1.getY());
		}catch(Exception e) {e.printStackTrace();}

		}
	public void resolver(Carrito car)
	{
		int i=1;
		int DistanciaRecorrida=car.getY()-this.vec[i];
		car.setAsc(car.getAsc()-1);
		int Alturaascenso = this.vec[i+1] ;
		
		while(Alturaascenso <= car.getAsc())
		{	
			
			////////////ASCENSO////////////////
			DistanciaRecorrida+=this.vec[i+1]-this.vec[i];
			i++;	//Apunta a una cima
			
			///////////DESCENSO////////////////
			DistanciaRecorrida+=this.vec[i]-this.vec[i+1];
			car.setAsc(car.getAsc()-1);
			i++;	//Apunta a un valle
			Alturaascenso=this.vec[i+1];
			
		}
		// i queda apuntando a un valle
		
		DistanciaRecorrida+=car.getAsc();
		car.setY(car.getAsc());
		car.setX(DistanciaRecorrida);
	
	}
	
	}
	

