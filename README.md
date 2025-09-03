# C214-B-ProjetoCalculadora (Aprendendo Git e GitHub)

## 📘 Descrição
Este projeto é uma calculadora em Java que realiza operações básicas e avançadas:

- **Básicas**: Soma, Subtração, Multiplicação, Divisão (com tratamento de divisão por zero)
- **Avançadas**: Potenciação, Raiz Quadrada, Porcentagem, Fatorial, log

O objetivo é praticar **versionamento com Git e GitHub**, incluindo:
- Criação de repositório público
- Uso de `.gitignore`
- Histórico de commits
- Colaboração via Pull Request
- Resolução de conflitos
- Implementar testes unitários com Junit

---

## ⚙️ Requisitos do Sistema
- Windows, Linux ou macOS
- **Java JDK 8** ou superior
- **Maven** instalado

## ▶️ Como compilar e executar
1. Clone o repositório:
 Abra o Git bash e digite:
 git clone https://github.com/tiagogregorio/C214-B-ProjetoCalculadora.git

 Abrir diretório: cd C214-B-ProjetoCalculadora

3. Compile e gere o artefato:
bash
mvn clean package

4. Execute o programa:
bash
java -jar target/C214-B-ProjetoCalculadora-1.0-SNAPSHOT.jar

## 🧪 Testes Unitários

Este projeto possui **testes unitários** implementados com JUnit.

🤝 Contribuição em Repositório de Colega

Além do desenvolvimento da minha calculadora, também colaborei no projeto de um colega, adicionando exemplos extras de manipulação de strings.

Repositório do colega: MatheusCesarReis/C14-exerc-cio

Pull Request criado e aceito: Adicionei exemplos extras de manipulação de strings

📖 Teoria sobre Teste Positivo e Negativo
🔹 Teste Positivo

Definição:
É o teste que verifica se o sistema ou método funciona corretamente quando recebe entradas válidas e usadas de forma esperada.

Objetivo:
Confirmar que o sistema cumpre os requisitos especificados.

Exemplo clássico:
Se a função é somar(2, 3), o resultado esperado é 5.
O teste positivo garante que isso realmente acontece.

Na teoria de Engenharia de Software:
Esse tipo de teste é conhecido como “teste do caminho feliz” (happy path test), pois avalia o fluxo normal de execução do programa.

🔹 Teste Negativo

Definição:
É o teste que verifica se o sistema se comporta adequadamente quando recebe entradas inválidas, inesperadas ou situações de erro.

Objetivo:
Garantir que o sistema não quebre, mas sim trate os erros de forma controlada (lançando exceção, retornando mensagem de erro, etc.).

Exemplo clássico:
Se a função é dividir(10, 0), o esperado é lançar uma exceção (e não travar o programa ou retornar valor incorreto).

Na teoria de Engenharia de Software:
É conhecido como “teste de robustez”, porque avalia a capacidade do sistema lidar com condições adversas.

📌 Em resumo:

Teste Positivo = valida que o sistema funciona com entradas corretas.

Teste Negativo = valida que o sistema lida bem com entradas incorretas ou limites.

📖 Em muitos livros, essa diferença é destacada:

Positivo → verifica se os requisitos funcionam.

Negativo → verifica se o sistema é robusto contra falhas.

Desenvolvido com uso do IntelliJ usando Java
