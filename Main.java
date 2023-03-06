import java.util.Scanner;

public class Main {
    //static Vector<Especialidad>especialidad=new Vector<Especialidad>();
    public static Scanner dato=new Scanner(System.in);
    public static Scanner datoline=new Scanner(System.in);
    public static void main(String[] args) {
        int opc=0;
        do{
            opc=menu();
            switch (opc){
                case 1:
                    //altaEspecialidad();
                    break;
                case 2:
                    //altaAlumno();
                    break;
                case 3:
                    //altaCatedratico();
                    break;
                case 4:
                    //altaMateria();
                    break;
                case 5:
                    //altaGrupo();
                    break;
                case 6:
                    //ImprimirBD();
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("... opcion no valida!");
                    break;
            }
        }while (opc!=6);
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
}
