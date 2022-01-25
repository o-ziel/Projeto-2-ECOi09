# Projeto 2 - ECOi09 - Linguagens de Programação

O projeto foi implementado com a utilização do [Maven](https://maven.apache.org/what-is-maven.html).

### Autores:

* Oziel Ferreira da Silva
* Willian Luiz Silva Texeira
* Luís Gaspar da Cruz

### Objetivo:

Implementar uma solução para um sistema que funcionaria em um restaurante utilizando conceitos de padrões de projetos
apresentados no decorrer da disciplina.

---

### Detalhes sobre o projeto:

O fluxo adotado tem a seguinte ordem (como requisitado pelo projeto):

* Cadastro do Pedido do Cliente → Cozinha → Entrega do Pedido do Cliente → Pagamento

O Projeto #2 foi desenvolvido usando o "Apache NetBeans IDE 12.5". Essa IDE não vem com suporte para Java Development Kit
(JDK) 17, então desenvolvemos o projeto usando o JDK 11, que a IDE tem como padrão.

#### Os padrões de projeto implementados foram:

#### Criacional:

Builder (Ele faz a criação dos nossos produtos que serão usados em pedidos, passo-a-passo).

#### Estrutural:

Façade (Ele nos fornece uma forma de acesso simplificada aos status [Que é o padrão comportamental] de produtos).

#### Comportamental:

Observer (A escolha do padrão Observer surgiu da idéia de que os produtos deveriam ser acessíveis via cada um dos
membros do fluxo de processos que eles têm. Por exemplo, com a implementação desse padrão de projeto é possível acessar,
via um pedido, qualquer parte do fluxo e ver o que há dentro dessa parte).

---

O que controla praticamente o projeto inteiro é a classe Admin. É nela onde se guardam quais os produtos que o
"restaurante" oferece, o número de mesas, os possíveis status de produtos e um vetor de String contendo um resumo de um
produto que é oferecido.

Os paineis da "Bancada" e da "Cozinha" são acessíveis via a barra de Menus "Ir para..." no Menu interno de "Funcionário"
. E lá os produtos de uma mesa são marcados como entregues. A mesa só pode ser paga se todos os produtos tiverem sido
entregues.

---

O Projeto pode funcionar via editores de código, como o VSCode com uma versão [JDK](https://www.oracle.com/java/technologies/downloads/)
igual ou superior a 11 devidamente instalada no computador e auxílio de pacote de extensões para [Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).