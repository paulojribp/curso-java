## Curso Básico de Java - Aula 04

- Quando queremos proteger uma variável de instância (atributo), usamos a palavra especial `private`;
- Encapsulamento é apenas a proteção de variáveis de instância (atributos) através dos métodos;
- Para retornar valores a quem chamou o métodos, usamos a palavra especial chamada `return`;
- Todo método que não retorna nada usa a palavra especial `void` antes do nome do método;
- E todo método que retorna algum valor, precisa dizer qual o TIPO desse retorno;
- Sempre que você precisar copiar um trecho de código e depois colar, nós vamos ISOLAR!

#### Escopos - Pacotes
- Para agrupar arquivos as classes, usamos a palavra reservada `package`;
- No java, todo pacote (`package`) é representado fisicamente por uma pasta no sistema operacional;
- Quando as propriedades (atributos) de classe é `private`, usamos os métodos acessores;
- O padrão (default) de nome para esses métodos é: set / get + nomeDoAtributo
    - Ex.: setNome() / setNumero()

#### Visibilidades no Java
* public
    - Visível a qualquer pacote e classe em qualquer pacote
* protected
    - Visível apenas as classes dentro do mesmo pacote
* `default`
    - *Vamos falar quando chegarmos em Herança*
* private
    - Visível apenas para a própria classe


### Exercício

```
Crie uma classe Pessoa, com os atributos (nome, idade, sexo, cpf) e que tenha os atributos privados. Utilizando os métodos acessores, permita ao usuário informar os atributos, porém, valide o cpf e não permite que seja informado CPFs inválidos.
---

Tente colocar duas classes públicas no mesmo arquivo e compile seu programa.
```

Colocar o código no CollabCode no canal JavaDevZone [https://discord.gg/FP5UaAG](https://discord.gg/FP5UaAG)
