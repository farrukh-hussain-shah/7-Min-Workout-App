package eu.tutorials.a7_minutesworkoutapp

object Constants {

    fun defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList= ArrayList<ExerciseModel>()


        val luge=ExerciseModel(
            2,"Luge  Exercise",R.drawable.lunge,false,false
        )
        val pushUp=ExerciseModel(
            3,"PushUp Exercise",R.drawable.push_up,false,false
        )
        val sidePlank=ExerciseModel(
            4,"Side Plank Exercise",R.drawable.side_plank,false,false
        )
        val plank=ExerciseModel(
            1,"Plank  Exercise", R.drawable.proneplank,false,false
        )




        exerciseList.add(plank)
        exerciseList.add(pushUp)
        exerciseList.add(sidePlank)
        exerciseList.add(luge)

        return exerciseList
    }

}