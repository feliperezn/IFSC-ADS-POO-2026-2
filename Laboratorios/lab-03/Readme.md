```mermaid
classDiagram
    direction BT

class Biblioteca {
    - livros : ArrayList~Livro~
    - usuarios : ArrayList~Usuario~
    - emprestimos : ArrayList~Emprestimo~
}

class Livro{
    - id : int
    - nome: String
}

class Emprestimo {
    - usuario : Usuario
    - livro : Livro
    - dataEmp : Date
}

class Usuario {
    - nome : String
    - livrosEmp : ArrayList~Emprestimo~
    + emprestar(int id) void
    + devolver(int id) void
}

Livro --* Biblioteca
Usuario --* Biblioteca
Emprestimo "0..*" o-- "1" Livro
Emprestimo "0..*" o-- "1" Usuario
```
