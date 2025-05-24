# PUC-GO Projeto Integrador II-A

Data de entrega: 
  - 23/06/2025

Orientações: 
  - O entregável desta atividade deve conter o projeto Java exportado da aplicação e o dump (arquivo .sql) do banco de dados devidamente populado.
  - Vídeo explicativo deve ser entregue na aba "Apresentação do PI"

## OBJETIVO
  
  Criar uma aplicação em Java para armazenar e gerenciar contatos telefônicos,
  implementando as funcionalidades de Create (criar), Read (consultar), Update (atualizar) e
  Delete (excluir). A aplicação permitirá que o usuário armazene informações de contatos como
  nome, número de telefone e e-mail, utilizando essas operações básicas em banco de dados. O
  projeto visa aplicar conceitos de orientação a objetos, manipulação de dados e persistência em
  Java.

  
## DESENVOLVIMENTO

  O trabalho envolve a implementação de uma aplicação de Agenda Telefônica em Java.
  Esta aplicação deve permitir que o usuário armazene e gerencie contatos telefônicos, tendo:
  nome, número de telefone e e-mail. Aplicação deve implementar as funcionalidades dos
  métodos do CRUD. CRUD (Create, Read, Update and Delete) é um acrônimo para as quatro
  operações básicas (criação, consulta, atualização e destruição de dados) utilizadas em bases de
  dados relacionais fornecidas aos utilizadores do sistema. Sendo assim, conforme apresentado,
  a aplicação permitirá salvar, ler, atualizar e excluir dados no banco de dados.
  A escolha do SGDB pode ser realizada entre MySql e PostgreSql. Atente-se para não deixar
  de submeter o banco de dados exportado no entregável.


## RESULTADOS

  O entregável desta atividade deve conter o projeto Java exportado da aplicação e o
  dump (arquivo .sql) do banco de dados devidamente populado. Além disso, o entregável
  deverá conter um vídeo (áudio + imagem) explicativo apresentando o funcionamento da
  aplicação, demonstre as funcionalidades do CRUD completo no vídeo. Grave a explicação
  de cada um dos itens solicitados como se estive explicando para um novo desenvolvedor
  da equipe recém-chegado na empresa. Dica para a gravação de vídeo: se utilizar o Windows
  10 ou 11, nativamente use o atalho das teclas “wiki + G” para abrir a ferramenta de
  gravação do Windows, mas outros aplicativos de gravação de tela podem ser utilizados.

### Etapas
  
  I. Classe Contato com os seguintes atributos:
  • Nome: String
  • Telefone: String
  • Email: String

  II. Classe AgendaTelefonica – faz o gerenciamento dos contatos. Ter os seguintes
  métodos:
  • adicionarContato(Contato contato): adiciona um novo contato à agenda.
  • removerContato(String nome): remove um contato da agenda.
  • buscarContato(String nome): busca e retorna um contato da agenda.
  • listarContatos(): lista todos os contatos armazenados na agenda.
  III. Classe Principal (AgendaTeste) com um método main que permite ao usuário
  interagir com a agenda telefônica através de um menu simples. O menu deve
  oferecer as seguintes opções:
  1. Adicionar um novo contato.
  2. Remover um contato existente.
  3. Buscar um contato pelo nome.
  4. Listar todos os contatos.
  5. Sair do programa.


## CRITÉRIOS PARA A AVALIAÇÃO
  
  - Implemente tratamento de exceções para lidar com casos como contatos inexistentes ou
  operações inválidas.
  - Ofereça uma interface amigável ao usuário para facilitar a interação com a agenda
  telefônica.
  - Teste o programa cuidadosamente para garantir que todas as funcionalidades estejam
  corretamente implementadas e funcionando conforme o esperado.
