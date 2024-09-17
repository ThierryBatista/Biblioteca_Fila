package model;

public class FilaInt {

	   No inicio;
	   No fim;
	 
	   public FilaInt() {
		   inicio = null;
		   fim = null;
	   }
	   
	   public boolean isEmpty() {
		   if (inicio == null && fim == null) {
			   return true;
		   } return false;
	   }
	   
	   public void insert(int valor) {
		   No elemento = new No();
		   elemento.dado = valor;
		   elemento.proximo = null;
		   if(isEmpty()) {
			   fim = elemento;
			   inicio = fim;
		   } else {
			   fim.proximo = elemento;
			   fim = elemento;
		   }
	   }
	   
	   
	   public int remove() throws Exception {
		   if (isEmpty()) {
			   throw new Exception("Fila Vazia");
		   }
		   int valor = inicio.dado;
		   if(inicio == fim && inicio != null) {
			   inicio = null;
			   fim = inicio;
		   } else {
			   inicio = inicio.proximo;
		   } return valor;
	   }  
	   
	   
}
