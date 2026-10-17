package org.example;

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
}
