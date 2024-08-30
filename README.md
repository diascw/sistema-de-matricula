# Sistema de Matrículas da Universidade
## Equipe de Desenvolvimento

- **Wanessa Dias**
- **Leandra Ramos**
- **Julia Resende**

## Professor

- **Cristiano Neto**

## Curso

- **Engenharia de Software - 4º período**

## Descrição do Projeto

Este projeto visa a informatização do sistema de matrículas de uma universidade, permitindo a gestão de cursos, disciplinas, professores, alunos e suas respectivas matrículas. O sistema oferece funcionalidades como matrícula em disciplinas, cancelamento de matrículas, consulta de alunos matriculados por professores e notificação ao sistema de cobranças.

## Funcionalidades Principais

- **Gestão de Disciplinas e Cursos:** A secretaria pode criar e manter informações sobre os cursos e disciplinas oferecidos, incluindo o número de créditos e o professor responsável.
- **Matrícula de Alunos:** Os alunos podem se matricular em até 4 disciplinas obrigatórias e 2 disciplinas optativas por semestre.
- **Cancelamento de Matrículas:** Durante o período de matrículas, os alunos podem cancelar disciplinas em que estejam matriculados.
- **Validação de Disciplinas:** As disciplinas só são ativadas se tiverem, no mínimo, 3 alunos inscritos ao final do período de matrículas.
- **Limite de Inscrições:** Cada disciplina pode ter no máximo 60 alunos. Ao atingir esse número, novas matrículas são encerradas.
- **Notificação ao Sistema de Cobranças:** Após a matrícula, o sistema notifica o sistema de cobranças para que o aluno seja cobrado pelas disciplinas escolhidas.
- **Consulta de Matrículas por Professores:** Os professores podem acessar o sistema para consultar quais alunos estão matriculados em suas disciplinas.


## Estrutura do Projeto

O projeto é dividido nas seguintes classes principais:

- **Curso:** Representa um curso oferecido pela universidade, com informações como nome e número de créditos.
- **Disciplina:** Contém informações sobre uma disciplina, incluindo o professor responsável e a lista de alunos matriculados.
- **Aluno:** Representa um aluno, contendo seus dados pessoais e as disciplinas em que está matriculado.
- **Professor:** Armazena informações sobre um professor, permitindo a consulta das disciplinas que ele leciona.
- **Secretaria:** Responsável por gerar o currículo semestral e gerenciar as disciplinas e cursos.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para o desenvolvimento do sistema.
- **Persistência em Arquivos:** Utilização de arquivos de texto para armazenamento dos dados.

## Como Executar

1. Clone o repositório do projeto.
2. Compile e execute o sistema no ambiente de sua preferência.
3. Utilize o terminal para interagir com o sistema, inserindo informações como nome, matrícula, e disciplinas desejadas.



