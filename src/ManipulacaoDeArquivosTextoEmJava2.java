import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class ManipulacaoDeArquivosTextoEmJava2 {
public static void main(String[] args) {
    String teste = "texto feito em comando java e adicionado com a bibliotaca java.io!!";
File arquivo = new File("c:\\users\\dougl\\Downloads\\ArquivoFeitoEmComandoJava.txt");
try{
    FileWriter test2 = new FileWriter(arquivo);
    test2.write(teste);
    test2.close();
    System.out.println("Arquivo gravado com sucesso!!!");
}catch(IOException ex){
    System.out.println("não funcionou" + ex.getMessage());
}















}}