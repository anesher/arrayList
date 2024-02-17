package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList <Contactos> listaContactos=new ArrayList <Contactos>();
        int opcion=1;
        while(opcion!=3) {
            System.out.println("1. introducir contactos");
            System.out.println("2. mostrar listas");
            System.out.println("3. Buscar Telefono ");
            System.out.println("4. Borrar contacto");
            System.out.println("0. Salir");

            System.out.println("Opcion: ");
            opcion=sc.nextInt();
            //hace este next line para que el intro no me salga como nombre
            sc.nextLine();

            if(opcion==1){
                //introducimos contactos
                System.out.println("Nombre : ");
                String nombre=sc.nextLine();

                System.out.println("telefono");
                String tfno=sc.nextLine();

                Contactos contacto =new Contactos(nombre,tfno);
                System.out.println("Introduciendo el contacto...");
                listaContactos.add(contacto);

            }else if (opcion==2){

                /*Primera forma mostar lista de contactos
                for (int i = 0; i < listaContactos.size(); i++) {
                    System.out.println(listaContactos.get(i));
                }*/

                //Segunda Forma que tiene Arraylist para mostrar contactos
                for(Contactos contacto: listaContactos){
                    System.out.println(contacto);
                }

            }else if(opcion==3){
                System.out.println("Introduzca el nombre del contacto");
                String nombre=sc.nextLine();

                /*primera forma para buscar el telefono
                    for(int i=0; i<listaContactos.size();i++){
                        //utilizo el equals para comparar el nombre
                        if (listaContactos.get(i).getNombre().equals(nombre)){
                            System.out.println("El telefono es "+listaContactos.get(i).getTelefono());
                        }
                    }*/

                //segunda forma para buscar un contacto
                Contactos contacto=new Contactos();
                contacto.setNombre(nombre);
                //me devuelve la posicion que esta y sino esta es -1
                int pos=listaContactos.indexOf(contacto);
                // como si no esta en la lista es -1 ponemos una condicional para que nos meta en donde esta la posicon
                if (pos!=-1){
                    System.out.println(listaContactos.get(pos));
                }else{
                    System.out.println("contacto no encontrado");
                }

            }else if(opcion==4){
                System.out.println("Introduzca el nombre del contacto");
                String nombre=sc.nextLine();

                Contactos contacto=new Contactos();
                contacto.setNombre(nombre);

                int pos=listaContactos.indexOf(contacto);

                if (pos!=-1){
                    System.out.println("Borrando contacto ....");
                    listaContactos.remove(pos);
                }else{
                    System.out.println("contacto no encontrado");
                }

            }
        }
        System.out.println("Limpiando contacto");
        listaContactos.clear();
    }
}
