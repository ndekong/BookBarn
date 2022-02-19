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

        val book3 = Books(

            R.drawable.ftysog,
            "Fifty Shades Of Grey",
            "EL James",
            "When literature student Anastasia Steele goes to interview young entrepreneur Christian Grey, she encounters a man who is beautiful, brilliant, and intimidating. The unworldly, innocent Ana is startled to realize she wants this man and, despite his enigmatic reserve, finds she is desperate to get close to him. Unable to resist Ana's quiet beauty, wit, and independent spirit, Grey admits he wants her, too--but on his own terms. Shocked yet thrilled by Grey's singular erotic tastes, Ana hesitates. For all the trappings of success--his multinational businesses, his vast wealth, his loving family--Grey is a man tormented by demons and consumed by the need to control. When the couple embarks on a daring, passionately physical affair, Ana discovers Christian Grey's secrets and explores her own dark desires."
        )
        bookList.add(book3)

        val book4 = Books(

            R.drawable.ftysdkr,
            " Fifty Shades Darker",
            "EL James",
            "Daunted by the singular tastes and dark secrets of the beautiful, tormented young entrepreneur Christian Grey, Anastasia Steele has broken off their relationship to start a new career with a Seattle publishing house.\n" +
                    "\n" +
                    "But desire for Christian still dominates her every waking thought, and when he proposes a new arrangement, Anastasia cannot resist. They rekindle their searing sensual affair, and Anastasia learns more about the harrowing past of her damaged, driven and demanding Fifty Shades.\n" +
                    "\n" +
                    "While Christian wrestles with his inner demons, Anastasia must confront the anger and envy of the women who came before her, and make the most important decision of her life."
        )
        bookList.add(book4)

        val book5 = Books(

            R.drawable.ftysfreed,
            "Fifty Shades Freed",
            "EL James",
            "When unworldly student Ana Steele first encountered the driven, damaged young entrepreneur Christian Grey, it sparked a sensual affair that changed both their lives irrevocably. Shocked, intrigued, and ultimately repelled by Christian's singular sexual tastes, Ana demanded a deeper commitment; determined to keep her, Christian agreed. Now, together, they have more-love, passion, intimacy, wealth, and a world of infinite possibilities. But Ana always knew that loving her Fifty Shades would not be easy and being together poses challenges neither of them ever anticipated. Ana must somehow learn to share Christian's opulent lifestyle without sacrificing her own integrity, identity, or independence; Christian must somehow overcome his compulsion to control and lay to rest the horrors that blighted his past and haunt his present. Just when it seems that together their love can conquer any obstacle, tragedy, malice and fate combine to make Ana's worst nightmares come true. Alone and desperate, she must face down the poisoned legacy of Christian's past. Seductive, shocking, sad, and funny, Fifty Shades Freed is the compelling final volume in the Fifty Shades trilogy."
        )
        bookList.add(book5)

        val book6 = Books(
            R.drawable.tmyd,
            "Tell Me Your Dreams",
            "Sidney Sheldon",
            "The fast-paced novel from the internationally bestselling author of The Best Laid Plans, Morning, Noon & Night and Bloodline.\n" +
                    "\n" +
                    "Someone was following her. She had read about stalkers, but they belonged in a different, faraway world. She had no idea who it could be, who would want to harm her. She was trying desperately hard not to panic, but lately her sleep had been filled with nightmares, and she had awakened each morning with a feeling of impending doom.\n" +
                    "\n" +
                    "Thus begins Sidney Sheldon’s chilling novel, Tell Me Your Dreams. Three beautiful young women are suspected of committing a series of brutal murders. The police make an arrest that leads to one of the most bizarre murder trials of the century. Based on actual events, Sheldon’s novel races from London to Rome to Quebec City to San Francisco, with a climax that will leave the reader stunned."
        )
        bookList.add(book6)


    }




}