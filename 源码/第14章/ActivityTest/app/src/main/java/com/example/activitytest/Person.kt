package com.example.activitytest

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Person(var name: String, var age: Int) : Parcelable

//class Person : Parcelable {
//    var name = ""
//    var age = 0
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(name) // 写出name
//        parcel.writeInt(age) // 写出age
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Person> {
//        override fun createFromParcel(parcel: Parcel): Person {
//            val person = Person()
//            person.name = parcel.readString() ?: "" // 读取name
//            person.age = parcel.readInt() // 读取age
//            return person
//        }
//
//        override fun newArray(size: Int): Array<Person?> {
//            return arrayOfNulls(size)
//        }
//    }
//}