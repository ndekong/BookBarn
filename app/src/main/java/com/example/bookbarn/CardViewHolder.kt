package com.example.bookbarn

import androidx.recyclerview.widget.RecyclerView
import com.example.bookbarn.databinding.CardCellBinding

class CardViewHolder (

    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookListener

        ) : RecyclerView.ViewHolder(cardCellBinding.root)

{
            fun bindbook(books: Books) {

                cardCellBinding.Cover.setImageResource(books.cover)
                cardCellBinding.title.text = books.title
                cardCellBinding.Author.text = books.author


                cardCellBinding.cardView.setOnClickListener {
                    clickListener.OnClick(books)
                }

            }

        }
