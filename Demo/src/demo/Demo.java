/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author stefa
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à POO usando JAVA","Prof. Rafael Santos","Campus","2003","g11p17",false);

         System.out.println("\n --------------- Livro --------------- \n");
         System.out.println(L1.getDados());

         if (!L1.getEmprestado())
         {
            System.out.println(" O livro Introdução à POO usando JAVA foi emprestado com sucesso!");
            L1.Empresta();
         }
         else
         {
            System.out.println(" O livro Introdução à POO usando JAVA foi devolvido com sucesso!");
            System.out.println(" Poderá ser emprestado!\n");
         }
    }
    }

