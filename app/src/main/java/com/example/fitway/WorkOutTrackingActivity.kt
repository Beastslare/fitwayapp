package com.example.fitway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class WorkOutTrackingActivity : AppCompatActivity() {
    private var exerciseName: String = ""
    private var repetitions: Int = 0
    private var exerciseCount: Int = 0
    lateinit var exercise_name:EditText
    lateinit var repetition:EditText
    lateinit var txexercise_name:TextView
    lateinit var txrepetition:TextView
    lateinit var btn_start:Button
    lateinit var btn_stop:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_out_tracking)
        btn_start.setOnClickListener {
            startTracking()
        }

        btn_stop.setOnClickListener {
            stopTracking()
        }
    }

    private fun startTracking() {
        exerciseName = etExerciseName.text.toString()
        repetitions = etRepetitions.text.toString().toInt()

        // Clear input fields
        etExerciseName.text.clear()
        etRepetitions.text.clear()

        exerciseCount = 0
        updateExerciseCount()

        // Start tracking the workout
        // You can implement the logic to track the workout, update the timer, etc.

    }

    private fun stopTracking() {
        // Stop tracking the workout
        // You can implement the logic to stop the workout, save the data, etc.
    }

    private fun updateExerciseCount() {
        tvExerciseCount.text = exerciseCount.toString()
    }
}
