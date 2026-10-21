# BankAccount: unit-тесты на JUnit 5

Учебный проект по автоматизации тестирования: тесты и тестовая документация для набора Java-классов (`BankAccount`, `StringUtils`, `ShoppingCart`, `Product`).
Тестируемые классы даны в рамках обучения, тесты, тест-кейсы и баг-репорты написаны мной.

## Содержимое

- `untitled/src/test`: автотесты на JUnit 5
- `docs/test-cases.md`: тест-кейсы с приоритетами и статусами
- `docs/bug-reports`: найденные дефекты с шагами воспроизведения

## Запуск

Нужны JDK 17+ и Maven:

    mvn test

## Найденные дефекты

| ID | Название | Серьёзность |
|-|-|-|
| [BUG-1](docs/bug-reports/BUG-1-owner-name-digits.md) | Конструктор принимает имя из одних цифр | Minor |
| [BUG-2](docs/bug-reports/BUG-2-deposit-accepts-nan.md) | `deposit` принимает NaN | Major |
| [BUG-3](docs/bug-reports/BUG-3-transfer-to-frozen-loses-money.md) | Перевод на замороженный счёт списывает деньги | Critical |

## Статус

В работе. Покрыто: `BankAccount` 27 тестов. Дальше: `StringUtils`, `ShoppingCart`, затем API-тесты на Groovy + Spock.