# Автотесты для сайта [Alfabank](https://alfabank.ru)
____
## ⚙️: Стек технологий
<p>
<a href="https://www.java.com/"><img height="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg"></a>
<a href="https://www.jetbrains.com/idea/"><img height="50" src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg"></a>
<a href="https://gradle.org/"><img height="50" src="https://upload.wikimedia.org/wikipedia/commons/c/cb/Gradle_logo.png"></a>
<a href="https://selenide.org/"><img height="50" src="https://selenide.org/images/selenide-logo-big.png"></a>
<a href="https://junit.org/junit5/"><img height="50" src="https://junit.org/junit5/assets/img/junit5-logo.png"></a>
<a href="https://aerokube.com/selenoid/"><img height="50" src="https://aerokube.com/selenoid/images/aerokube_logo.svg"></a>
<a href="https://www.jenkins.io/"><img height="50" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Jenkins_logo.svg/226px-Jenkins_logo.svg.png?20120629215426"></a>
<a href="https://github.com/allure-framework/allure2"><img height="50" src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4"></a>
<a href="https://web.telegram.org/"><img height="50" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Telegram_logo.svg/768px-Telegram_logo.svg.png"></a>
<a href="https://github.com/"><img height="50" src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png"></a>  
<a href="https://qameta.io/"><img height="50" src="https://qameta.io/assets/testopslogo.svg"></a>
<a href="https://www.atlassian.com/"><img height="50" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Jira_%28Software%29_logo.svg/798px-Jira_%28Software%29_logo.svg.png?20191008180352"></a>  
</p>


---
## :rocket: Запуск автотестов
---
**Команда запуска тестов из терминала**
```
gradle clean test -Dbrowser=chrome -Dversion=99.0 -DbrowserSize=1920x1080
```
---
**Обязательно для использования Selenoid**
+ Создать в папке <code>src/test/resources/config</code> credentials.properties
+ В credentials.properties указать:
  + login=логин от Selenoid
  + password=пароль от Selenoid

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Jenkins_logo.svg/226px-Jenkins_logo.svg.png?20120629215426"> [Сборка](https://jenkins.autotests.cloud/job/08_shizako_13_alfa/)
**Шаги для запуска тестов:**
1. Зайти в сборку
2. Перейти в раздел <code>Собрать с параметрами</code>
3. Выбрать необходимые параметры
4. Нажать кнопку <code>Собрать</code>

<p align="center">
<img title="Jenkins Build" src="files/jenkins.png">
</p>

___
## <img width="4%" style="vertical-align:middle" title="Allure Report" src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4"> [Пример Allure-отчета](https://jenkins.autotests.cloud/job/08_shizako_13_alfa/17/allure/)


<p align="center">
<img title="Allure Overview" src="files/allure-report.png">
</p>

___
