# Sistema de Gerenciamento de Links (SGL).
# Descrição
O sistema permite gerenciar links úteis categorizados por assunto, com funcionalidades de cadastro, listagem, filtragem e remoção. Além disso, suporta persistência de dados usando arquivos de texto, garantindo que os links sejam recuperados mesmo após o encerramento do programa.
O projeto foi desenvolvido em Java, utilizando versão semântica para gerenciar entregas contínuas em sprints.
# Objetivo Geral
Desenvolver um sistema simples e eficiente que permita aos usuários organizar e acessar links úteis categorizados por assuntos de interesse.
# Funcionalidades Principais
Cadastro de Links:
* Adicionar links com URL, descrição e assunto.
* Listagem de Links:
* Exibir todos os links cadastrados.
* Filtragem de Links:
* Filtrar links por assunto.
* Remoção de Links:
* Excluir links específicos.
# Persistência de Dados:
* Salvar e carregar links de um arquivo de texto.
# Estrutura do Projeto
# Classe Link:
Representa um link com URL, descrição e assunto.
# Classe SistemaLinks:
Gerencia todas as operações do sistema, como adicionar, listar, filtrar, remover e manipular arquivos.
# Classe Main:
Ponto de entrada do sistema.
Controla a execução do menu interativo.
# Tecnologias Utilizadas
* Linguagem: Java (versão 11 ou superior)
* Bibliotecas Padrão:
* java.util: Manipulação de listas e scanner.
* java.io: Manipulação de arquivos.
Ambiente de Desenvolvimento:
Microsoft Visual Studio Code.
# Persistência:
A fim de evitar o uso de um banco de dados As informações adiicionadas sistema são salvos em um arquivo de texto chamado links.txt.
# Versionamento Semântico
Cada sprint entregará uma versão seguindo o padrão MAJOR.MINOR.PATCH.
