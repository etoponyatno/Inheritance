package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    Product book1 = new Book(1, "name1", 100, "author1");
    Product book2 = new Book(2, "name2", 200, "author2");
    Product smartphone1 = new Smartphone(3,"name3",1000,"producer1");
    Product smartphone2 = new Smartphone(4,"name4",2000,"producer2");

    @BeforeEach
    void SetUp(){
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
    }

    @Test
    void shouldResearchByText(){
        Product[] expected = new Product[]{smartphone1};
        Product[] actual = manager.searchBy("producer1");
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldSearchBookByAuthor() {
        Product[] expected = new Product[]{book1};
        Product[] actual = manager.searchBy("author1");
        assertArrayEquals(expected,actual);
    }
    @Test
    void shouldSearchBookByName() {
        Product[] expected = new Product[]{book2};
        Product[] actual = manager.searchBy("name2");
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldSearchPhoneByProducer() {
        Product[] expected = new Product[]{smartphone1};
        Product[] actual = manager.searchBy("producer1");
        assertArrayEquals(expected,actual);
    }
    @Test
    void shouldSearchPhoneByName() {
        Product[] expected = new Product[]{smartphone1};
        Product[] actual = manager.searchBy("name3");
        assertArrayEquals(expected,actual);
    }
}