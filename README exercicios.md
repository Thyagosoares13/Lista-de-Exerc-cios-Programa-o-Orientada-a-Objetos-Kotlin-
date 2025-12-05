Lista de Exercícios – Programação Orientada a Objetos (Kotlin)
Disciplina: Desenvolvimento de Sistema
Turma: B
Professor: Jacques
Aluno: Thyago Soares Pereira
Data de Conclusão: 5 de dezembro de 2025
________________________________________
Ambiente (IntelliJ IDEA)
•	IDE utilizada: IntelliJ IDEA Community Edition
•	Linguagem: Kotlin
•	Build System: IntelliJ
•	JDK: versão 17 ou 21
________________________________________
Estrutura do Projeto
Pacote principal dos exercícios: exercicios
Arquivos .kt criados:
1.	TwoSum.kt – Arrays e HashMap (Fundamentals - Nível 1)
2.	ContainsDuplicate.kt – Contém Duplicata (Fundamentals - Nível 1)
3.	ValidAnagram.kt – Anagrama Válido (Fundamentals - Nível 1)
4.	ValidPalindrome.kt – Palíndromo Válido (Pointers - Nível 2)
5.	TwoSumII.kt – Two Sum II - Input Array Is Sorted (Pointers - Nível 2)
6.	ValidParentheses.kt – Parênteses Válidos (Pilhas e Filas - Nível 3)
________________________________________
Descrição dos Exercícios
Nível 1: Arrays e Hashing (Fundamentos)
1. Two Sum (Soma de Dois)
•	Conceito: Arrays, HashMap
•	Descrição: Dado um array de inteiros e um alvo, encontre os índices dos dois números que somam o alvo, usando memória constante O(1).
•	Dica em Kotlin: Use HashMap para armazenar valores e seus índices.
2. Contains Duplicate (Contém Duplicata)
•	Conceito: Sets (Conjuntos)
•	Descrição: Determine se um array contém um valor duplicado.
•	Dica em Kotlin: Use toHashSet() e compare o size original com o do conjunto.
3. Valid Anagram (Anagrama Válido)
•	Conceito: Manipulação de Strings, Contagem de Frequência
•	Descrição: Dadas duas strings s e t, retorne true se t for um anagrama de s.
•	Dica em Kotlin: Treine o uso de groupingBy() e eachCount().
________________________________________
Nível 2: Ponteiros e Manipulação (Intermediário)
4. Valid Palindrome (Palíndromo Válido)
•	Conceito: Dois Ponteiros (Two Pointers), Regex
•	Descrição: Dada uma string, verifique se é um palíndromo, considerando apenas caracteres alfanuméricos e ignorando maiúsculas/minúsculas.
•	Dica em Kotlin: Use filter { it.isLetterOrDigit() } e reversed().
5. Two Sum II - Input Array Is Sorted
•	Conceito: Dois Ponteiros em array ordenado
•	Descrição: Semelhante ao exercício 1, mas o array já está ordenado. Encontre os índices usando memória constante O(1).
•	Dica em Kotlin: Use um ponteiro no início e outro no fim (left e right).
________________________________________
Nível 3: Pilhas e Filas (Estruturas Clássicas)
6. Valid Parentheses (Parênteses Válidos)
•	Conceito: Stack (Pilha)
•	Descrição: Dada uma string contendo '(', ')', '{', '}', '[' e ']', determine se a string de entrada é válida (fechada na ordem correta).
•	Dica em Kotlin: Em Kotlin, utilize ArrayDeque ou Stack. É vital para entender o conceito de LIFO (Last In, First Out).
________________________________________
Como Executar
1.	Abrir o projeto EstudosLeetCode no IntelliJ IDEA.
2.	No painel Project, acessar src/main/kotlin/exercicios.
3.	Abrir o arquivo do exercício desejado (por exemplo, TwoSum.kt).
4.	Clicar no ícone de execução ao lado de fun main() para rodar e visualizar os resultados no console.
________________________________________
Estrutura de Arquivos
EstudosLeetCode/
├── src/
│ └── main/
│ └── kotlin/
│ └── exercicios/
│ ├── TwoSum.kt
│ ├── ContainsDuplicate.kt
│ ├── ValidAnagram.kt
│ ├── ValidPalindrome.kt
│ ├── TwoSumII.kt
│ └── ValidParentheses.kt
├── README.md
└── .idea/ (gerado automaticamente)
________________________________________
Resumo de Aprendizado
Este projeto aborda conceitos fundamentais de estruturas de dados e algoritmos:
•	Nível 1: Arrays, Hash Maps e Sets para busca eficiente
•	Nível 2: Técnica de dois ponteiros para otimizar buscas
•	Nível 3: Estruturas clássicas (Stacks) para problemas com ordem e validação
Cada exercício foi implementado em Kotlin, explorando recursos idiomáticos da linguagem como filter, groupingBy, eachCount e ArrayDeque.
________________________________________
Entrega: Arquivos .kt enviados no GitHub e este README.md explicando o desenvolvimento e as soluções implementadas.
