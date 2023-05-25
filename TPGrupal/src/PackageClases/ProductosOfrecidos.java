package PackageClases;

public abstract class ProductosOfrecidos implements Comparable<ProductosOfrecidos> {
	protected String nombre;
	
	protected String tipo;
	
	protected int precio;
	
	protected double tiempo;
	
	protected int cupo;

	public ProductosOfrecidos(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", tipo=" + tipo;
	}
	
}
