# Trabalho de Desenvolvimento de Aplicações Mobile I - Unipar

Este projeto consiste em um aplicativo Android desenvolvido em Java, composto por três telas principais, focado em conceitos de Layout, Intents, Ciclo de Vida de Activities e Internacionalização.

## 📱 Funcionalidades

### 1. Tela de Cadastro (Tela 1)
- Utiliza **RelativeLayout** como layout principal.
- Formulário organizado com **LinearLayouts** horizontais para cada campo.
- Validação de tipos de entrada (Teclado numérico para idade e texto para nome/endereço).
- Botão "Salvar" que ocupa toda a largura da tela para enviar dados à segunda tela.
- Ícone customizado (Material Design) para acesso direto à tela "Sobre".

### 2. Tela de Confirmação (Tela 2)
- Exibe os dados recebidos da Tela 1 de forma organizada.
- Botão **SIM**: Exibe um Toast de sucesso, retorna à Tela 1 e limpa os campos de entrada.
- Botão **NÃO**: Retorna à Tela 1 mantendo os dados para edição.

### 3. Tela Sobre (Tela 3)
- Apresenta informações dos integrantes do grupo (Nomes e RAs).
- Detalhes do curso e semestre.
- Layout personalizado com temática Dark e elementos visuais do Material Design.

## 🛠️ Aspectos Técnicos

- **Internacionalização:** Todos os textos do aplicativo (labels, dicas, botões e mensagens) estão devidamente configurados no arquivo `strings.xml`.
- **Ciclo de Vida:** Implementação de logs detalhados para todos os estados das Activities (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).
- **Logs:** Utilização da TAG `"CICLO"` para monitoramento via Logcat.
- **Documentação:** Uso de **Javadocs** em todas as classes para explicar as responsabilidades e funcionamento do código.
- **Design:** Tema customizado com `NoActionBar` para uma interface mais limpa e moderna.

## 👥 Integrantes do Grupo
- **Leonardo Fontana** - RA: 60003437
- **Paulo Ricardo** - RA: 60003496
- **Felipe Coronato** - RA: 60300641

## 🚀 Como Executar
1. Clone o repositório.
2. Abra o projeto no **Android Studio**.
3. Sincronize o Gradle.
4. Execute em um emulador ou dispositivo físico com Android 5.0 (API 21) ou superior.
5. Para ver os logs do ciclo de vida, filtre o **Logcat** pela palavra `CICLO`.
