# Backlog do Sistema de Gerenciamento de Links (SGL).
O backlog foi projetado para refletir as quatro sprints do sistema, cada uma visando um incremento funcional do sistema.

# Sprint 1 - Versão 0.1.0: Configuração Inicial e Cadastro de Links
Objetivo: Criar a estrutura básica do sistema e implementar o cadastro e listagem de links.
Itens do Backlog:
* Criar a classe Link para representar os links.
* Criar a classe SistemaLinks para gerenciar links e exibir o menu interativo.
* Implementar o menu no console com as opções:
* Adicionar Link
* Listar Todos os Links
* Sair
* Testar o sistema com dados fictícios.
# Sprint 2 - Versão 0.2.0: Filtragem de Links por Assunto
Objetivo: Permitir que o usuário visualize os links filtrados por assunto.
Itens do Backlog:
* Adicionar método na classe SistemaLinks para listar links filtrados por assunto.
* Atualizar o menu para incluir a funcionalidade de filtrar links por assunto.
* Testar a funcionalidade com dados fictícios e diversos assuntos.
# Sprint 3 - Versão 0.3.0: Remoção de Links
Objetivo: Habilitar a remoção de links específicos pelo índice.
Itens do Backlog:
* Adicionar método na classe SistemaLinks para remover links pelo índice.
* Atualizar o menu para incluir a funcionalidade de remoção.
* Testar a funcionalidade de remoção com diferentes índices, incluindo casos inválidos.
# Sprint 4 - Versão 0.4.0: Salvamento de Dados em Arquivo
Objetivo: Implementar a persistência de dados para que os links sejam armazenados em um arquivo de texto e carregados ao iniciar o sistema.
Itens do Backlog:
* Criar métodos para salvar e carregar links em um arquivo de texto.
* Atualizar o menu para salvar os dados automaticamente ao sair do sistema.
* Testar a persistência com múltiplos cenários:
* Arquivo existente com dados.
* Arquivo inexistente (primeira execução).
