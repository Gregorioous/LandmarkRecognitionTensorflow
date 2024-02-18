package com.example.landmarkrecognitiontensorflow.domain

import android.graphics.Bitmap

interface LandmarkClassifier {
    fun clasify(bitmap: Bitmap, rotation: Int): List<Classification>
}