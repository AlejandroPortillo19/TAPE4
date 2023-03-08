package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class Main {
    static ArrayList<Especialidad> especialidades=new ArrayList<Especialidad>();
    static ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
    static Vector<Catedratico> catedraticos=new Vector<Catedratico>();
    static ArrayList<Materia> materias=new ArrayList<Materia>();
    static ArrayList<Grupo> grupos=new ArrayList<Grupo>();

    public static Scanner dato=new Scanner(System.in);
    public static Scanner datoline=new Scanner(System.in);
    public static void main(String[] args) {
        int opc=0;
        do{
            opc=menu();
            switch (opc){
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    altaAlumno();
                    break;
                case 3:
                    altaCatedratico();
                    break;
                case 4:
                    //altaMateria();
                    break;
                case 5:
                    altaGrupo();
                    break;
                case 6:
                    ImprimirBD();
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("... opcion no valida!");
                    break;
            }
        }while (opc!=7);
    }
    public static int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.Alta Especialidad");
        System.out.println("2.Alta Alumnno");
        System.out.println("3.Alta Catedratico");
        System.out.println("4.Alta Materia");
        System.out.println("5.Alta Grupo");
        System.out.println("6.ImprimirBD");
        System.out.println("7.Salir");
        System.out.println("Seleccione una opcion");
        return dato.nextInt();
    }
    public static void altaEspecialidad(){
        int id;
        String nombre;
        System.out.println("Ingresa el Id Especialidad");
        id= dato.nextInt();
        System.out.println("Ingresa el Nombre Especialidad");
        nombre=datoline.nextLine();
        especialidades.add(new Especialidad(id,nombre));
    }
    public static void altaCatedratico(){
        String rfc,nombre;
        System.out.println("Ingresar el Rfc Catedratico");
        rfc=datoline.nextLine();
        System.out.println("Ingresar el Nombre Catedratico");
        nombre=datoline.nextLine();
        catedraticos.addElement(new Catedratico(rfc,nombre));
    }

    public  static void altaAlumno() {
        Especialidad especialidad;
        System.out.println("Ingresar el Numero de Control del Alumno");
        int numControl = dato.nextInt();
        System.out.println("Ingresar el Nombre del Alumno");
        String nombre = datoline.nextLine();
        System.out.println("Ingresar la Especialidad del Alumno");
        int idEspecialidad = dato.nextInt();
        alumnos.add(new Alumno(numControl,nombre,especialidades.get(idEspecialidad-1)));
    }
    public static void altaGrupo(){
        
    }
    public static void ImprimirBD(){
        System.out.println("\nEspecialidad");
        for (int i=0; i<especialidades.size();i++){
            System.out.println(especialidades.get(i).toString());
        }
        for (int i=0; i<alumnos.size();i++){
            System.out.println(alumnos.get(i).toString());
        }
        for (int i=0; i<materias.size();i++){
            System.out.println(materias.get(i).toString());
        }
        for (int i=0; i<catedraticos.size();i++){
            System.out.println(catedraticos.get(i).toString());
        }
    }
}
