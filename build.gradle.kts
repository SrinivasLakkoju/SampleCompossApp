buildscript {
       // compose_ui_version = '1.3.3'
        val compose_ui_version by extra("1.3.3")

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
  //  id 'com.android.application' version '7.4.0' apply false
  //  id 'com.android.library' version '7.4.0' apply false
  //  id 'org.jetbrains.kotlin.android' version '1.7.0' apply false
  //  id 'com.google.dagger.hilt.android' version '2.43.2' apply false

    id ("com.android.application") version "7.4.0" apply false
    id ("com.android.library") version "7.4.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id ("com.google.dagger.hilt.android") version "2.43.2" apply false
}
