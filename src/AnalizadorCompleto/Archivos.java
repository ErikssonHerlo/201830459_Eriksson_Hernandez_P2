package lenguajesproyecto2;


import java.io.BufferedReader;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErikssonHerlo
 */
public class Archivos {
    
    public String leerTxt (String direccion){
        
        String texto = "";

        try{
             BufferedReader bf = new BufferedReader(new FileReader(direccion));
             String temp = "";
             String bfRead;
             while((bfRead = bf.readLine())!=null){ // hasta que bfread no tenga datos
                  temp = temp + bfRead; // En este punto ya se guardo el texto
             }
             texto = temp;
             
   
        }catch(Exception e){
            System.err.println("No se encontro ningun archivo, ingreselo de nuevo");
        }
        return texto;
    }
    
}
