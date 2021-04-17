package com.androchef.totellapp.db.entities

import androidx.room.*
import com.androchef.totellapp.db.converters.DateTimeConverters
import java.util.*

/**
 * Developed by Happy on 5/7/19
 */
@Entity
@TypeConverters(DateTimeConverters::class)
data class QrResult(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    @ColumnInfo(name = "result")
    val result: String?,

    @ColumnInfo(name = "result_type")
    val resultType: String ,

    @ColumnInfo(name = "favourite")
    val favourite: Boolean = false,

    @ColumnInfo(name = "time")
    val calendar: Calendar

)