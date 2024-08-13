# Laboratório de Desenvolvimento de Software

## Alunos integrantes da equipe
* Júlia Resende | 1313121@sga.pucminas.br
* Leandra Ramos | 1402897@sga.pucminas.br
* Wanessa Dias  | 815234@sga.pucminas.br

## Professor responsável
* Cristiano Neto

## Descrição 
Neste laboratório, vamos projetar um Sistema de Matrículas para uma Universidade. Leia atentamente a descrição fornecida pelo Product Owner e elabore o projeto detalhado do sistema:

Uma universidade pretende informatizar seu sistema de matrículas. A secretaria da universidade gera o currículo para cada semestre e mantém as informações sobre as disciplinas, professores e alunos.
Cada curso tem um nome, um determinado número de créditos e é constituído por diversas disciplinas.
Os alunos podem se matricular em 4 disciplinas como 1ª opção (obrigatórias) e em mais 2 outras alternativas (optativas).
Há períodos para efetuar matrículas, durante os quais um aluno pode acessar o sistema para se matricular em disciplinas e/ou para cancelar matrículas feitas anteriormente.
Uma disciplina só fica ativa, isto é, só vai ocorrer no semestre seguinte se, no final do período de matrículas tiver, pelo menos, 3 alunos inscritos (matriculados). Caso contrário, a disciplina será cancelada. O número máximo de alunos inscritos a uma disciplina é de 60 e quando este número é atingido, as inscrições (matrículas) para essa disciplina são encerradas.
Após um aluno se inscrever para um semestre, o sistema de cobranças é notificado pelo sistema de matrículas, de modo que o aluno possa ser cobrado pelas disciplinas daquele semestre.
Os professores podem acessar o sistema para saber quais são os alunos que estão matriculados em cada disciplina.
Todos os usuários do sistema têm senhas que são utilizadas para validação do respectivo login.

## Sprint 01
Lab01S01: Modelo de Análise: Diagrama de Caso de Uso referente ao sistema + Descrição em Histórias de Usuário em Markdown (.md), no README do Repositório, com arquivo enviado no Canvas. (4 pontos) - 18/08

# Histórias de Usuário

## 1. Realizar Matrícula

**Funcionalidade**: Matrícula de Aluno em Disciplinas

**Como** um aluno,  
**Eu quero** me matricular em até 4 disciplinas obrigatórias e 2 optativas,  
**Para que** eu possa participar das disciplinas durante o semestre.

**Cenário 1**: Matrícula em Disciplinas Disponíveis
- **Dado que** estou logado no sistema e o período de matrículas está aberto,
- **Quando** eu seleciono as disciplinas obrigatórias e optativas disponíveis,
- **Então** minha matrícula é confirmada e eu recebo uma notificação de sucesso.

**Cenário 2**: Limite de Matrículas Excedido
- **Dado que** já me matriculei em 4 disciplinas obrigatórias e 2 optativas,
- **Quando** tento me matricular em uma disciplina adicional,
- **Então** o sistema deve impedir a matrícula e exibir uma mensagem de erro.

**Cenário 3**: Disciplina com Vagas Esgotadas
- **Dado que** estou tentando me matricular em uma disciplina popular,
- **Quando** as vagas dessa disciplina já estão esgotadas,
- **Então** o sistema deve impedir a matrícula e me informar que não há mais vagas disponíveis.

## 2. Cancelar Matrícula

**Funcionalidade**: Cancelamento de Matrículas

**Como** um aluno,  
**Eu quero** cancelar uma matrícula feita anteriormente,  
**Para que** eu possa ajustar minhas disciplinas antes do fechamento do período de matrícula.

**Cenário 1**: Cancelamento Bem-Sucedido
- **Dado que** estou logado no sistema e o período de matrículas está aberto,
- **Quando** seleciono uma disciplina na qual estou matriculado e opto por cancelar a matrícula,
- **Então** minha matrícula é cancelada e a vaga é liberada para outro aluno.

**Cenário 2**: Cancelamento Fora do Período Permitido
- **Dado que** estou tentando cancelar uma matrícula fora do período permitido,
- **Quando** eu tento realizar o cancelamento,
- **Então** o sistema deve impedir a ação e exibir uma mensagem informando que o período de cancelamento está encerrado.

## 3. Consultar Alunos Matriculados

**Funcionalidade**: Consulta de Alunos Matriculados

**Como** um professor,  
**Eu quero** consultar a lista de alunos matriculados em minhas disciplinas,  
**Para que** eu saiba quem estará frequentando minhas aulas.

**Cenário 1**: Consulta Bem-Sucedida
- **Dado que** estou logado no sistema como professor,
- **Quando** eu acesso a área de disciplinas e seleciono uma disciplina específica,
- **Então** o sistema deve exibir a lista de alunos matriculados naquela disciplina.

## 4. Gerar Currículo Semestral

**Funcionalidade**: Criação e Atualização do Currículo Semestral

**Como** um membro da secretaria,  
**Eu quero** criar e atualizar o currículo semestral,  
**Para que** os alunos possam se matricular nas disciplinas oferecidas.

**Cenário 1**: Criação de Novo Currículo
- **Dado que** o período de matrículas está próximo,
- **Quando** eu adiciono novas disciplinas e professores ao currículo semestral,
- **Então** o currículo é salvo e publicado para que os alunos possam visualizar e se matricular.

**Cenário 2**: Atualização de Disciplinas Existentes
- **Dado que** houve alterações em algumas disciplinas,
- **Quando** eu faço atualizações no currículo semestral já publicado,
- **Então** o sistema deve refletir as mudanças e notificar os alunos matriculados nas disciplinas afetadas.

## 5. Notificação de Matrícula

**Funcionalidade**: Notificação ao Sistema de Cobranças

**Como** o sistema de cobranças,  
**Eu quero** ser notificado quando um aluno se matricular,  
**Para que** eu possa gerar as cobranças correspondentes às disciplinas.

**Cenário 1**: Notificação de Matrícula Bem-Sucedida
- **Dado que** um aluno finalizou sua matrícula,
- **Quando** o processo de matrícula é concluído,
- **Então** o sistema de cobranças deve ser notificado com os dados das disciplinas para gerar a cobrança.

## 6. Fechar Matrículas

**Funcionalidade**: Encerramento do Período de Matrículas

**Como** um membro da secretaria,  
**Eu quero** fechar as matrículas no final do período,  
**Para que** eu possa desativar disciplinas que não atingiram o número mínimo de alunos.

**Cenário 1**: Fechamento Bem-Sucedido
- **Dado que** o período de matrículas se encerrou,
- **Quando** eu opto por fechar o período no sistema,
- **Então** todas as matrículas são finalizadas, e as disciplinas com menos de 3 alunos são desativadas.

**Cenário 2**: Disciplinas Desativadas por Baixa Matrícula
- **Dado que** algumas disciplinas não atingiram o número mínimo de alunos,
- **Quando** o período de matrícula é encerrado,
- **Então** essas disciplinas são automaticamente desativadas, e os alunos matriculados são notificados.



## Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/-Java-007396?style=flat&logo=java&logoColor=white)
- ![PlantUML](https://img.shields.io/badge/-PlantUML-1abc9c?style=flat&logo=plantuml&logoColor=white)

## IDE Utilizada

- ![VS Code](https://img.shields.io/badge/-VS%20Code-007ACC?style=flat&logo=visual-studio-code&logoColor=white)

