# aut_web_selenium_java_bdd

<p>Exemplo de automação em Java utilizando BDD, para fins acadêmicos e aprendizado do Selenium</p>

## Ferramentas utilizadas

- Java 17
- JUnit 4
- Cucumber 7


## Execução dos testes com o Maven
Para executar os testes sem utilizar o Allure:

<br>`mvn test clean` -> executa todos os testes com o Maven.


## Execução dos testes com o Allure Reports
Implementação em breve.


## Documentação do projeto.
````
aut_web_selenium_java_bdd
├── src/
│   └── test/
│       └── java/
│           ├── drivers/
│           │   ├── chromedriver/
│           │   │   └── chromedriver.exe
│           │   ├── edgedriver/
│           │   │   └── msedgedriver.exe
│           │   └── geckodriver/
│           │       └── geckodriver.exe
│           ├── pageObjects/
│           │   ├── elements/
│           │   │   ├── HomeElements
│           │   │   └── LoginElements
│           │   └── pages/
│           │       ├── HomePage
│           │       └── LoginPage
│           ├── runners/
│           │   └── TestRunner
│           ├── steps/
│           │   ├── Hooks
│           │   └── LoginSteps
│           └── utils/
│               └── DriverFactory
│       └── resources/
│           └── features/
│               └── Login.feature
├── .gitignore
├── pom.xml
└── README.md
````

- [Documentação oficial](https://www.selenium.dev/documentation/)