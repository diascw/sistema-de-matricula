# Histórias de Usuário

## 1. Realizar Matrícula

**Funcionalidade**: Matrícula de aluno em disciplinas

**Como** um aluno,  
**Eu preciso** me matricular em até 4 disciplinas obrigatórias e 2 optativas,  
**Para que** eu possa participar das disciplinas durante o semestre.

**Cenário 1**: Matrícula em disciplinas disponíveis
- **Dado que** estou logado no sistema e o período de matrículas está aberto,
- **Quando** eu seleciono as disciplinas obrigatórias e optativas disponíveis,
- **Então** minha matrícula é confirmada e eu recebo uma notificação de sucesso.

**Cenário 2**: Limite de matrículas excedido
- **Dado que** já me matriculei em 4 disciplinas obrigatórias e 2 optativas,
- **Quando** tento me matricular em uma disciplina adicional,
- **Então** o sistema deve impedir a matrícula e exibir uma mensagem de erro.

**Cenário 3**: Disciplina com vagas esgotadas
- **Dado que** estou tentando me matricular em uma disciplina concorrida,
- **Quando** as vagas desta disciplina já estão esgotadas,
- **Então** o sistema deve impedir a matrícula e me informar que não há mais vagas disponíveis.

## 2. Cancelar Matrícula

**Funcionalidade**: Cancelamento de matrículas

**Como** um aluno,  
**Eu preciso** cancelar uma matrícula feita anteriormente,  
**Para que** eu possa ajustar minhas disciplinas antes do fechamento do período de matrícula.

**Cenário 1**: Cancelamento bem-sucedido
- **Dado que** estou logado no sistema e o período de matrículas está aberto,
- **Quando** seleciono uma disciplina na qual estou matriculado e opto por cancelar a matrícula,
- **Então** minha matrícula é cancelada e a vaga é liberada para outro aluno.

**Cenário 2**: Cancelamento fora do período permitido
- **Dado que** estou tentando cancelar uma matrícula fora do período permitido,
- **Quando** eu tento realizar o cancelamento,
- **Então** o sistema deve impedir a ação e exibir uma mensagem informando que o período de cancelamento está encerrado.

## 3. Consultar Alunos Matriculados

**Funcionalidade**: Consulta de alunos matriculados

**Como** um professor,  
**Eu preciso** consultar a lista de alunos matriculados em minhas disciplinas,  
**Para que** eu saiba quem estará frequentando minhas aulas.

**Cenário 1**: Consulta Bem-Sucedida
- **Dado que** estou logado no sistema como professor,
- **Quando** eu acesso a área de disciplinas e seleciono uma disciplina específica,
- **Então** o sistema deve exibir a lista de alunos matriculados naquela disciplina.

## 4. Gerar Currículo Semestral

**Funcionalidade**: Criação e atualização do currículo semestral

**Como** um membro da secretaria,  
**Eu preciso** criar e atualizar o currículo semestral,  
**Para que** os alunos possam se matricular nas disciplinas oferecidas.

**Cenário 1**: Criação de novo currículo
- **Dado que** o período de matrículas está próximo,
- **Quando** eu adiciono novas disciplinas e professores ao currículo semestral,
- **Então** o currículo é salvo e publicado para que os alunos possam visualizar e se matricular.

**Cenário 2**: Atualização de disciplinas existentes
- **Dado que** houve alterações em algumas disciplinas,
- **Quando** eu faço atualizações no currículo semestral já publicado,
- **Então** o sistema deve refletir as mudanças e notificar os alunos matriculados nas disciplinas afetadas.

## 5. Notificação de Matrícula

**Funcionalidade**: Notificação ao sistema de cobranças

**Como** o sistema de cobranças,  
**Eu preciso** ser notificado quando um aluno se matricular,  
**Para que** eu possa gerar as cobranças correspondentes às disciplinas.

**Cenário 1**: Notificação de matrícula bem-sucedida
- **Dado que** um aluno finalizou sua matrícula,
- **Quando** o processo de matrícula é concluído,
- **Então** o sistema de cobranças deve ser notificado com os dados das disciplinas para gerar a cobrança.

## 6. Fechar Matrículas

**Funcionalidade**: Encerramento do período de matrículas

**Como** um funcionário da secretaria,  
**Eu preciso** fechar as matrículas no final do período,  
**Para que** eu possa desativar disciplinas que não atingiram o número mínimo de alunos.

**Cenário 1**: Fechamento bem-sucedido
- **Dado que** o período de matrículas se encerrou,
- **Quando** eu opto por fechar o período no sistema,
- **Então** todas as matrículas são finalizadas, e as disciplinas com menos de 3 alunos são desativadas.

**Cenário 2**: Disciplinas desativadas por baixa demanda
- **Dado que** algumas disciplinas não atingiram o número mínimo de alunos,
- **Quando** o período de matrícula é encerrado,
- **Então** essas disciplinas são automaticamente desativadas e os alunos matriculados são notificados.