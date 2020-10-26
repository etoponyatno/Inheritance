package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {
  Product book1 = new Book(1, "name1", 100, "author1");


  @Test
  public void shouldMatchName() {
    String text = "name1";
    assertTrue(book1.matches(text));
  }



//  @Test
//  public void shouldHaveAllFieldsAndMethodFromSuperClass() {
//    Book book = new Book();
//    book.
//  }


//  @Test
//  public void shouldCastFromBaseClass() {
//    Product product = new Book();
//    if (product instanceof Book) {
//      Book book = (Book) product;
////      book.
//    }
//  }

//  @Test
//  public void shouldNotCastToDifferentClass() {
//    Product product = new Book();
//    Smartphone book = (Smartphone) product;
//  }

//  @Test
//  public void shouldUseOverridedMethod() {
//    Product product = new Book();
//    // Вопрос к аудитории: чей метод вызовется?
//    product.toString();
//  }
}
