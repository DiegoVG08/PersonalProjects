package com.example.nertesting

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.Context
import android.content.ContentValues



class DBHandler(context: Context, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        Val Create_Contact_Table = ("Create Table" + Table_contact + "(" + KEY_ID + " Integer Primary Key"+
                KEY_Email + "Text" + Key_Password "text" + Key_PhoneNumber + "Int number" + ")")
        db?.execSQL(Create_Contact_Table)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

    companion object {
        private val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Student Account"
        private const val Table_contact = "Table Contact"

        private const val KEY_ID = "ID"
        private const val KEY_Email= "Email"
        private const val Key_Password= "Password"
        private const val Key_PhoneNumber ="PhoneNumber"
    }
}

override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}