# Criação do Projeto

Como foi criado e quais tecnologias foram utilizadas?

Foi utilizado no projeto:
- Sprint Initializr (criação do projeto)
- JPA e MySQL Driver (persistência)
- 


# Estrutura do Projeto


# Endpoints disponibilizados para App Mobile



# JPA

- Ao iniciar a aplicação, JPA cria 10 conexões com banco de dados
para ser utilizado na aplicação.
- Já é validado na execução da aplicação se conexão com banco de dados 
é valido.


# Arquitetura

Deverá ser criado um package para cada camada
- models
- repositories
- services
- controllers


# Criação dos Modelos
Java utiliza a notação camelCase (nomeCompleto)
Modelo represeta a estrutura de uma classe

- Criar classe de modelo Usuario.java
- Criar as propriedades do modelo utilizando camelCase
- Criar notação para mapear classe e propriedades de acordo com banco de dados
- Criar métodos Getters e Setters para cada propriedade


# Criação dos Repositórios
- Repositorios são criados como interface em java e não como classe concreta.
- Todo repositório extende a interface do JPA CrudRepository<Class, Type_PK>.
- Para métodos além do CRUD, o JPA possui uma inteligência de criar scripts SQL
quando o método for iniciado por 'find' seguido do nome de uma propriedade do modelo.

# Criação dos Serviços e Regras de Negócio

- Criar classe concreta UsuarioService
- Toda classe de serviço precisa da notação @Service para que o spring boot gerencie a criação
das classes de serviços.
- Utilizar notação @Autowired para criar propriedades dos  repositórios para o spring boot criar 
instancia do repositório sem necessidade do new (DI).
- Criar método de add

# Criação dos Controllers

- Criar classe concreta UsuarioController
- Toda classe Controller precisa da notação @RestController para o spring identificar.
- Para instanciar o serviço que será utilizado, também é necessário usar a notação
@Autowired
- Para métodos POST, utilizar a notação @PostMapping("/usuario") no método.
- Retornar sempre um ResponseEntity de uma entidade para ser possível manipular status http.



# Curso

https://app.rocketseat.com.br/classroom/nlw-19-connect-java/group/nlw-19-connect-java/lesson/construindo-a-base-do-projeto