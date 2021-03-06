package entidades;


/**
 * Almacena la selecci�n de la respuesta.
 * @author Gang of Seven
 * @version 1.0
 * @created 12-Feb-2017 11:17:17 AM
 */
public class Respuesta {

	/**
	 * Atributo que guarda cualquier otra posible respuesta que se quiera agregar y no
	 * est� en el cat�logo.
	 */
	private String otros;
	/**
	 * Atributo que guarda si se selecciona una respuesta o no.
	 */
	private int seleccion;

	public Respuesta(){

	}
	

	public String getOtros() {
		return otros;
	}


	public void setOtros(String otros) {
		this.otros = otros;
	}


	public int getSeleccion() {
		return seleccion;
	}


	public void setSeleccion(int seleccion) {
		this.seleccion = seleccion;
	}


	public void finalize() throws Throwable {

	}

}