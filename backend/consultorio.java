
/**
 * consultorio
 */
public class consultorio {
    
    
    public static void main(String[] args) {
        int edad=48;
        System.out.println("edad: " + edad);

       Personal usuario = new Personal( "Esteban", "Perez", 48, 350000.00);
    
       usuario.nombre = "Gabina";
       usuario.apellido = "Dalgalarrondo";
       usuario.edad = 45;
       usuario.sueldo = 5000000;
    System.out.println("Nombre = " + usuario.nombre + "\n" +"Apellido = " + usuario.apellido + "\n" +"Edad = " + usuario.edad + "\n" + "Sueldo = " + usuario.sueldo);
    }
    // Query

}