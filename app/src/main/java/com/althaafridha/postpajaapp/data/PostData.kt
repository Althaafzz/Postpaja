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

    private val exploreImage = arrayOf(
        "https://media.istockphoto.com/photos/prize-wheel-picture-id175482570?b=1&k=20&m=175482570&s=170667a&w=0&h=cHDwnCHXxRE5jMtwX-k1Xq4KSrOTJyGIvt91hrOkZqA=",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTL71W2u3jfYvvp2MXCfvVwHoyM-cioxCZkA&usqp=CAU",
        "https://i.pinimg.com/736x/4e/86/ca/4e86caaada11d134b03b6b5bfea9e098.jpg",
        "https://i.pinimg.com/550x/2d/ca/95/2dca95c75d0455f7b405bdd619e66507.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9sy-ivzOe3-CfQ2oVmpLyyx0FeuDWra0igA&usqp=CAU",
        "https://backlightblog.com/images/2020/10/instagram-profile-picture-header-800x524.jpg",
        "https://i.pinimg.com/564x/3f/58/52/3f5852d44be1133abb56d6720510a50f--girly-pictures-display-pictures.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOhzt9x0FHgqOkgouNuG2lWAm8YDvWtDwkNQ&usqp=CAU",
        "https://s2.reutersmedia.net/resources/r/?m=02&d=20210726&t=2&i=1569986856&w=780&fh=&fw=&ll=&pl=&sq=&r=2021-07-26T122115Z_41182_MRPRC2BQO9AW6YH_RTRMADP_0_GREECE-WILDFIRE",
        "https://s2.reutersmedia.net/resources/r/?m=02&d=20210421&t=2&i=1559366844&w=780&fh=&fw=&ll=&pl=&sq=&r=2021-04-21T120013Z_39811_MRPRC2NZM97OWYK_RTRMADP_0_AFGHANISTAN-DAILYLIFE",
        "https://i.guim.co.uk/img/media/af7f50e7d500dd072a1a8a68b4dfbdd7841ea2bc/493_232_3062_1837/master/3062.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=cda8c770367ec8fe71ea2f221ad61595",
        "https://www.corvsport.com/wp-content/uploads/2018/02/C1-Corvette-Picture.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLIySS0D_jSgSTjCJKVIC5rZUjYoBMM1POLA&usqp=CAU",
        "https://media.istockphoto.com/photos/freedom-chains-that-transform-into-birds-charge-concept-picture-id1322104312?b=1&k=20&m=1322104312&s=170667a&w=0&h=VQyPkFkMKmo0e4ixjhiOLjiRs_ZiyKR_4SAsagQQdkk=",
        "https://www.ilmubahasainggris.com/wp-content/uploads/2017/03/NGC.jpg"
    )
}