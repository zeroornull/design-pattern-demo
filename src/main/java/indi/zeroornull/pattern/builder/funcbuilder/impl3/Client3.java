package indi.zeroornull.pattern.builder.funcbuilder.impl3;

import java.time.LocalDate;

import indi.zeroornull.pattern.builder.funcbuilder.Genre;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client3 {
    public static void main(String[] args) {
        Book book = Book.builder().addGenre(Genre.FANTASY).addAuthor("JK.Rowling").addTitle("哈利波特与死亡摇滚")
            .addLocalDate(LocalDate.of(2006, 12, 21));
        log.info(book.toString());
    }
}
