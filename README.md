# spring-shop
Данное приложение прелставляет собой аналог современного онлайн приложения магазина.

Используемые модули(технологии):
- boot;  - web;  - security;  - thymeleaf;
- data jp + postgreSQL;  - additional;
- flyway;  - lombok.

ТЗ - функции:
- аутентификация и регистрация пользователей
- просмотр товаров
- добавление к розину
- формирование заказов
- оплата (payPal)
- фильтрация товаров (сортровка)
- управление корзиной
- валидация входных данных
- оповещение по email
- навигация по сайту (бодрую менюшку/поработаем с видом)

  Сущности :Entyties:
1. Product
	- id
	- title
	- price
	- categories
2. User
	- id
	- username
	- email
	- password
	- role
	- archive
	- phone
3. Role
	- user 
	- guest
	- admin
	- manager
4. Order
	- id
	- created date
	- last change date
	- adress
	- user
	- status (NEW, CANCEL, PAID, CLOSED, RETURNED)
	- details (prodact, price, amount, comment)
5. Category
	- id
	- title
6. Bucket
	-id
	-user
	-detauls(product, amount) / product list
