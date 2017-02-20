package entidades;
import java.util.Date;


/**
 * La cita por asigar y a la que  debe asistir el paciente para ser atendido.
 * @author Gang of Seven
 * @version 1.0
 * @created 12-Feb-2017 11:17:16 AM
 */
public class Cita {

	/**
	 * Seg�n la asistencia, 1= asisti� y 0= no asisti�.
	 */
	private int asistencia;
	/**
	 * Fecha de la cita a agendar.
	 */
	private Date fecha;
	/**
	 * Fecha en la que se crea el registro.
	 */
	private Date fechaCreacion;
	/**
	 * Fecha en la que se elimina el registro.
	 */
	private Date fechaEliminacion;
	/**
	 * Fecha en la que se modifica el registro.
	 */
	private Date fechaModificacion;
	/**
	 * Hora de la cita a agendar.
	 */
	private Date hora;
	/**
	 * N�mero de la sesi�n por atender.
	 */
	private int numSesion;
	/**
	 * Id del usuario que crea el registro.
	 */
	private int usuarioCreacion;
	/**
	 * Id del usuario que elimina el registro.
	 */
	private int usuarioEliminacion;
	/**
	 * Id del usuario que modifica el registro.
	 */
	private int usuarioModificacion;
	private Consulta m_Consulta;

	public Cita(){

	}
	

	public int getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}


	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}


	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public Date getHora() {
		return hora;
	}


	public void setHora(Date hora) {
		this.hora = hora;
	}


	public int getNumSesion() {
		return numSesion;
	}


	public void setNumSesion(int numSesion) {
		this.numSesion = numSesion;
	}


	public int getUsuarioCreacion() {
		return usuarioCreacion;
	}


	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


	public int getUsuarioEliminacion() {
		return usuarioEliminacion;
	}


	public void setUsuarioEliminacion(int usuarioEliminacion) {
		this.usuarioEliminacion = usuarioEliminacion;
	}


	public int getUsuarioModificacion() {
		return usuarioModificacion;
	}


	public void setUsuarioModificacion(int usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}


	public Consulta getM_Consulta() {
		return m_Consulta;
	}


	public void setM_Consulta(Consulta m_Consulta) {
		this.m_Consulta = m_Consulta;
	}


	public void finalize() throws Throwable {

	}

}