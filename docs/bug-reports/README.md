    # Найденные дефекты

| ID                                    | Название | Серьёзность | Статус | Тест-кейс |
|---------------------------------------|----------|-------------|--------|-----------|
| [BUG-1](BUG-1-owner-name-digits.md)   | Имя владельца из одних цифр принимается | Minor       | Open | TC-1.2.10 |
| [BUG-2](BUG-2-deposit-accepts-nan.md) | `deposit(NaN)` принимается, баланс становится `NaN` | Major       | Open | TC-1.2.11 |
| [BUG-3](BUG-3-transfer-to-frozen-loses-money.md) | `BankAccount.transferTo` снимает деньги при переводе на замороженный счёт | Critical    | Open | TC-1.4.4  |