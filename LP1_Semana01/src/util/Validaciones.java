package util;

public class Validaciones {
	
		public static final String TEXTO = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{2,20}";
		public static final String DNI = "[0-9]{8}"; 
		public static final String NUM_HIJOS = "[0-9]|[1][0]"; 
		public static final String SUELDO = "(\\d+)|(\\d+[.]\\d{1,2})"; 
		public static final String PLACA = "[A-Z]{2}\\d{4}";
		public static final String CORREO = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})"; 
		
		public static final String DESCRIPCION = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{3,200}";
		public static final String PRECIO = "\\d+[.]\\d";
		public static final String PLACA_FORMA_DOS = "[A-Z]{3}\\d{3}";
		public static final String STOCK = "\\d+";
		public static final String FECHA = "((19|20)\\d\\d)[-/](0?[1-9]|1[012])[-/](0?[1-9]|[12][0-9]|3[01])";
		
		
	    public static final String CORREO_GMAIL = "[a-zA-Z]+(@gmail.com)";
	    
	    public static final String EDAD = "(10|[1-9]|91)";
	    public static final String SEXO = "[MF]";
	    public static final String DNI2 = "[3][4][0-9]{6}";
	    public static final String TEXTO2 = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\\\s]{4,30}";
	    public static final String APELLIDO = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\\\s]{4,30}";
	    public static final String DNI3 = "[1][0-9]{7}";
	    public static final String SUELDO2 = "\\d+[.]\\d";
	    public static final String PASAPORTE = "[0-9]{12}-[0-9]{2}";
	    public static final String TARJETA_CREDITO = "[0-9]{4}-[0-9]{4}-15?[1-9][1-9]-20?[1-9][1-9]";
	    public static final String CUENTA_BANCARIA = "[0]-[0][0][1][5][8]-[0-9]{5}-[0-9]{3}";

}
