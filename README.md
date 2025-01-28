# Interactive Post System

## Descrição

O **Interactive Post System** é um sistema simples de gerenciamento de posts, comentários e interações em um formato de rede social. Os usuários podem criar posts, adicionar e remover comentários, curtir ou descurtir posts, e visualizar a lista de posts interativos.

Este projeto permite que você gerencie posts e suas interações, como likes e comentários, de uma maneira simples e eficiente.

## Funcionalidades

As funcionalidades implementadas até agora incluem:

### 1. **Adicionar um Post**
- O usuário pode adicionar um novo post com um título e conteúdo. O post será armazenado com a data e hora da criação.

### 2. **Adicionar um Comentário**
- O usuário pode adicionar um comentário a um post. O comentário será armazenado dentro da lista de comentários do post selecionado.

### 3. **Adicionar um Like**
- O usuário pode adicionar um like a um post. O número de likes do post será incrementado em 1.

### 4. **Listar Posts**
- O usuário pode visualizar todos os posts criados, incluindo o número de likes, conteúdo e comentários.

### 5. **Remover um Like**
- O usuário pode remover um like de um post, decrementando o número de likes.

## Funções a Implementar

A seguir, estão as funcionalidades que ainda precisam ser implementadas ou melhoradas:

### 1. **Remover um Post**
- Função para permitir ao usuário remover um post da lista de posts. Isso exigirá que o usuário selecione o índice do post e, se o post for válido, ele será removido da lista.

### 2. **Remover um Comentário**
- Função para permitir ao usuário remover um comentário de um post específico. O usuário poderá escolher o post e o comentário a ser removido.

### 3. **Remover um Like (Descurtir)**
- Implementar a opção para "descurtir" um post, removendo um like de um post específico. Embora o código já tenha a função para remover um like, a descrição e o nome da opção no menu podem ser ajustados para algo mais claro, como "Descurtir".

---

## Estrutura do Projeto

### 1. **Menu**: 
A classe responsável pela interação do usuário, mostrando as opções de menu e executando as ações correspondentes.

### 2. **Post**:
Representa um post no sistema, contendo título, conteúdo, data de criação, número de likes e lista de comentários. Permite adicionar e remover likes e comentários.

### 3. **Comment**:
Representa um comentário em um post, com um texto que descreve o conteúdo do comentário.

---

## Como Usar

1. Compile e execute o código em sua IDE ou terminal.
2. O menu principal será exibido, e você pode escolher uma opção digitando o número correspondente.
3. As opções disponíveis são:
   - **1** - Adicionar um post
   - **2** - Adicionar um comentário a um post
   - **3** - Adicionar um like a um post
   - **4** - Listar todos os posts
   - **5** - Remover um post
   - **6** - Remover um comentário de um post
   - **7** - Remover um like de um post
   - **0** - Sair do sistema

---

## Exemplo de Uso

1. Adicionar um post:
   - Digite "1" para adicionar um post.
   - Informe o título e o conteúdo do post.
   
2. Listar posts:
   - Digite "4" para listar todos os posts.
   
3. Adicionar um comentário:
   - Digite "2" para adicionar um comentário a um post.
   - Escolha o índice do post e escreva o comentário.

4. Adicionar um like:
   - Digite "3" para adicionar um like a um post.

---

## Conclusão

O **Interactive Post System** é um projeto simples que visa melhorar as habilidades de programação, manipulando listas, objetos e interações de usuário em um sistema simulado de posts e comentários. Ao longo do desenvolvimento, novas funcionalidades podem ser adicionadas, tornando o sistema mais completo e útil.
