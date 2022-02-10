package com.example.bookbarn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookbarn.databinding.ActivityBookDetailBinding

class BookDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val bookID = intent.getIntExtra(BOOK_ID_EXTRA, -1)
        val book = bookFromID(bookID)

        if (book != null)
        {
            binding.Cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.Author.text= book.author
            binding.Description.text = book.description
        }


    }

    private fun bookFromID(bookID: Int): Books?
    {
        for (book in bookList)

        {
            if (book.id == bookID)
                return book
        }
        return null

    }
}
