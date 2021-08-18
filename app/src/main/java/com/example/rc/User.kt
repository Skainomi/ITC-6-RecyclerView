package com.example.rc

class User(data: ArrayList<String>, img: Int) {


    private val dataUser = data
    private val imgUser = img

    fun getNama(): String {
        return dataUser[0]
    }

    fun getProducer(): String {
        return dataUser[1]
    }

    fun getPesan(): String {
        return dataUser[2]
    }

    fun getImg(): Int {
        return imgUser
    }

    fun getLink() : String{
        return dataUser[3]
    }

}