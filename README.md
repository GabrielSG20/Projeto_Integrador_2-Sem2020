# Projeto Integrador 2° Semestre BD - Equipe 1 - Trinity
![Trinity_Logo](https://user-images.githubusercontent.com/60863640/94086088-4fb53a00-fde0-11ea-9915-3ac9be131de7.png)

## :pushpin: Introdução
A equipe Trinity foi solicitada pela empresa TecSUS para o desenvolvimento de um software que tem por objetivo facilitar a digitação por parte da sua equipe para as contas de água e luz. O software oferece uma facilidade maior para seus usuários, automatizando processos e diminuindo o tempo de cadastro, além da prevenção de erros por parte dos digitadores e gerando um relatório sobre o consumo e custos de água e luz de cada cliente.

### :book: Índice
* [Membros da equipe](#necktie-membros-da-equipe)
* [Product Backlog](#gift-product-backlog)
* [Sprints](#airplane-sprints)
* [Entregas](#dart-entregas)
* [Funcionamento do projeto](#paperclip-funcionamento-do-projeto)
* [Tecnologias utilizadas](#computer-tecnologias-utilizadas)


### :necktie: Membros da equipe
* [Bahij Jihad Noureddine](https://www.linkedin.com/in/bahij-noureddine-941b681b7/) - Developer
* [Ramon Fernandes Rosario](https://www.linkedin.com/in/ramon-fernandes-19244a1ab/) - Developer
* [Gabriel Timóteo dos Santos](https://www.linkedin.com/in/gabriel-santos-2563571b2/) - Developer
* [Gabriel Henrique de Souza Ferraz](https://www.linkedin.com/in/gabriel-henrique-de-souza-ferraz-4873581b2/) - Developer
* [Hugo Wagner da Silva Gomes dos Santos](https://www.linkedin.com/in/hugo-wagner-692b83150/) - Product Owner(PO)
* [Gabriel Soares Gonçalves](https://www.linkedin.com/in/gabriel-soares-gon%C3%A7alves-a2b35a1b2/) - Scrum Master


### :gift: Product Backlog
1. Cadastro e visualização de contas/água de empresas.<br/>
Eu como digitador desejo uma plataforma simples e intuitiva para cadastro de contas de água e energia, além da visualização das contas já registradas, desse modo, proporcionando uma melhor produtividade e agilidade no processo de digitação, prevenindo possíveis erros. 
2. Seleção dos tipos de conta.<br/>
Eu como digitador desejo um recurso para selecionar a categoria de conta a ser preenchida (água/energia). Abrindo uma aba específica para cada uma, com formulários distintos, contendo campos específicos relacionados a cada tipo de conta, para diminuir os erros de digitação.
3. Automatização na obtenção de dados (Cliente/Fornecedor).<br/>
Eu como digitador espero obter informações de clientes já registrados, de forma automática, preenchendo os campos do formulário de cadastro de cliente, por meio da busca do CPF ou CNPJ. O mesmo ocorre com os dados do fornecedor, uma vez que exista um fornecedor de água e um de energia por cliente. Com intuito de agilizar o processo de digitação.
4. Prevenção de erros de registro.<br/>
Eu como digitador desejo ser alertado quando cometer erros de registros. A exemplo do envio de campos em branco e/ou falta de carácteres necessários. Para evitar possíveis erros no cadastro de contas.
5. Gerador de relatórios de consumo e custos.<br/>
Eu como analista de água ou energia desejo obter acesso aos relatórios de consumo e custo de energia e água, agrupados por cliente, disponibilizados em PDF. Para análise dos dados, proporcionando ao cliente uma avaliação sobre gastos e consumos no mês vigente.

### :airplane: Sprints
1. Na primeira sprint a equipe realizou a criação do layout das telas de cadastros com os campos de preenchimentos necessarios e finalizou as configurações da plataforma Gitpod com as ferramentas necessárias para iniciar o desenvolvimento do projeto. Além disso foi realizado a criação do Product Backlog.<br/> Duração: 07/09/2020 até 27/09/2020.



### :dart: Entregas
1. Apresentação da Equipe Trinity e da problemática do trabalho. Além da demonstração dos Wireframes (representação das telas do software) e Product Backlog (funcionalidades do sistema). Disponíveis nos seguintes links:
   * [PowerPoint](https://www.google.com/)
   * [Video(YouTube)](https://www.youtube.com)

### :paperclip: Funcionamento do projeto
#### A tela inicial apresenta três botões: Novo cliente, Cliente já cadastrado e Relatórios. 

* Novo Cliente: Ao clicar nesse botão, o usuário será redirecionado para uma tela onde escolherá o tipo de cliente (Físico ou Jurídico) e cadastrará os dados da empresa. Após isso, escolherá entre conta de água ou luz e seguirá para cadastrar o fornecedor dependendo do tipo de conta. Então, irá para outra página para preencher os dados da fatura, tendo uma opção para salvar os dados e outra para voltar a tela inicial. Todos as informações registradas pelo funcionário serão reutilizadas no programa.

* Cliente já cadastrado: Ao clicar nesse botão, o usuário será redirecionado para uma tela onde vai colocar o CPF ou CPNJ de uma empresa que já foi cadastrada, assim será encaminhado para a página de cadastro de clientes com os dados já preenchidos, podendo modificar se necessário. Após isso, escolherá entre conta de água ou luz e seguirá para cadastrar o fornecedor, no qual já é preenchido automaticamente, como aconteceu com as informações da empresa, isso considerando que cada cliente apresenta apenas um fornecedor para cada serviço. E seguirá com o cadastro da conta escolhida, podendo salvá-la e retornar a tela inicial.

* Relatórios: Ao clicar nesse botão, o usuário irá para uma página onde visualizará relatórios de consumo e custos das contas, agrupados por clientes.

###  :computer: Tecnologias utilizadas
* [Java](https://www.java.com/pt_BR/)
* [MySQL](https://www.mysql.com/)
* [Gitpod](https://www.gitpod.io/)
* [JavaFX](https://openjfx.io/)
* [MockFlow](https://mockflow.com/apps/wireframepro/)
* [Trello](https://trello.com/pt-BR)
* [StackEdit](https://stackedit.io/)
* [BrModelo2](http://www.sis4.com/brModelo/antigo.html)
