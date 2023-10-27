# Trqyvjnixqfmmyvabznc

## Описание программы
Это Rest Api программа с подключениями на две базы данных Postgresql и MongoDB. <br>
Версия SpringBoot 3.1.5 <br>
Версия Java: 17 <br>
Для сборки программы использован Gradle

## Запуск программы
Сначало вам надо клонировать проект с Github. <br>
После чего в файле application.properties вам надо указать ваш **username**,
**password** и **spring.datasource.url** для коннекшн с базой Postgresql. <br>
На поле  **spring.data.mongodb.uri** после // напишите ваш логин и пароль от MongoDB
через : . <br>
В структуре пректа есть файл **Collection.postman_collection.json** с готовыми реквестами <br>
для проверки программы.

### PS
В проект добавлен liquibase но в application.properties файле он выключен.<br> 
У меня вышла ошибка и я не успел ее пофиксть. Вместо этого я добавил **PostConstruct** 

