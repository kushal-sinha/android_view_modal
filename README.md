📱 Android ViewModel + LiveData Sample Project

This is a sample Android application built using Java in Android Studio.
The project demonstrates the use of ViewModel, LiveData, and View Binding for building a clean, lifecycle-aware Android app.

🚀 Features

📌 MVVM Architecture (Model-View-ViewModel)

📌 ViewModel to handle UI-related data in a lifecycle-aware way

📌 LiveData to observe and react to data changes automatically

📌 View Binding for safer and easier interaction with UI components

📌 Clean separation of concerns (UI layer doesn’t directly handle business logic)

🛠️ Tech Stack

Language: Java

Architecture: MVVM (Model-View-ViewModel)

Components Used:

ViewModel

LiveData

View Binding


🔑 How It Works

The ViewModel holds the app data and survives configuration changes (like screen rotations).

LiveData inside the ViewModel automatically notifies the UI when the data changes.

MainActivity observes the LiveData and updates the UI using View Binding.

🎯 Learning Outcomes

Understand the basics of ViewModel in Android.

Learn how LiveData provides reactive updates.

Get hands-on experience with View Binding.

Build a lifecycle-aware Android app using MVVM principles.
