# course-enrollment

Exercício desenvolvido durante os estudos de Java, baseado no curso Java Completo do professor Nelio Alves.

## 📝 Sobre o exercício

Simulação de um portal de cursos online onde um instrutor (Alex) possui três cursos (A, B e C) e deseja saber o total de alunos únicos matriculados, sem contar duplicatas de alunos que estão em mais de um curso.

O portal conta com 6 alunos e 5 cursos no total (A, B, C, D e E), sendo que D e E pertencem a outros instrutores. O programa filtra apenas os alunos do instrutor Alex e exibe a contagem final sem repetições.

## 💡 Conceitos praticados

- `HashSet` para garantir alunos únicos sem duplicatas
- `equals` e `hashCode` baseados no identificador único do usuário
- `Enum` para representar os cursos
- Classe utilitária com membros estáticos
- Validação de dados no setter

## 📂 Estrutura

```
src/
└── br/com/cassio340/
    ├── Main.java
    └── entities/
        ├── User.java
        ├── Students.java
        └── Courses.java
```

## 🛠️ Tecnologias
- Java 21 (LTS)
- IntelliJ IDEA