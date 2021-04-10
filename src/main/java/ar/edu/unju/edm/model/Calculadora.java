package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
		private float num1;
		private float num2; 
		
		public Calculadora() {
			// TODO Auto-generated constructor stub
		}

		public float sumar() {
			return num1 + num2;
		}
		public float resta() {
			
			return  num1 - num2;
		}

		public float multiplicar() {
			
				return num1*num2;
		}
		public float division(){
			
			if(num2!=0 && num1!=0)
				return num1/num2;
			else
				return 0;
			
		}
		public float getNum1() {
			return num1;
		}

		public void setNum1(float num1) {
			this.num1 = num1;
		}

		public float getNum2() {
			return num2;
		}

		public void setNum2(float num2) {
			this.num2 = num2;
		}

		

		

	

		

		
		
}
