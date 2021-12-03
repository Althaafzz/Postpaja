package com.althaafridha.postpajaapp.data

import com.althaafridha.postpajaapp.R

object PostData {
    private val postProfileName = arrayOf(
        "maikel_official",
        "mamangre.cing",
        "jhonsonsnnson",
        "sel_real_official",
        "smith.thth",
        "altarpop_es",
        "renoogils"
    )
    private val postImage = intArrayOf(
        R.drawable.post_1,
        R.drawable.post_2,
        R.drawable.post_3,
        R.drawable.post4,
        R.drawable.post_5,
        R.drawable.post_6,
        R.drawable.post_7
    )

    private val profileImage = intArrayOf(
        R.drawable.poto_1,
        R.drawable.poto_2,
        R.drawable.poto_3,
        R.drawable.poto_4,
        R.drawable.poto_5,
        R.drawable.poto_6,
        R.drawable.poto_7
    )

    private val postLocate = arrayOf(
        "Goa",
        "Indonesia",
        "Diluar negri",
        "Disana jauh bgt",
        "Indonesia",
        "USA",
        "Dayeuh"
    )

    private val postCaption = arrayOf(
        "gausah dilike",
        "nggatau mau tulis apa",
        "no capt",
        "p...?!",
        "AWOKAWOKAWOKAWOKAWOKW",
        "brisik mukalu jelek",
        "gabisa ngetik"
    )

    val listPost: ArrayList<Post>
        get() {
            val list = arrayListOf<Post>()
            for (position in postProfileName.indices) {
                val post = Post(
                    name = postProfileName[position],
                    caption = postCaption[position],
                    profileImage = profileImage[position],
                    postImage = postImage[position],
                    location = postLocate[position]
                )
                list.add(post)
            }
            return list
        }
}