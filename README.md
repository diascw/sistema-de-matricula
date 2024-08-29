# Laboratório de Desenvolvimento de Software

## Alunos integrantes da equipe
* Júlia Resende | 1313121@sga.pucminas.br
* Leandra Ramos | 1402897@sga.pucminas.br
* Wanessa Dias  | 815234@sga.pucminas.br

## Professor responsável
* Cristiano Neto

# Sistema de Matrículas Universitário

O **Sistema de Matrículas Universitário** foi desenvolvido para informatizar o processo de matrículas e gerenciar a administração acadêmica de uma universidade. Este sistema oferece uma solução integrada para a gestão de disciplinas, cursos, matrículas de alunos e notificações de cobranças, além de permitir que professores acessem informações relevantes sobre suas disciplinas.

## Funcionalidades

### Gestão de Disciplinas e Cursos
- **Currículo Semestral**: Permite à secretaria da universidade gerar e manter o currículo para cada semestre.
- **Disciplinas**: Cadastro de disciplinas com informações sobre nome, créditos e requisitos.
- **Cursos**: Cada curso é definido com um nome, número de créditos e um conjunto de disciplinas associadas.

### Matrículas de Alunos
- **Matrículas**: Os alunos podem se matricular em até 4 disciplinas obrigatórias e em até 2 disciplinas optativas por semestre.
- **Períodos de Matrícula**: Acesso ao sistema para matrículas e cancelamentos de acordo com os períodos definidos.
- **Limitações de Matrículas**:
  - **Número Mínimo de Alunos**: Uma disciplina só será oferecida no próximo semestre se tiver pelo menos 3 alunos inscritos. Caso contrário, será cancelada.
  - **Número Máximo de Alunos**: O máximo de alunos por disciplina é limitado a 60. Quando esse limite é alcançado, novas inscrições são encerradas automaticamente.

### Gestão de Professores
- **Visualização de Matrículas**: Professores podem acessar informações sobre os alunos matriculados em suas disciplinas.

### Sistema de Cobranças
- **Notificação de Matrículas**: Após a matrícula, o sistema de matrículas notifica o sistema de cobranças para que os alunos sejam cobrados pelas disciplinas no semestre.

## Tecnologias Utilizadas
- ![Java](https://img.shields.io/badge/-Java-007396?style=flat&logo=java&logoColor=white)
- ![PlantUML](https://img.shields.io/badge/-PlantUML-1abc9c?style=flat&logo=plantuml&logoColor=white)

  
## IDE Utilizada
- ![VS Code](https://img.shields.io/badge/-VS%20Code-007ACC?style=flat&logo=visual-studio-code&logoColor=white)
