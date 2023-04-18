package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.data.db.entities.ShoppingItem

interface AddDiologListener {
    fun onAddButtonClicked(item: ShoppingItem)

}