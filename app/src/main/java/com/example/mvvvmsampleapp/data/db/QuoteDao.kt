package com.example.mvvvmsampleapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvvmsampleapp.data.db.entities.Quote

@Dao
interface QuoteDao {

    @Insert
    fun saveAllQuotes(quotes: List<Quote>)

    @Query("SELECT * FROM Quote")
    fun getQuotes(): LiveData<List<Quote>>


}