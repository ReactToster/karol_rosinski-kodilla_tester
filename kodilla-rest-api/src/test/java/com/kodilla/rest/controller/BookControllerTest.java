package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class BookControllerTest {
    private BookService bookServiceMock;
    private BookController bookController;

    private List<BookDto> bookDtoList;

    @BeforeEach
    public void setUp() {
        bookServiceMock = Mockito.mock(BookService.class);
        bookController = new BookController(bookServiceMock);
        bookDtoList = new ArrayList<>();
    }

    @Test
    public void shouldFetchBooks() {
        //given
        bookDtoList.add(new BookDto("Title 1", "Author 1"));
        bookDtoList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookDtoList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void shouldAddBook() {
//        List<BookDto> spyOnList = Mockito.spy(bookDtoList);
        BookDto bookDto = new BookDto("Title 1", "Author 1");

        //when
        bookController.addBook(bookDto);

        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }

}