package com.example.landmarkrecognitiontensorflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.landmarkrecognitiontensorflow.ui.theme.LandmarkRecognitionTensorflowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LandmarkRecognitionTensorflowTheme {

            }
        }
    }
}

