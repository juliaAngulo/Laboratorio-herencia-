
package herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

    protected String carnet;
    protected double promedioNotas;
    protected int numeroMaterias;
    public Estudiante(){
        
    }
    //constructor 
    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad,peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
     public int leerNumeroMaterias() {
        int materias;
        materias = leerDatoTipoEntero("Ingrese el numero de materias que ve");
        numeroMaterias=materias;
        return numeroMaterias;
    }

    public double leerNotasEstudiantes() {
        double notas;
        notas = leerDatoTipoReal("Ingrese la nota de la materia");
        return notas;
    } 
    
    public String carnet() {
       String carnet1;
       carnet1=JOptionPane.showInputDialog("Ingrese su carnet:");
       carnet=carnet1;
       return carnet; 
    }

    public double calcularPromedio() {
        int i = 0,materias;
        double nota, acumulador = 0;
        do {
            i++;
            nota = leerNotasEstudiantes();
            acumulador += nota;
        } while (i != numeroMaterias);
        materias=leerNumeroMaterias(); 
        promedioNotas = acumulador / materias;
        JOptionPane.showMessageDialog(null, promedioNotas);
        return promedioNotas;
    }

    public Estudiante ingresarDatosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String carnet;
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        
        return (nuevoEstudiante);
    }
    public void imprimirReporteDeNotas(){
        JOptionPane.showMessageDialog(null, "el nombre del estudiante es:"+getNombre());
        JOptionPane.showMessageDialog(null, "el apellido del estudiante es:"+getApellido());
        JOptionPane.showMessageDialog(null, "la edad del estudiante es:"+getEdad());
        JOptionPane.showMessageDialog(null, "el carnet del estudiante es:"+carnet());
        JOptionPane.showMessageDialog(null, "el numero de materias que ve el estudiante es:"+leerNumeroMaterias());
        JOptionPane.showMessageDialog(null, "el promedio del estudiante es:"+calcularPromedio());
    }

}
