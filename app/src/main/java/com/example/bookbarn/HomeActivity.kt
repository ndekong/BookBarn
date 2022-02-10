package com.example.bookbarn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookbarn.databinding.ActivityHomeBinding

class HomeActivity: AppCompatActivity() , BookListener {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        populateBooks()

        val HomeActivity = this
        binding.recyclerView.apply {

            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList, HomeActivity)
        }


    }

    override fun OnClick(books: Books) {
        val intent = Intent(applicationContext, BookDetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, books.id)
        startActivity(intent)
    }

    private fun populateBooks() {
        val book1 = Books(

            R.drawable.moagd,
            "Yakuza Moon: \n MEMOIRS OF A GANGSTER'S DAUGHTER",
            "SHOKO TENDO",
            "Born to a wealthy and powerful yakuza boss, Shoko Tendo lived the early years of her life in luxury. However, when she was six, everything changed: her father was jailed, and the family fell into debt. Bullied by her classmates because of her father’s activities, and terrorized at home by her father, who became a drunken, violent monster after his release from prison, Tendo rebelled. As a teenager she became a drug addict and a member of a girl gang. At the age of 15 she spent eight months in a juvenile detention center after getting into a fight with another gang.",

            )
        bookList.add(book1)

        val book2 = Books(

            R.drawable.dfmf,
            "Dreams From My Father",
            "Barack Obama",
            "In this lyrical, unsentimental, and compelling memoir, the son of a black African father and a white American mother searches for a workable meaning to his life as a black American. It begins in New York, where Barack Obama learns that his father—a figure he knows more as a myth than as a man—has been killed in a car accident. This sudden death inspires an emotional odyssey—first to a small town in Kansas, from which he retraces the migration of his mother’s family to Hawaii, and then to Kenya, where he meets the African side of his family, confronts the bitter truth of his father’s life, and at last reconciles his divided inheritance."
        )
        bookList.add(book2)


    }




}