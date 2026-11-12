public class funcoesMatematicaseStrings {
public static void main(String[] args){
/** funcoes matematicas serve para colocar valores como pi,log em java**/
    int r = 30;
    System.out.println("numero de pi " + Math.PI);
    System.out.println("numero de log " + Math.E);
    System.out.println("o valor da circuferencia é " + Math.PI * 2 * r);
/**  raiz quadrada usamos sqrt */
/** O método sqrt retorna a raiz quadrada de um número, porém o número do qual se deseja extrair a raiz quadrada deve ser do tipo double.
 **/
    System.out.println(Math.sqrt(9.0));

/** função random java com math */
/** ela serve para gerar numeros aleatorios */
for (int i = 1; i <= 6; i++){
    System.out.println(Math.random());
}
/** exemplo em colocar em numero inteiro */
int numeroMegasena;
    for (int i = 1; i <= 6; i++){
numeroMegasena =  (int) (Math.random ()* 60);
        System.out.println("o numero da maga sena é: " + numeroMegasena);
    }
/** string */
/** string e utilizado para fazer varias coisas como reservar nomes para comerter de MAIOR para maior e alem de comtar palavras*/
String primeiroNome = "Marco";
String segundoNome = "Aurélio";
String nome = primeiroNome +  segundoNome;
    System.out.print(nome);
/** metodo equals*/
/** serve para comparar as 2 strins como o exemplo marco aurélio*/
if(primeiroNome .equals(segundoNome)){
    System.out.println(" são nomes iguais");
}
else {
    System.out.println("são nomes Diferentes");
}
/** leight */
/**O método length é utilizado para retornar o tamanho de uma determinada string, incluindo os espaços em branco.*/
String palavra = "java";
int tamanho = palavra.length();
    System.out.println("tamanho da palavra: " + tamanho);
int tamanho2 = nome.length();
    System.out.println("o tamanho do " + primeiroNome +  segundoNome + "" + " é: "+ tamanho2);

/** substring!! */
/**  O método substring é utilizado para retornar uma nova string a partir de dois índices especificados. */
/** exemplo  da sintaxe <string>.<substring(<primeiro>,<segundo>) */

String palavra3  =  "catapimbas";
String novaPalavra = palavra3.substring(3,7);
    System.out.println(novaPalavra);
/** charAlt */
/** O método charAt é utilizado para retornar o caractere existente na posição indicada dentro de uma string (começando na posição 0).*/
String palavra4 =  "teste";
char letra2 = palavra4.charAt(3);
    System.out.println("letra 2:" + letra2);
/** indexOff*/
/** O método indexOf é utilizado para retornar um número inteiro indicando a posição de um dado caractere dentro da string (começando na posição 0 e sempre indicando o primeiro caractere encontrado).*/
String palavra5 = "estrutura";
int pocisao = palavra5.indexOf('a');
    System.out.println("a posição da letra a é: " + pocisao);


String aleatorio = "caraguatatuba";
String palavraNova2 = aleatorio.substring(7,11);
    System.out.println(palavraNova2);

}}