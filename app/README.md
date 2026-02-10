# 📝 Lista de Tarefas - Jetpack Compose

<div align="center">
  
  ![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
  ![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
  ![Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5+-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
  ![Material3](https://img.shields.io/badge/Material%203-Design-6200EE?style=for-the-badge)
  ![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

  <p>
    <strong>Um aplicativo moderno e elegante de lista de tarefas construído com Jetpack Compose e Material Design 3</strong>
  </p>

</div>

---

## 📱 Screenshots

<div align="center">
  <img src="screenshots/screenshot_empty.png" alt="Tela Vazia" width="250"/>
  <img src="screenshots/screenshot_tasks.png" alt="Lista de Tarefas" width="250"/>
</div

---

## ✨ Funcionalidades

- ✅ **Adicionar Tarefas** - Interface intuitiva com campo de texto e botão flutuante
- ✅ **Marcar como Concluída** - Checkbox interativo com feedback visual
- ✅ **Remover Tarefas** - Botão de exclusão com ícone Material
- ✅ **Contador Inteligente** - Exibe o total de tarefas no título
- ✅ **Estatísticas em Tempo Real** - BottomBar com total, concluídas e pendentes
- ✅ **Estado Vazio Amigável** - Mensagem motivadora quando não há tarefas
- ✅ **Tema Adaptativo** - Suporte a modo claro e escuro
- ✅ **Design Responsivo** - Funciona em diferentes tamanhos de tela
- ✅ **Animações Suaves** - Transições fluidas com Compose

---

## 🏗️ Arquitetura

Este projeto segue as **melhores práticas** de desenvolvimento Android com uma arquitetura modular e limpa:

```
com.example.todoapp/
│
├── 📱 MainActivity.kt                # Activity principal (80 linhas)
│
├── 🧩 components/                    # Componentes UI reutilizáveis
│   ├── TodoTopBar.kt                # Barra superior com contador
│   ├── TodoBottomBar.kt             # Estatísticas (total, concluídas, pendentes)
│   ├── TaskInput.kt                 # Campo de entrada + FAB
│   ├── TaskItem.kt                  # Card de tarefa individual
│   └── TaskList.kt                  # Lista com LazyColumn
│
├── 📊 model/                         # Modelos de dados
│   └── Task.kt                      # Data class da tarefa
│
└── 🎨 ui/theme/                      # Tema Material 3
    ├── Color.kt                     # Paleta de cores
    ├── Theme.kt                     # Configuração do tema
    └── Type.kt                      # Tipografia
```

### 🎯 Princípios Aplicados

- **Single Responsibility Principle** - Cada componente tem uma única responsabilidade
- **Separation of Concerns** - UI separada da lógica de negócio
- **Composition over Inheritance** - Composição de componentes pequenos
- **Unidirectional Data Flow** - Estado desce, eventos sobem
- **Clean Code** - Código legível e autodocumentado

---

## 🔧 Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|-----------|--------|-----------|
| **Kotlin** | 1.9+ | Linguagem moderna e concisa |
| **Jetpack Compose** | 1.5+ | UI declarativa e reativa |
| **Material 3** | Latest | Design system do Google |
| **State Management** | Compose | `remember` e `mutableStateOf` |
| **Android SDK** | 24+ | Compatível com 95%+ dispositivos |

---

## 🚀 Como Executar

### Pré-requisitos

- Android Studio Hedgehog (2023.1.1) ou superior
- JDK 17 ou superior
- Android SDK 34
- Dispositivo físico ou emulador com API 24+

### Passos

1. **Clone o repositório**
   ```bash
   git clone https://github.com/TallesGuerra/ListaDeTarefas.git
   cd todo-app-compose
   ```

2. **Abra no Android Studio**
   - File → Open → Selecione a pasta do projeto

3. **Sincronize as dependências**
   - O Gradle sincronizará automaticamente
   - Aguarde a conclusão (pode levar alguns minutos na primeira vez)

4. **Execute o aplicativo**
   - Clique em "Run" (▶️) ou pressione `Shift + F10`
   - Selecione um dispositivo ou emulador
   - Aguarde a instalação e aproveite!

---

## 📦 Dependências Principais

```gradle
dependencies {
    // Core Android
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    
    // Jetpack Compose
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2024.02.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    
    // Debug
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
```

---

## 🎨 Componentes Detalhados

### TodoTopBar
Barra superior que exibe o título do app e contador dinâmico de tarefas.

**Features:**
- Contador de tarefas no título
- Cores Material 3
- Design responsivo

### TodoBottomBar
Barra inferior com estatísticas em tempo real das tarefas.

**Features:**
- Total de tarefas
- Tarefas concluídas
- Tarefas pendentes
- Divisores verticais elegantes
- Aparece apenas quando há tarefas

### TaskInput
Campo de entrada com botão flutuante para adicionar novas tarefas.

**Features:**
- TextField com placeholder
- FloatingActionButton (FAB)
- Validação de entrada vazia
- Callbacks para estado

### TaskItem
Card individual representando uma tarefa.

**Features:**
- Checkbox interativo
- Texto com estilo condicional
- Texto riscado quando concluída
- Botão de exclusão
- Elevação sutil

### TaskList
Lista otimizada de tarefas com LazyColumn.

**Features:**
- Renderização eficiente
- Contador de tarefas
- Estado vazio com mensagem
- Espaçamento entre items

---

## 💡 Conceitos Aprendidos

### Jetpack Compose
- ✅ Composables e recomposição
- ✅ Layouts (Column, Row, LazyColumn, Box)
- ✅ Modificadores customizados
- ✅ Material 3 components
- ✅ Estado e ciclo de vida

### Gerenciamento de Estado
- ✅ `remember` - Preserva estado durante recomposições
- ✅ `mutableStateOf` - Estado reativo
- ✅ State hoisting - Elevar estado para compartilhar
- ✅ Estado derivado (computed values)
- ✅ Imutabilidade de dados

### Arquitetura
- ✅ Componentes reutilizáveis
- ✅ Separação de responsabilidades
- ✅ Props e callbacks
- ✅ Unidirectional data flow
- ✅ Clean Code

### UI/UX
- ✅ Material Design 3
- ✅ Feedback visual
- ✅ Estados vazios
- ✅ Iconografia
- ✅ Responsividade

---

## 🔄 Roadmap

### Versão Atual (1.0) ✅
- [x] Adicionar, completar e deletar tarefas
- [x] Interface básica com Material 3
- [x] Arquitetura modular
- [x] TopBar e BottomBar
- [x] Componentes isolados
- [x] Estatísticas em tempo real

### Próximas Versões

#### Versão 1.1 🚧
- [ ] Edição de tarefas existentes
- [ ] Animações de transição
- [ ] Gesture swipe para deletar

#### Versão 2.0 🎯
- [ ] Persistência com Room Database
- [ ] ViewModel + Repository pattern
- [ ] Categorias/Tags de tarefas
- [ ] Filtros (todas, pendentes, concluídas)
- [ ] Ordenação customizada

#### Versão 3.0 🚀
- [ ] Sincronização em nuvem
- [ ] Compartilhamento de listas
- [ ] Notificações e lembretes
- [ ] Widget para tela inicial
- [ ] Suporte a múltiplas listas

---

## 📊 Comparação Antes/Depois da Refatoração

| Aspecto | Versão Inicial | Versão Atual |
|---------|---------------|--------------|
| **MainActivity** | ~300 linhas | 80 linhas ✅ |
| **Arquitetura** | Monolítica | Modular ✅ |
| **Componentes** | Tudo junto | 5 arquivos separados ✅ |
| **Reutilização** | Difícil | Fácil ✅ |
| **Manutenção** | Complexa | Simples ✅ |
| **Testabilidade** | Baixa | Alta ✅ |
| **Features** | Básicas | Avançadas ✅ |

---

## 🎓 Para Quem é Este Projeto?

### 🌱 Iniciantes
Aprenda os fundamentos do Jetpack Compose:
- Como criar interfaces declarativas
- Gerenciamento básico de estado
- Material Design 3
- Arquitetura de componentes

### 💼 Intermediários
Explore conceitos avançados:
- State hoisting pattern
- Arquitetura modular escalável
- Boas práticas de código
- Padrões de design

### 🚀 Avançados
Use como base para:
- Implementar persistência (Room)
- Adicionar injeção de dependências (Hilt)
- Integrar com backend
- Aplicar testes unitários

---

## 📚 Recursos de Aprendizado

### Documentação Oficial
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material Design 3](https://m3.material.io/)
- [State in Compose](https://developer.android.com/jetpack/compose/state)
- [Thinking in Compose](https://developer.android.com/jetpack/compose/mental-model)

### Guias do Projeto
- [ARCHITECTURE.md](ARCHITECTURE.md) - Guia completo da arquitetura
- [Código fonte comentado](MainActivity.kt) - Implementação detalhada

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para:

1. 🍴 Fazer fork do projeto
2. 🌿 Criar uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push para a branch (`git push origin feature/AmazingFeature`)
5. 🎉 Abrir um Pull Request

### Diretrizes
- Mantenha o código limpo e bem documentado
- Siga os padrões de código existentes
- Adicione testes quando apropriado
- Atualize a documentação se necessário

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

```
MIT License

Copyright (c) 2024 Todo App Compose

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction...
```

---

## 👨‍💻 Autor 

- 📧 Email: talles-guerra@hotmail.com
- 💼 LinkedIn: [Talles Guerra](https://www.linkedin.com/in/talles-guerra/)
- 🐙 GitHub: [@TallesGuerra](https://github.com/TallesGuerra)

---

## ⭐ Mostre seu Apoio

Se este projeto foi útil para você, considere dar uma ⭐ no repositório!

---


<div align="center">
  <p>
    <strong>Feito com ❤️ e Jetpack Compose</strong>
  </p>
  <p>
    <sub>2026 • Todo App</sub>
  </p>
</div>