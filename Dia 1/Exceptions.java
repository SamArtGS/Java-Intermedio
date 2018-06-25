/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author cur01alu30
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* InputStream fichero = new FileWriter("Bibliotecas\\Documentos");
        
        
        FileWriter fichero;
        try{
            fichero = new FileWriter("Bibliotecas\\Documentos");
            fichero.write("Esto es un archivo");
            fichero.close();
        }catch(FileNotFoundException error){
            System.out.println("Este es un eror de"+error);
        }
        catch(IOException error){
            System.out.println("Otro tipo de error"+error);
        }
        finally{
            System.out.println("Siempre me ejecutan");
        }}
        */
       InputStream input = null;
       try{
         input = new FileInputStream("C:\\data\\input-text.txt");
         int data = input.read();
         while(data!=-1){
            //Hallar algo con el dato
            HazAlgo(data);
            data=input.read();
       }}
       catch(Exception error){
            System.out.println("Todos los errores que cometí ya no estarán");   
       }finally{
           try{
               if(input!=null) input.close();
           }
           catch(IOException error){
               System.out.println("Ya no tenemos errores :D");
           }finally{
               System.out.println("Este error no pasó");
           }
       }
    }
    private static void HazAlgo(int data){
        throw new UnsupportedOperationException("No tiene soporte");
    }
}
