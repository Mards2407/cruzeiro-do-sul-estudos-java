import java.util.Scanner;
public class PooOrientacaoObjetos {
public static void main(String[] args){
/** orientação a objetos e como se fosse um objeto que podemos tocar e fazer varias coisas em pensamento escolar
 * em java podemos fazer varias coisas como :
 * abstração = que e converter o objeto real para em programa como um copo
 * encapsulamento  = e como ligar a televisão mas agente so usa o comando para ligar mas dentro da tv e outra coisa tipo mandar
 * herança  = ele coloca que podemos reutilizar os comandos java como a classe mamifere existem varias especies como cachorro
 * classes = uma classe nada mais é do que um projeto que abstrai um conjunto de objetos com características similares.
 * Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis desses objetos através de atributos.*/
/*
 * bora codar: isso e criar classe de pessoa.
 * As classes abaixo foram comentadas porque classes nao podem ser declaradas
 * dentro do metodo main. Cada uma deve ficar em seu proprio arquivo .java.
public class pessoa{
    String nome;
    int idade;
    float altura;
    String sexo;

}
// no mesmo diretorio pessoa vamos colocar professores
public class professor extends pessoa{
    int IdFuncionario;
    String AreaDeAtuacao;
    String atulacao;
}
// agora vamos colocar no mesmo alunos
public class aluno extends pessoa{
    String nomeAluno;
    int idadeAluno;
    int SerieAluno;
    String rgm;
    String curso;
}
*/
/** Vimos que, tanto na classe Aluno quanto na classe Professor, temos a palavra “cabalística extends” que representa o que chamamos de herança.
 *  Ou seja, tudo o que temos na classe de objeto Pessoa está sendo herdado para as classes Aluno e Professor.*/

   /** Vamos aplicar essa técnica no próximo exemplo. Lembre-se de que todos os arquivos devem ser criados no mesmo
    * diretório para que possam ter acesso a qualquer item herdado.*/

   /** Agora, alguns objetos das classes de objetos criados. Segue o exemplo 1.*/
 /*
  * Os objetos tambem foram comentados porque as classes correspondentes
  * estao comentadas neste arquivo.
 pessoa a= new pessoa();
 professor doug = new professor();
 aluno roberto = new aluno();
 */
/**
 * Neste exemplo, foram chamadas as classes de objetos Pessoa, Professor e Aluno.
 * Para cada uma delas, foi criado um objeto exemplo:
 * A é um objeto da classe pessoa;
 * Doug é um objeto da classe professor;
 * roberto é um objeto da classe aluno.*/

Scanner sc = new Scanner(System.in);



}}