# Exercício: Implementando Classes em Java

## Descrição

Neste exercício, criaremos as classes `Pessoa` e `Livro`, além de implementar a interface `Publicacao`. A classe `Pessoa` representará uma pessoa com nome, idade e sexo. A classe `Livro` representará um livro com título, autor, número de páginas, estado de abertura e leitor. Usaremos métodos para simular ações como abrir, fechar e folhear o livro, bem como mostrar detalhes.

## Classes e Interfaces

### Classe `Pessoa`

A classe `Pessoa` representa um indivíduo com as seguintes propriedades e métodos:

- Propriedades:
  - `nome` (String) - o nome da pessoa.
  - `idade` (int) - a idade da pessoa.
  - `sexo` (String) - o sexo da pessoa.

- Métodos:
  - `construtor(nome, idade, sexo)` - cria uma nova instância da classe `Pessoa`.
  - `getNome()` - retorna o nome da pessoa.
  - `getIdade()` - retorna a idade da pessoa.
  - `getSexo()` - retorna o sexo da pessoa.
  - `fazerAniversario()` - incrementa a idade da pessoa em 1.

### Classe `Livro`

A classe `Livro` representa um livro com as seguintes propriedades e métodos:

- Propriedades:
  - `titulo` (String) - o título do livro.
  - `autor` (String) - o autor do livro.
  - `totalPaginas` (int) - o número total de páginas do livro.
  - `aberto` (boolean) - o estado de abertura do livro.
  - `leitor` (Pessoa) - o objeto `Pessoa` representando o leitor do livro.

- Métodos:
  - `construtor(titulo, autor, totalPaginas, aberto, leitor)` - cria uma nova instância da classe `Livro`.
  - `abrir()` - abre o livro.
  - `fechar()` - fecha o livro.
  - `folhear()` - simula a ação de folhear o livro.
  - `avancarPag()` - avança para a próxima página.
  - `voltarPag()` - volta para a página anterior.
  - `detalhesLivro()` - mostra os detalhes do livro, incluindo o leitor.

### Interface `Publicacao`

A interface `Publicacao` define os métodos que uma classe precisa implementar para representar um objeto que pode ser aberto, fechado e folheado:

- `abrir()` - método para abrir o objeto.
- `fechar()` - método para fechar o objeto.
- `folhear()` - método para simular a ação de folhear o objeto.
- `avancarPag()` - método para avançar para a próxima página.
- `voltarPag()` - método para voltar para a página anterior.

## Exemplo de Uso

```java
// Criação de pessoas
Pessoa pessoa1 = new Pessoa("Alice", 25, "F");
Pessoa pessoa2 = new Pessoa("Bob", 30, "M");

// Criação de livros com leitores associados
Livro livro1 = new Livro("Aventuras Incríveis", "Autor A", 150, false, pessoa1);
Livro livro2 = new Livro("Mistérios Desafiadores", "Autor B", 200, true, pessoa2);

// Realização de ações nos livros
livro1.abrir();
livro1.folhear();
livro1.avancarPag();
livro1.detalhesLivro();

livro2.folhear();
livro2.voltarPag();
livro2.detalhesLivro();
