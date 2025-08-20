<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
 
</head>
<body>

  <h1>📌 Projeto Suporte</h1>
  <p>Este repositório contém um sistema de <strong>Suporte Técnico</strong> em desenvolvimento. 
  O objetivo é centralizar chamados, organizar atendimentos e facilitar a gestão de suporte de TI.</p>

  <h2>🚀 Tecnologias Utilizadas</h2>
  <ul>
    <li>Java (Spring Boot)</li>
    <li>Angular</li>
    <li>PostgreSQL/MySQL</li>
    <li>Git/GitHub</li>
  </ul>

  <h2>⚙️ Funcionalidades</h2>
  <ul>
    <li>[ ] Cadastro de usuários e clientes</li>
    <li>[ ] Registro de chamados (tickets)</li>
    <li>[ ] Acompanhamento de status dos chamados</li>
    <li>[ ] Painel administrativo</li>
    <li>[ ] Relatórios de atendimento</li>
  </ul>

  <h2>📂 Estrutura do Projeto</h2>
  <pre><code>
Suporte/
 ├── backend/       # Código do servidor (Spring Boot)
 ├── frontend/      # Interface do usuário (Angular)
 ├── docs/          # Documentação
 └── README.md      # Este arquivo
  </code></pre>

  <h2>🛠️ Como Executar Localmente</h2>

  <h3>Pré-requisitos</h3>
  <ul>
    <li><a href="https://adoptium.net/">Java 17+</a></li>
    <li><a href="https://nodejs.org/">Node.js 18+</a></li>
    <li><a href="https://www.postgresql.org/">PostgreSQL</a></li>
  </ul>

  <h3>Passos</h3>
  <ol>
    <li><strong>Clonar o repositório</strong>
      <pre><code>git clone https://github.com/rafaelmsp/Suporte.git
cd Suporte</code></pre>
    </li>

    <li><strong>Rodar o backend</strong>
      <pre><code>cd backend
./mvnw spring-boot:run</code></pre>
    </li>

    <li><strong>Rodar o frontend</strong>
      <pre><code>cd frontend
npm install
ng serve</code></pre>
    </li>

    <li><strong>Acessar no navegador</strong>
      <pre><code>http://localhost:4200</code></pre>
    </li>
  </ol>

  <h2>📖 Documentação</h2>
  <p>A documentação detalhada está disponível na pasta <code>/docs</code>. Inclui casos de uso, diagramas e planejamento do sistema.</p>

  <h2>🤝 Contribuição</h2>
  <p>Contribuições são bem-vindas!</p>
  <ol>
    <li>Faça um fork do projeto</li>
    <li>Crie uma branch para sua feature:
      <pre><code>git checkout -b feature/nova-feature</code></pre>
    </li>
    <li>Commit suas mudanças:
      <pre><code>git commit -m "Adiciona nova feature"</code></pre>
    </li>
    <li>Faça push para a branch:
      <pre><code>git push origin feature/nova-feature</code></pre>
    </li>
    <li>Abra um Pull Request</li>
  </ol>

  <h2>📄 Licença</h2>
  <p>Este projeto está sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>

  <h2>👤 Autor</h2>
  <p><strong>Rafael Moraes da Silva Passos</strong><br>
  🔗 <a href="https://github.com/rafaelmsp">GitHub</a></p>

</body>
</html>
