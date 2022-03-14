package com.example.lawyersapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class LawyersDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Lawyers.db";

    public LawyersDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + LawyersContract.LawyerEntry.TABLE_NAME +"("
            + LawyersContract.LawyerEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + LawyersContract.LawyerEntry.ID + "TEXT NOT NULL,"
            + LawyersContract.LawyerEntry.NAME + "TEXT NOT NULL,"
            + LawyersContract.LawyerEntry.SPECIALITY + "TEXT NOT NULL,"
            + LawyersContract.LawyerEntry.PHONE_NUMBER + "TEXT NOT NULL,"
            + LawyersContract.LawyerEntry.BIO + "TEXT NOT NULL,"
            + LawyersContract.LawyerEntry.AVATAR_URI + "TEXT,"
            + "UNIQUE (" + LawyersContract.LawyerEntry.ID + "))"
        );

    }
    private  void mockData(SQLiteDatabase sqLiteDatabase){
        mockLawyer(sqLiteDatabase, new Lawyer("Carlos Perez", "Penalista", "300 200 11",
                "Gran profesional con experiencia de 5 años en casos penales","carlos_perez.jpg"));
        mockLawyer(sqLiteDatabase, new Lawyer("Daniel Samper","Accidentes de tráfico","111 111",
                "Gran profesional con experiencia de 5 años en accidentes", "daniel_samper.jpg"));
        mockLawyer(sqLiteDatabase, new Lawyer("Marina Acosta", "Familia", "999 111 10",
                "Gran profesional con experiencia de 4 años en temas de familia", "marina_acosta.jpg"));
        mockLawyer(sqLiteDatabase, new Lawyer("Olga Ortiz", "Administración pública", "511 111 11",
                "Gran profesional con experiencia de 10 años en Administración pública", "olga_ortiz.jpg"));
        mockLawyer(sqLiteDatabase, new Lawyer("Maria Botin", "Derecho Internacional", "9333 055 442",
                "Gran profesional con experiencia de 12 años en derecho internacional", "maria_botin.jpg"));

    }

    public void mockLawyer (SQLiteDatabase db, Lawyer lawyer){

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
