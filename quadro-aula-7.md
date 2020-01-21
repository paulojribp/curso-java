## Curso Básico de Java - Aula 07 - Interfaces

- Relembrando o que é uma propriedade da classe e seus nomes. Os possíveis nomes são:
    * Variável de instância;
    * Propriedade da classe;
    * Field;
    * Atributo;

### Construtures
- As classes em java, possuem métodos chamados de construtores;
- Todo construtor possui o mesmo nome da Classe;
- E uma estrutura de método; Parênteses para receber os parâmetros; As chaves para definir comportamento;  
- Também definem visibilidade; Exceto pelo package que não pode ser usado;
- Ao criar um construtor na classe, esse construtor **passa a ser obrigadotório**;
- Toda classe java possui automaticamente um construtor que é: *`public`, sem parâmetros e sem implementação*; Chamado de construtor *default*;
- Os construtores não possuem retorno explícito; Implicitamente eles sempre retornam uma instância da classe;
- As classes podem definir mais de um construtor; Quando isso acontece, nós temos uma sobrecarga de construtores; Comumente chamada de *Overloading*

### Interfaces
- Uma Interface ela não possui propriedades nem comportamentos; Ela apenas define os contratos para os métodos;
- Uma interface também é chamada de contrato;
- Como se define uma interface? `public interface NomeDaInterface`;
- Todos os métodos de uma interface são, por *default*, `public` e `abstract`;
- Uma classe pode implementar uma ou mais interfaces; Porém ela deve obrigatoriamente definir o comportamente para todos os métodos, independente de quantas interfaces ele implementa;

### Herança x Composição
- Herança nós definimos como um relacionamento do tipo **é um**
- composição nós definimos como um relalcionamento do tipo **tem um**
- 

### Design Patter
- *Strategy like*
- 


### Exercícios

#### Top 
> Modificar a implementação da PessoaJuridica para que ela possa implementar corretamente o padrão Strategy

#### Top Top
> 