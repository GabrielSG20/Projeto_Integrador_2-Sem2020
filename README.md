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
Plataforma simples e intuitiva para cadastro/registro de contas não processadas pelo BOT. E visualização dos cadastros já registrados.
2. Seleção dos tipos de conta.<br/>
Recurso para selecionar a categoria de conta a ser preenchida (água/luz). Abrindo uma aba específica para cada uma, com campos distintos, diminuindo os erros de digitação por meio de um layout intuitivo.
3. Automatização na obtenção de dados (Cliente/Fornecedor).<br/>
Obter informações de clientes já registrados, automaticamente, através do registro do CPF/CNPJ, assim, obtendo também a informação do fornecedor, uma vez que exista um fornecedor pra cada tipo de conta por cliente.
4. Prevenção de erros de registro.<br/>
Alerta quando ocorrer erros de registros. A exemplo do envio de campos em branco e/ou falta de carácteres necessários.
5. Gerador de relatórios de consumo e custos.<br/>
Obter acesso aos relatórios de consumo e custo de energia e água agrupados por cliente, disponibilizados em PDF.
6. Documentação.<br/>
Obter o manual de guia de utilização do usuário, modelo de dados (transmitidos e armazenados), e o guia de migração para versões do programa.

### :airplane: Sprints
1. Na primeira sprint a equipe realizou a criação do layout das telas de cadastros com os campos de preenchimentos necessarios e finalizou as configurações da plataforma Gitpod com as ferramentas necessárias para iniciar o desenvolvimento do projeto. Além disso foi realizado a criação do Product Backlog.<br/> Duração: 07/09/2020 até 27/09/2020.



### :dart: Entregas
1. Apresentação da Equipe Trinity e da problemática do trabalho. Além da demonstração dos Wireframes (representação das telas do software) e Product Backlog (funcionalidades do sistema). Disponíveis nos seguintes links:
   * [PowerPoint](https://drive.google.com/file/d/1B34QUefdqB4Dh1cuP_8u5np77Q-RdkcL/view)
   * [Video(YouTube)](https://www.youtube.com/watch?v=k5cMXUFGKQs&feature=youtu.be)

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
