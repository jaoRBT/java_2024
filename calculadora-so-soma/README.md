# UniALFA - Linguagem de Programação Java
## Introdução ao tratamento de Exceções
### Try-Catch: 
* O bloco try-catch é usado para capturar e lidar com exceções específicas que podem ocorrer em um trecho de código.
### Finally:
* O bloco finally é usado para executar código que deve ser executado independentemente de ocorrer ou não uma exceção dentro do bloco try.
### Throws:
* A palavra reservada throws é usada para declarar que um método pode lançar uma exceção específica, mas não a trata dentro do método. Isso significa que a exceção será propagada para o método que chama o método atual.
### Throw:
* A palavra reservada throw é usada em Java para explicitamente lançar uma exceção durante a execução de um programa.
### Try-With-Resources:
* A partir do Java 7, você pode usar o bloco try-with-resources para garantir que os recursos sejam fechados corretamente, mesmo se ocorrer uma exceção. Isso é especialmente útil para recursos que implementam a interface AutoCloseable, como arquivos, conexões de banco de dados, etc.
### Tipos de Exceções
 Em Java, as exceções podem ser divididas em duas categorias principais: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).
#### Exceções Verificadas (Checked Exceptions):
* São exceções que são verificadas em tempo de compilação pelo compilador.
* Qualquer método que pode lançar uma exceção verificada deve declarar explicitamente isso usando a cláusula throws.
* São subclasses diretas da classe Exception, mas não são subclasses de RuntimeException.
* Exemplos comuns incluem IOException, SQLException, ClassNotFoundException, entre outros.
* O objetivo é forçar o programador a lidar com situações excepcionais que podem ocorrer durante a execução do programa.
#### Exceções Não Verificadas (Unchecked Exceptions):
* São exceções que não são verificadas em tempo de compilação pelo compilador.
* O programador não é obrigado a declarar ou tratar essas exceções.
* São subclasses diretas da classe RuntimeException.
* São frequentemente usadas para sinalizar erros de programação ou condições excepcionais que normalmente indicam bugs no código.
* Exemplos comuns incluem NullPointerException, IllegalArgumentException, ArrayIndexOutOfBoundsException, entre outros.
* O principal objetivo é sinalizar problemas que provavelmente não podem ser tratados de forma eficaz pelo programa.