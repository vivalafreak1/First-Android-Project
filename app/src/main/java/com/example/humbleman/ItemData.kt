package com.example.humbleman

object ItemData {
    private val itemNames = arrayOf(
        "Demon Slayer",
        "Mr.Robot",
        "Love on Mother",
        "Vikings",
        "Josee, the Tiger and the Fish",
        "Aquatope on The White Sand",
        "Vinland Saga",
        "Peaky Blinders",
        "Joker",
        "Tom Clancy's Jack Ryan",
        "Violet Evergarden: Eternity and the Auto Memory Doll",
        "Hypnosis Guidance"
    )
    private val itemDates = arrayOf(
        "2019",
        "2015",
        "2018",
        "2013",
        "2020",
        "2021",
        "2019",
        "2013",
        "2019",
        "2018",
        "2019",
        "2019"
    )

    private val itemImages = intArrayOf(
        R.drawable.demonslayer,
        R.drawable.mrrobot,
        R.drawable.daisuki,
        R.drawable.vikings,
        R.drawable.josee,
        R.drawable.aquatope,
        R.drawable.vinland,
        R.drawable.peaky,
        R.drawable.joker,
        R.drawable.jackryan,
        R.drawable.violet,
        R.drawable.saimin
    )

    private val itemRating = arrayOf(
        "18+",
        "16+",
        "18+",
        "18+",
        "R13+",
        "R13+",
        "R17+",
        "R18+",
        "17+",
        "16+",
        "13+",
        "R18+"
    )

    private val itemGenre = arrayOf(
        "Action",
        "Crime",
        "Slice of Life",
        "Adventure",
        "Drama",
        "Slice of Life",
        "Adventure",
        "Crime",
        "Drama",
        "Action",
        "Drama",
        "Drama"
    )

    private val itemCategory = arrayOf(
        "TV Series",
        "TV Series",
        "TV Series",
        "TV Series",
        "Movie",
        "TV Series",
        "TV Series",
        "TV Series",
        "Movie",
        "TV Series",
        "TV Series",
        "TV Series"
    )

    private val itemDetails = arrayOf(
        "A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly. Tanjiro sets out to become a demon slayer to avenge his family and cure his sister.",
        "Elliot, a brilliant but highly unstable young cyber-security engineer and vigilante hacker, becomes a key figure in a complex game of global dominance when he and his shadowy allies try to take down the corrupt corporation he works for.",
        "Miyuki tries to be the best mother she can for her son, she tries every day to be the shining example of a good mom for her son Yutaka. Yutaka has a friend named Masato who doesn't have the same idea of a good mom in his head and one day makes a move on her\nTaking her at home in the kitchen, in the bathroom, and even while her son is sleeping right next to them, he claims her as his own... Until one day, she is bound and blindfolded and once her blindfold is removed she is shocked to see it is her son that is having sex with her! What kind of horrible mother has she become...?",
        "The adventures of a Ragnar Lothbrok: the greatest hero of his age. The series tells the saga of Ragnar's band of Viking brothers and his family as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods: legend has it that he was a direct descendant of Odin, the god of war and warriors.",
        "Tsuneo is a university student studying biology and in love with the ocean, avidly does recreational diving and working in a diving shop to fulfill his dream of diving abroad. One day an unexpected encounter with Josee, a sullen and demanding disabled young woman will take them through a journey that is compassionate, inspirational, loving, and filled with child-like innocence.",
        "After leaving her idol career behind, Fuuka Miyazawa finds herself on a spontaneous flight to Okinawa instead of returning home to her pity party in Morioka. Bearing a heavy heart and nowhere to go, she aimlessly wanders around the area until she stumbles upon Gama Gama Aquarium—an aging aquarium on the verge of closing down.",
        "Young Thorfinn grew up listening to the stories of old sailors that had traveled the ocean and reached the place of legend, Vinland. It's said to be warm and fertile, a place where there would be no need for fighting—not at all like the frozen village in Iceland where he was born, and certainly not like his current life as a mercenary. War is his home now. Though his father once told him, \"You have no enemies, nobody does. There is nobody who it's okay to hurt,\" as he grew, Thorfinn knew that nothing was further from the truth.",
        "Thomas Shelby and his brothers return to Birmingham after serving in the British Army during WWI. Shelby and the Peaky Blinders, the gang he is leader of, control the city of Birmingham But as Shelby's ambitions extend beyond Birmingham, he plans to build on the business empire he's created, and stop anyone who gets in his way.",
        "Arthur Fleck works as a clown and is an aspiring stand-up comic. He has mental health issues, part of which involves uncontrollable laughter. Times are tough and, due to his issues and occupation, Arthur has an even worse time than most. Over time these issues bear down on him, shaping his actions, making him ultimately take on the persona he is more known as...Joker.",
        "When CIA analyst Jack Ryan stumbles upon a suspicious series of bank transfers his search for answers pulls him from the safety of his desk job and catapults him into a deadly game of cat and mouse throughout Europe and the Middle East, with a rising terrorist figurehead preparing for a massive attack against the US and her allies.",
        "Isabella, the daughter of the noble York family, is enrolled in an all-girls academy to be groomed into a dame worthy of nobility. However, she has given up on her future, seeing the prestigious school as nothing more than a prison from the outside world. Her family notices her struggling in her lessons and decides to hire Violet Evergarden to personally tutor her under the guise of a handmaiden.",
        "Hajime Tanaka possesses powers quite unlike that of other students. Thanks to his hypnotic abilities, he can impose his will upon any individual he comes in contact with. He uses this skill to convince a government official to appoint him as a \"Sex Counsellor.\" Consequently, his word is absolute when it comes to sexual matters. Instituted by his new jurisdiction, every couple must undergo counseling under Hajime's watchful eye before engaging in any form of romantic activity."
    )

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in itemNames.indices) {
                val item = Item()
                item.name = itemNames[position]
                item.category = itemCategory[position]
                item.rating = itemRating[position]
                item.release = itemDates[position]
                item.detail = itemDetails[position]
                item.genre = itemGenre[position]
                item.photo = itemImages[position]
                list.add(item)
            }
            return list
        }
}