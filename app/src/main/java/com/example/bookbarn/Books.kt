package com.example.bookbarn

var bookList = mutableListOf<Books>()

val BOOK_ID_EXTRA = "bookExtra"

class Books (

    var cover: Int ,
    var title: String ,
    var author: String ,
    var description: String ,
    val id: Int? = bookList.size

)