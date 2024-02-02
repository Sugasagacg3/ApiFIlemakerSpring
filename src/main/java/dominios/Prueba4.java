package dominios;

public class Prueba4 {
	
	String ClavePrincipal;
	String CreadoPor;
	
	
	public Prueba4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prueba4(String clavePrincipal, String creadoPor) {
		super();
		ClavePrincipal = clavePrincipal;
		CreadoPor = creadoPor;
	}
	public String getClavePrincipal() {
		return ClavePrincipal;
	}
	public void setClavePrincipal(String clavePrincipal) {
		ClavePrincipal = clavePrincipal;
	}
	public String getCreadoPor() {
		return CreadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		CreadoPor = creadoPor;
	}
	@Override
	public String toString() {
		return "Prueba4 [ClavePrincipal=" + ClavePrincipal + ", CreadoPor=" + CreadoPor + "]";
	}
	

}
