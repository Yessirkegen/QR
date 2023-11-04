package com.example.qr

import android.os.Parcel
import android.os.Parcelable

data class Card(val title:String, val image:Int, val secondText: String, val price: String ): Parcelable {
    constructor(parcel: Parcel) : this(

        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {

        p0.writeString(title)
        p0.writeInt(image)
        p0.writeString(secondText)
        p0.writeString(price)

    }

    companion object CREATOR : Parcelable.Creator<Card> {
        override fun createFromParcel(parcel: Parcel): Card {
            return Card(parcel)
        }

        override fun newArray(size: Int): Array<Card?> {
            return arrayOfNulls(size)
        }
    }
}
