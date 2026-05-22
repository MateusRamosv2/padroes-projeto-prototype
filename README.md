# Padrões de Projeto - Prototype

---

## Estrutura do Projeto

- **Interface Base:** `Cloneable` → Interface nativa do Java (`java.lang.Cloneable`) que atua como uma interface marcadora (*marker interface*). Ela indica à Máquina Virtual do Java (JVM) que os objetos dessa classe podem ser clonados de forma legal e segura através do método `clone()`.
- **Objeto Aninhado (Componente Interno):** `ConfiguracaoFiscal` → Implementa `Cloneable`. Esta classe representa os dados complexos que compõem um produto. Ela possui o seu próprio método de clonagem para garantir que não haja compartilhamento indevido de referências de memória.
- **Objeto Principal (O Protótipo):** `Produto` → Implementa `Cloneable`. É a entidade principal do nosso domínio de ERP. O grande destaque arquitetural desta classe é a implementação da **Cópia Profunda (Deep Copy)** no seu método `clone()`. Ao ser clonado, o `Produto` não apenas copia os seus atributos primitivos (como preço e nome), mas também invoca o `clone()` da sua `ConfiguracaoFiscal`, garantindo que o novo produto nasça com instâncias de memória totalmente independentes do produto original.
- **Testes:** `ProdutoTest` → Utiliza a biblioteca JUnit para validar a integridade do padrão. O teste garante que o usuário consiga utilizar a funcionalidade de "Duplicar Produto", alterando características específicas do clone (como o SKU) e provando que as alterações nas regras fiscais do produto clonado não contaminam o produto original base.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O foco deste diagrama é ilustrar a dependência dupla com a interface `Cloneable` e a associação direta de multiplicidade `1` entre o `Produto` e a sua `ConfiguracaoFiscal`, o que exige a implementação cuidadosa da cópia profunda.

<img width="507" height="644" alt="Diagrama - Prototype" src="https://github.com/user-attachments/assets/a4d8517c-6096-48ec-a611-9b28c8385fa7" />
