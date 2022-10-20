package com.khalifa.flight.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.khalifa.flight.data.local.dao.ViewedFlightsDao
import com.khalifa.flight.domain.entity.FlightDomainEntities


@Database(
    entities = [FlightDomainEntities.FlightDomainItem::class],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun viewedFlightsDao(): ViewedFlightsDao
}

//class Converters {
//    @TypeConverter
//    fun fromString(value: String?): List<String> {
//        val listType = object :
//            TypeToken<ArrayList<String?>?>() {}.type
//        return Gson().fromJson(value, listType)
//    }
//
//    @TypeConverter
//    fun fromList(list: List<String?>?): String {
//        val gson = Gson()
//        return gson.toJson(list)
//    }
//}