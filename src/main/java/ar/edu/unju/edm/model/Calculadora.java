package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
		private int num1;
		private int num2; 
		
		public Calculadora() {
			// TODO Auto-generated constructor stub
		}

		public int sumar() {
			return num1 + num2;
		}
		public int resta() {
			
			return  num1 - num2;
		}

		public int multiplicar() {
			
				return num1*num2;
		}
		public int division() {
				
			return num1/num2;
		}
		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public int getNum2() {
			return num2;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}

		@Override
		public String toString() {
			return "Calculadora [num1=" + num1 + ", num2=" + num2 + ", getNum1()=" + getNum1() + ", getNum2()="
					+ getNum2() + ", sumar()=" + sumar() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

		

	//	public void setNum1(Double valueOf) {
			// TODO Auto-generated method stub
			
	//	}

		

		
		
}
