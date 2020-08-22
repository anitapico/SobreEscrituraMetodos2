/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodo2;

/**
 *
 * @author Jonathan Aguaiza, Ana Pico
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo{
    private String nombrePropietario;
    private int numeroCedula;
    private int edadPropietario;
    private String marca;
    private String tecnologia;
    private int modelo;
    public Vehiculo(){
        nombrePropietario="";
        numeroCedula=0;
        edadPropietario=0;
        marca="";
        tecnologia="";
        modelo=0;
    }
    public Vehiculo(String nombrePropietario,int numeroCedula,int edadPropietario,
            String marca, String tecnologia, int modelo){
        this.nombrePropietario=nombrePropietario;
        this.numeroCedula=numeroCedula;
        this.edadPropietario=edadPropietario;
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
    }
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public int getNumeroCedula(){
        return numeroCedula;
    }
    public int getEdadPropietario(){
        return edadPropietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario,int numeroCedula,int edadPropietario, 
            String marca, String tecnologia, int modelo){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        matriculaAutomovil="Desconocido";
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil\nMARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    }
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia; 
    }
    public AutomovilAutonomo(String nombrePropietario,int numeroCedula,int edadPropietario, 
            String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil Autonomo\n MARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil()+"\nFECHA DE FABRICACION: "
               +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    }
    
} 


class ListadoAutomoviles{
    private ArrayList<Automovil>ListadoAutomoviles;
    //Constructor
    public ListadoAutomoviles(){
        ListadoAutomoviles=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoAutomoviles.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTE EN EL LISTADO \n");
        for(Automovil ObjetoTmp:ListadoAutomoviles){
            ObjetoTmp.mostrarDatos();{
            }
        }
    }  
}

class ListadoPropietarios{
    private ArrayList<Automovil>ListadoPropietarios;
    //Constructor
    public ListadoPropietarios(){
        ListadoPropietarios=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoPropietarios.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("DATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO: \n");
        for(Automovil ObjetoTmp:ListadoPropietarios){
            ObjetoTmp.mostrarDatos1();{
            }
        }
    }  
}

public class SobreEscrituraMetodo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACIÓN");
        System.out.println("CARRERA: INGENIERIA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println("ALUMNO: Aguaiza Jonathan, Pico Anita");
        System.out.println(" ");
        System.out.println("      Tarea de Sobre Escritura de Metodos");
        ////////////////////////////////////////////////////////////////////////
        Scanner seleccione = new Scanner(System.in);
        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;
        ////////////////////////////////////////////////////////////////////////
        while(true){
        do{
            System.out.println("\n\t\t BIENVENIDO AL CENTRO DE INFORMACIÓN VEHICULAR");
            System.out.println("[1] DATOS DEL AUTOMOVIL");
            System.out.println("[2] DATOS DEL PROPIETARIO\n");
            System.out.print("Seleccione la opción deseada ");
            System.out.println();
            opcion = seleccione.nextInt();
            
            
            switch(opcion){
                
                case 1:
                    
  System.out.println("            \nSE CONOCE LOS DATOS DE UN DOS AUTOMOVIL DE LA MARCA.");
  System.out.println("[1] FORD");
  System.out.println("[2] NISSAN\n");
  System.out.print("Seleccione la opción deseada");
  System.out.println();
  opcion1 = seleccione.nextInt();
  switch(opcion1){
                        case 1:
  Automovil automovil1=new Automovil("",0,0,"Ford","TECNOLOGIA: Canadiense\n",2018);
  automovil1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
  ListadoAutomoviles listado1=new ListadoAutomoviles();
  listado1.addAutomovil(automovil1);
  listado1.Listar();break;
       
                        case 2:
  Calendar fecha1=Calendar.getInstance();
  fecha1.set(2019,10,22);//Los meses van de 0 a 11, luego 10 representa noviembre
  AutomovilAutonomo autonomo1=new AutomovilAutonomo("",0,0,"Nissan","TECNOLOGIA: EUROPEA\n",2020,fecha1);
  ListadoAutomoviles listado2=new ListadoAutomoviles();
  listado2.addAutomovil(autonomo1);
  listado2.Listar();break;
                        
                    }break;
                case 2:
                    
  System.out.println("            \nSE CONOCE LOS DATOS DE DOS PROPIETARIOS DE VEHICULOS.");
  System.out.println("[1] PROPIETARIO 1: DUEÑO DEL VEHÍCULO FORD.");
  System.out.println("[2] PROPIETARIO 2: DUEÑO DEL VEHÍCULO NISSAN\n");
  System.out.print("Seleccione la opción deseada");
  System.out.println();
  opcion2 = seleccione.nextInt();
           switch(opcion2){
           case 1:                     
  Automovil automovil2=new Automovil("Aguaiza Jonathan -- Propietario del Vehículo Ford",254135964,21,"","",0);
  automovil2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
  ListadoPropietarios listado3=new ListadoPropietarios();
  listado3.addAutomovil(automovil2);
  listado3.Listar();break;
        case 2:
  Automovil autonomo2=new Automovil("Pico Anita -- Propietario del Vehículo Nissan",1542367896,20,"","",0);
  autonomo2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
  ListadoPropietarios listado4=new ListadoPropietarios();
  listado4.addAutomovil(autonomo2);
  listado4.Listar();
  System.out.println("\n"
        + "Seleccione la opción deseada:\n"
        + "[0] Para salir del programa.\n"
        + "[1] Para repetir el menu.\n");
                  
        opcion3 = seleccione.nextInt();
        switch(opcion3){
                  
   case 0: System.out.println("\t\tUSTED A SALIDO DEL PROGRAMA QUE TENGA UN BUEN DÍA.");System.exit(0);break;
                                } break;        
                    } break;
      default : System.out.println("La opcion seleccionada no existe vuelva a seleccionar.\n");break;
            }
        }while(opcion!=2);
        }      
    }   
}
