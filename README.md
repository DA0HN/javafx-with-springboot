# Spring Boot + JavaFx

Implementação de uma aplicação desktop feita em JavaFx (v11+)
em conjunto com todo o ambiente do Framework Spring


### Passo a passo

1. Criar um projeto Spring Boot
2. Adicionar um proxy que faz entrypoint entre o Spring e o Javafx
    - `JavaFxApplication.java`
    - `StageInitializer.java`
    - `ApplicationBootLoader.java`
3. Inicializar o stage da aplicação na classe `StageInitializer.java`
4. Adicionar integração com JavaFx Weaver


### Links úteis

- [JavaFx Weaver](https://github.com/rgielen/javafx-weaver)
- [JavaFx + Spring Boot](https://www.vojtechruzicka.com/javafx-spring-boot/)
- [Introducing FxWeaver](https://rgielen.net/posts/2019/introducing-fxweaver-dependency-injection-support-for-javafx-and-fxml/)
- [Video Spring Tips: JavaFx](https://www.youtube.com/watch?v=lPy9mc_O_gU)
- [Spring Tips: JavaFx Repository](https://github.com/spring-tips/javafx)
- [Video Fully Reative: Spring, Kotlin and JavaFx Playing Together](https://www.youtube.com/watch?v=Lse51SpfKHo)
- [Video Integrating Spring Boot with JavaFx](https://www.youtube.com/watch?v=hjeSOxi3uPg)
