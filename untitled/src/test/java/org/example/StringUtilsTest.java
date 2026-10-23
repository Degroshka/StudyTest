package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.StringUtils.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    @DisplayName("TC-2.1.1: Простой палиндром")
        void isPalindrome_true(){
        assertTrue(isPalindrome("racecar"));}
    @Test
    @DisplayName("TC-2.1.2: Не палиндром")
        void isPalindrome_false(){
        assertFalse(isPalindrome("hello"));}
    @Test
    @DisplayName("TC-2.1.3: Пробелы и регистр игнорируются")
        void isPalindrome_spaceAndRegisterIgnored_true(){
        assertTrue(isPalindrome("A man a plan a canal Panama"));}
    @Test
    @DisplayName("TC-2.1.4: Пустая строка")
    void isPalindrome_emptyString_true(){
        assertTrue(isPalindrome(""));}
    @Test
    @DisplayName("TC-2.1.5: null на входе")
    void isPalindrome_nullString_IllegalArgument(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> isPalindrome(null));
        assertEquals("Input cannot be null", exception.getMessage());}
    @Test
    @DisplayName("TC-2.1.6: Знаки препинания игнорируются")
        void isPalindrome_symbolsIgnored_true(){
        assertTrue(isPalindrome("Was it a car, or a cat I saw?"));}
    @Test
    @DisplayName("TC-2.1.7: Русский палиндром")
        void isPalindrome_russianAlphabet_true(){
        assertTrue(isPalindrome("А роза упала на лапу Азора"));}
    @Test
    @DisplayName("TC-2.2.1: Обычная фраза")
        void countWords_twoWords_returnsTwo(){
        assertEquals(2,countWords("hello world"));}
    @Test
    @DisplayName("TC-2.2.2: Много пробелов")
        void countWords_spaceIgnored_returnsThree(){
        assertEquals(3,countWords(" one two three "));}
    @Test
    @DisplayName("TC-2.2.3: Пустая строка")
        void countWords_emptyString_returnsZero(){
        assertEquals(0,countWords(""));}
    @Test
    @DisplayName("TC-2.2.4: Строка из пробелов")
        void countWords_spaceImString_returnsZero(){
        assertEquals(0,countWords("   "));}
    @Test
    @DisplayName("TC-2.2.5: null на входе")
        void countWords_nullString_IllegalArgument(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> countWords(null));
        assertEquals("Input cannot be null",exception.getMessage());}
    @Test
    @DisplayName("TC-2.2.6: Одно слово")
        void countWords_oneWord_returnsOne(){
        assertEquals(1,countWords("hello"));}
    @Test
    @DisplayName("TC-2.3.1: Простая анаграмма")
        void isAnagram_simpleAnagram_returnsTrue(){
        assertTrue(isAnagram("listen","silent"));
    }
    @Test
    @DisplayName("TC-2.3.2: Не анаграмма")
        void isAnagram_NotAnagram_returnsFalse(){
        assertFalse(isAnagram("hello","world"));
    }
    @Test
    @DisplayName("TC-2.3.3: Регистр и пробелы игнорируются")
        void isAnagram_spaceAndRegisterIgnored_returnsTrue(){
        assertTrue(isAnagram("Astronomer","Moon starer"));
    }
    @Test
    @DisplayName("TC-2.3.4: null в любом из аргументов")
        void isAnagram_nullInString_IllegalArgument(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> isAnagram(null,"abc"));
        assertEquals("Arguments cannot be null",exception.getMessage());
    }
    @Test
    @DisplayName("TC-2.3.5: Разная длина")
        void isAnagram_diffLengthArguments_returnsFalse(){
        assertFalse(isAnagram("abc","abcd"));
    }








}

