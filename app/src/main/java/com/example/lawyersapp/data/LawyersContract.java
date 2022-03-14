package com.example.lawyersapp.data;

import android.provider.BaseColumns;

//ESQUEMA DE LA BASE DE DATOS ABOGADOS
public class LawyersContract {

    public static abstract class LawyerEntry implements BaseColumns{

        public static final String TABLE_NAME = "lawyer";
        public static final String ID = "ID";
        public static final String NAME = "name";
        public static final String SPECIALITY = "spaciality";
        public static final String PHONE_NUMBER = "phoneNumber";
        public static final String AVATAR_URI = "avatarUri";
        public static final String BIO = "bio";

    }
}
