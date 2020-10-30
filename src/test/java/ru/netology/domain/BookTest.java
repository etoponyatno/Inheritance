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
}
