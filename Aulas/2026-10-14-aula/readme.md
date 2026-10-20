# Modelagem UML

Para cada um dos exercícios abaixo, crie um diagrama UML com associações de herança.

- Você pode criar as classes que julgar necessário.
- Cada classe deve ter pelo menos um atributo e um método

É necessário pensar em um contexto de domínio para o problema. Exemplos: Escola, biblioteca, transporte, zoológico.

## Escola: Aluno professor, coordenador, diretor

```mermaid
    classDiagram
        direction BT

    class Usuario {
        - id : int
        - nome : String
    }
    
    class Professor {
        - salario : double
    }

    Professor --|> Usuario
    Diretor --|> Usuario
    MatriculaCurso --|> Usuario
    Curso --|> MatriculaCurso
    Curso --|> Coordenadorias
    Coordenadorias --* Coordenador
    Coordenador --|> Professor

```        

## Banca: Livro, revista, jornal, gibi
```mermaid
    classDiagram
        direction BT

    class Impressos {
        - id : int
        - titulo : String
        - ano : LocalDate
        - preco : double
    }

    class Periodico {
        - issn : int
        - periodicidade : String
    }

    class Jornal {
        - cidade: String
        - UF : String
        - dataPublicacao : LocalDate
    }

    class Livro {
        - isbn : int
    }

    class Gibi {
        - ilustrador : String
    }

    class Revista {
        - segmento : String
    }

    Periodico --|> Impressos
    Livro --|> Impressos
    Jornal --|> Periodico
    Revista --|> Periodico
    Gibi --|> Periodico
```

## Meios de Transporte: Carro, avião, barco, caminhão

```mermaid
    classDiagram
        direction BT

    class Transporte {

    }

    class Terrestre {

    }

    class Carro {

    }

    Terrestre --|> Transporte
    Marítimo --|> Transporte
    Aéreo --|> Transporte

    Carro --|> Terrestre
    Caminhao --|> Terrestre

    Barco --|> Marítimo
    Aviao --|> Aéreo

```
