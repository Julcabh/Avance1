/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julian.avance1;

/**
 *
 * @author Julian
 */
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileOutputStream;


public class GenerarPDF {
    public static void main(String[] args) {
        // Crear el documento pdf
        Document document = new Document();
        try {
            // Escribir el documento en un archivo pdf
            PdfWriter.getInstance(document, new FileOutputStream( "C:/Users/Julian Caballero/Desktop/Documentos/archivo.pdf"));

            // Abrir el documento
            document.open();

            // Agregar un parrafo al documento
            String texto = "!Hola mundo¡";
            Paragraph paragraph = new Paragraph(text);
            document.add(paragraph);

            document.close();

        } catch (FileNotFoundException e ){
            e.printStackTrace();
        }
    }
}