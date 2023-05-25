package com.example.triviaapp2


object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions() {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
            1,
            "Which of these characters was almost added into Super Smash Bros. Melee, but not included as the game was too far in development??",

            "R.O.B",
            "Pit",
            "Meta Knight",
            "Solid Snake",
            4,

        )

        val que2 = Question(
            1,
            "Which of these is not a DLC vehicle in &quot;Mario Kart 8&quot;?",
            "Wild Wiggle",
            "Bone Rattler",
            "Meta Knight",
            "B Dasher",
            1,

            )

    }
}