package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen <= 7 && estado && volumen >= 0? volumen: this.volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal <= 120 && estado && canal >= 1? canal: this.canal;
	}
	
	public void setNombre(int canal) {
		this.canal = canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		canal = canal < 120 && estado? canal + 1: canal; 
	}
	
	public void canalDown() {
		canal = canal > 1 && estado? canal - 1: canal; 
	}
	
	public void volumenUp() {
		volumen = volumen < 7 && estado? volumen + 1: volumen; 
	}
	
	public void volumenDown() {
		volumen = volumen > 0 && estado? volumen - 1: volumen; 
	}
}
