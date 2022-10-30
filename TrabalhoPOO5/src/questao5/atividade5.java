package questao5;

import java.util.Scanner;


public class atividade5 {
	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		double Nota1[]=new double[10];
		double Nota2[]=new double[10];
		double Result[]=new double[10];
		//Media:total das soma das notas pelo numero de notas
		for(int i=0;i<Nota1.length;i++) {
			System.out.println("Insira a primeira nota,do aluno "+(i+1)+":");
			Nota1[i]=scanf.nextDouble();
			System.out.println("Insira a segunda nota,do aluno " +(i+1)+":");
			Nota2[i]=scanf.nextDouble();
			Result[i]=Nota1[i]+Nota2[i];
			
			
			//System.out.println(Result[i]);
				
		}
		
		for(int i=0;i<10;i++) {
			Result[i]=Result[i]/2;
			if(Result[i]>=7) {
				System.out.println("aluno: "+(i+1)+"  Parabens, Aprovado!:Media:"+Result[i]);
			}else {
				System.out.println("aluno: "+(i+1)+"  Sinto Muito, Reprovado!:Media:"+Result[i]);
			}
		
		}
		

	
	}

}
