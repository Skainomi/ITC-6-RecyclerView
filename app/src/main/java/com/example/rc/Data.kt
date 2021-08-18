package com.example.rc

import android.util.Log

class Data {

    val data = arrayListOf<ArrayList<String>>(
        arrayListOf(
            "Maid",
            "Mori",
            "Xia",
            "Etna",
            "Siska",
            "Amatsuka",
            "Derem",
            "Lumi",
            "Kanna",
            "Mika"
        ),
        arrayListOf(
            "Maidworks",
            "Hololive",
            "Nijisanji",
            "Nijisanji",
            "Nijisanji",
            "Independent",
            "Nijisanji",
            "Maha5",
            "Independent",
            "Nijisanji"
        ),
        arrayListOf(
            "Maid Here!",
            "Mori Here!",
            "Xia Here!",
            "Etna Here!",
            "Siska Here!",
            "Amatsuka Here!",
            "Derem Here!",
            "Lumi Here!",
            "Kanna Here!",
            "Mika Here!"
        ),
        arrayListOf(
            "https://www.youtube.com/channel/UCH9HtS9DEhoskNgnLowVE8A",
            "https://www.youtube.com/channel/UCL_qhgtOy0dy1Agp8vkySQg",
            "https://www.youtube.com/channel/UCoJ0Ct-jdas4cLPpSp06gZg",
            "https://www.youtube.com/channel/UCjFu-9GHnabzSFRAYm1B9Dw",
            "https://www.youtube.com/channel/UC5qSx7KzdRwbsO1QmJc4d-w",
            "https://www.youtube.com/channel/UCdYR5Oyz8Q4g0ZmB4PkTD7g",
            "https://www.youtube.com/channel/UCMzVa7B8UEdrvUGsPmSgyjA",
            "https://www.youtube.com/results?search_query=lumi+maha5",
            "https://www.youtube.com/channel/UChEe0jSUdb2ox9wQFYkByEQ",
            "https://www.youtube.com/channel/UCahgMxSIQ2zIRrPKhM6Mjvg"
        )
    )

    val img = arrayListOf(
        R.drawable.maid,
        R.drawable.mori,
        R.drawable.xia,
        R.drawable.etna,
        R.drawable.siska,
        R.drawable.amatsuka,
        R.drawable.derem,
        R.drawable.lumi,
        R.drawable.kanna,
        R.drawable.mika
    )

    fun getAllData() : ArrayList<User>{
        val userData = arrayListOf<User>()
        for (i in 0 until data[0].size){
            val tempData = arrayListOf<String>()
            for (j in 0 until data.size){
                tempData.add(data[j][i])
            }
            userData.add(User(tempData, img[i]))
        }
        return userData
    }


}