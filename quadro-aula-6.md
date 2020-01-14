## Curso Básico de Java - Aula 06 - Ferramentas

- IDE - Integrated Development Enviroment - São ferramentas completas de desenvolvimento ou conhecidos também como ambiente de desenvolvimento.
- Compiladores - Simplesmente automatizam a compilação e execução do seu código. Possuem o básico da linguagem, como Autocomplete por exemplo.
- O java é uma plataforma e uma linguagem complexa - exige uma ferramenta de desenvolvimento mais completa

- No java, o compilador só consegue enxergar os métodos e atributos do objeto pelo seu tipo.
- Em java, temos métodos Abstratos (abstracts). Que não possuem implementação (conteúdo concreto para eles).
- Quando a classe possui pelo menos 1 método abstrato, toda a classe se torna abstrata: `public abstract class Conta`.
- Classes abstratas não podem ser Instânciadas. Ou seja, não pode ser feito `new Conta()`;
- Toda classe filha de uma classe Abstrata, deve **obrigatoriamente** implementar todos os métodos abstratos;
- Em Java, uma classe só pode ter um único Pai. Ou seja, não pode ser feito `extends` de mais de uma classe;

### Quais as principais ferramentas para Java?

##### IDEs
- Eclipse
- IntelliJ

##### Compiladores
- VSCode
- Command Line *aka: javac Classe.java*

### Eclipse IDE
- Começamos selecionando o Workspace - Uma pasta geral para criarmos os nossos projetos
- Depois criamos um projeto Java (Java Project) e damos um nome a ele
- Vamos criar um pacote novo, usando o atalho `[CTRL + N]`
- Criamos as classes da mesma forma, com `CTRL + N` e selecionando a opção `Class`.
- Criamos o método main() apenas digitando `main` mais o comando `CTRL + Espaço`.
- Criamos uma nova conta com new Conta e automatizamos a criação da variável com `CTRL + 1`;
- Usamos o `CTRL + D` para deletar linhas
- Muitas automatizações do Eclipse são feitas com `CTRL + 1`. Para criar o método deposito, basta colocar o código `conta.deposito(500)` e automatizar a criação do método depósito na classe Conta, usando o `CTRL + 1`;

### Estrutura de pacotes do Java
- com.javadevzone.cursojava

- Os pacotes precisam ser declarados, usando a seguinte sintax:
```
package com.javadevzone.cursojava;
```
- Essa declaração precisa ser a primeira coisa dentro de uma classe.


## Exercício Aula 06

#### Top 
> Crie uma classe Pessoa, PessoaFisica e PessoaJuridica. A classe PessoaFisica e PessoaJuridica devem herdar de Pessoa e a classe Pessoa deve ter um método abstrato `String obterIdentificacaoFederal()`. Esse método deve retornar o CPF se for pessoa física ou CNPJ se for pessoa jurídica.

#### Top Top
> Use a classe pessoa para definir todos os comportamentos (métodos) que uma PessoaFisica e PessoaJuridica devem ter. Não defina comportamentos que não façam sentido a ambas as pessoas. E essa classe deve **obrigar** *todos os filhos a implementar todos os seus métodos*.