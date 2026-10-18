package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTests{
     @Test
     @DisplayName("TC-1.1.1: Пополнение увеличивает баланс")
        void Deposit_IncreaseBalanceTest(){
         BankAccount acc =new BankAccount("Alice",500.0);
         acc.deposit(200.0);
         assertEquals(700.0,acc.getBalance(),0.001);
     }
     @Test
     @DisplayName("TC-1.1.2: Снятие уменьшает баланс")
        void Withdraw_DecreaseBakanceTest(){
         BankAccount acc= new BankAccount("Alice",500.0);
         acc.withdraw(100.0);
         assertEquals(400,acc.getBalance(),0.001);
     }
     @Test
     @DisplayName("TC-1.1.3: Владелец возвращается корректно")
        void GetOwner_BalanceTest() {
         BankAccount acc=new BankAccount("Tricia",500.0);
         assertEquals("Tricia",acc.getOwner());
     }
     @Test
     @DisplayName("TC-1.1.4: Новый счёт не заморожен")
        void IsFrozen_BalanceTest(){
         BankAccount acc =new BankAccount("Pike",500.0);
         assertFalse(acc.isFrozen());
     }
    @Test
    @DisplayName("TC-1.2.1: Снятие больше, чем на счёте")
        void MoreThanHave_BalanceTest(){
         BankAccount acc = new BankAccount("Alice",250.0);
         Throwable exception=assertThrows(IllegalStateException.class,()->acc.withdraw(260));
         assertEquals("Insufficient funds",exception.getMessage());

    }
    @Test
    @DisplayName("TC-1.2.2: Пополнение отрицательной суммой")
        void NegativeDeposit_BalanceTest(){
         BankAccount acc = new BankAccount("Alice",300.0);
         Throwable exception = assertThrows(IllegalArgumentException.class,()-> acc.deposit(-250.0));
         assertEquals("Deposit amount must be positive",exception.getMessage());
     }
    @Test
    @DisplayName("TC-1.2.3: Снятие нуля")
        void NullWithdraw_BalanceTest(){
         BankAccount acc = new BankAccount("Alice",250.0);
         Throwable exception = assertThrows(IllegalArgumentException.class,()->acc.withdraw(0));
         assertEquals("Withdrawal amount must be positive",exception.getMessage());
    }
    @Test
    @DisplayName("TC-1.2.4: Создание счёта с отрицательным балансом")
        void CreateNegativeAcc_BalanceTest(){
         IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->new BankAccount("Vasya",-300));
         assertEquals("Initial balance cannot be negative",exception.getMessage());
    }
    @Test
    @DisplayName("TC-1.2.5: Создание счёта с null именем")
        void CreateNullName_OwnerTest(){
         IllegalArgumentException exception =assertThrows(IllegalArgumentException.class,()->new BankAccount(null,250));
         assertEquals("Owner name cannot be blank",exception.getMessage());
    }
    @Test
    @Disabled("BUG-1: Конструктор принмает имя из одних цифр")
    @DisplayName("TC-1.2.10: Имя счета из одних цифр отклоняется")
    void CreateAccount_NumericOwner_throwsIllegalTest(){
         assertThrows(IllegalArgumentException.class,()-> new BankAccount("1234",300));
     }
}
