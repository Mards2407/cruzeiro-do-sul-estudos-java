import java.io.*;
import java.io.File;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
public class ManipulacaoDeArquivosTextoEmJava {
public static void main(String[] args) {
/** iremos manipular dados em java que são textos em bloco de notas a biblioteca mais usada e a java.io
 * e iremos começar agora
 */
/** Verificando se o objeto faz referência a um arquivo ou diretório (pasta) existente. */
    File arquivo = new File("c: atividades armazenamento || teste dados.txt");
    if (arquivo.exists()) {
        System.out.println("o arquivo existe!!!");
/** o arquivo.exists serve para procurar o diretorio no computador e se existe */
    } else {
        System.out.println("o arquivo e inexistente!!!");

    }
/** ------------------------------------------------------------------------------- */
/** Para verificar se o objeto faz referência a um diretório (pasta) */
    if (arquivo.isDirectory()) {
        System.out.println("o objeto do arquivo faz referencia a um diretorio");
/** o is directory e o diretorio do arquivo */
    } else {
        System.out.println("o objeto do arquivo não faz referencia a um diretorio");
    }

/** a mesma coisa acima   */
    if (arquivo.isFile()) {
        System.out.println("isto e um arquivo mesmo!!!");

    } else {
        System.out.println("não exite um aquivo mesmo sorry");
    }
    File teste = new File("C:\\Users\\dougl\\OneDrive\\Área de Trabalho\\teste.txt");
/** essa forma pode verificar se o arquivo pode ser lido*/
    if (teste.canRead()) {
        System.out.println("o arquivo pode ser lido!!");
    } else {
        System.out.println("infelismente não consigo ler o aquivo!!");
    }
/** agora uma forma se pode escrever!! */
    if (teste.canWrite()) {
        System.out.println("o arquivo pode ser escrito!");
    } else {
        System.out.println("o arquivo não pode ser escrito");
    }
/** Para criar um novo diretório (pasta) a partir do diretório corrente */
    File arquivo2 = new File("TesteExemplo");
/**if (arquivo2.mkdir()){
 System.out.println("o diretorio foi criado com sucesso!");
 }
 else{
 System.out.println("não foi criado o diretorio");
 }*/
/**Para criar uma hierarquia de diretórios (pastas) */
/**if (arquivo2.mkdir()){
 System.out.println("foi criado uma vasta de diretorios");
 }
 else{
 System.out.println("não foi");
 }*/

/** Para alterar o nome de um arquivo */

    File teste2 = new File("C:\\Users\\dougl\\Downloads\\oi.txt");
//File teste2Rename = new File("c:\\Users\\dougl\\Downloads\\oi.txt");
//if (teste2.renameTo(teste2Rename)){
    System.out.println("o arquivo foi renomeado com sucesso!");
//}
//else{
// System.out.println("o arquivo falhou a renomeação");
//}
/** agora descobrir o tamanho do arquivo! */
    long tamanhoArquivo = teste2.length();
    System.out.println(" o tamanho do arquivo é : " + tamanhoArquivo + " claro em bytes k ");

/** ver a data de criação do arquivo */

long tempoDeUltimaAtualizacao;
Date tempo = new Date();
tempoDeUltimaAtualizacao = teste2.lastModified();
tempo.setTime(tempoDeUltimaAtualizacao);
    System.out.println("a ultima atualização foi : " +  tempo.getSeconds() + " segundos ");

    /** esse exclui */
/**if (arquivo2.delete()){
    System.out.println("foi removido");
}
else{
    System.out.println("não foi removido");
}*/
/** agora vamos cirar realmente arquivos colocando coisas com o filewriter */

File escrever = new File("c:\\Users\\dougl\\Downloads\\ArquivoFeitoEmComandoJava.txt");
//try{
//    FileWriter criar = new FileWriter(escrever,true);
//    System.out.println("o objeto excretor foi criado com sucesso! ");
//    criar.close();
//}
//catch(IOException e){
//    System.out.println("não foi possivel criar o objeto excretor!" + e.getMessage());
}
/** Gravando um caractere em um arquivo texto */
String gravar = "bibliotaca java file funcionando com sucesso!!";
File escrever2 = new File("c:\\users\\dougl\\Downloads\\ArquivoFeitoEmComandoJava.txt");
//try{
//    FileWriter criar2 = new FileWriter(escrever2, true);
//    criar2.write(gravar);
//    criar2.close();
//    System.out.println("o texto foi escrito com sucesso!!");}
//catch(IOException d){
//    System.out.println("não foi colocado o texto no arquivo!" + d.getMessage());
//}








}