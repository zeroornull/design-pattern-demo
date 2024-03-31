package indi.zeroornull.pattern.builder.funcbuilder.impl1;

import indi.zeroornull.pattern.builder.funcbuilder.Genre;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Client1 {
    public static void main(String[] args) {
        Book book =
            Book.builder().apply(Genre.FANTASY).apply("JK.Rowling").apply("哈利波特与火焰山").apply(LocalDate.of(2000, 7, 8));
        log.info(book.toString());
    }
}
